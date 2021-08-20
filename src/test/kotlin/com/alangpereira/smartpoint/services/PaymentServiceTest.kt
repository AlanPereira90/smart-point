package com.alangpereira.smartpoint.services

import com.alangpereira.smartpoint.documents.Payment
import com.alangpereira.smartpoint.enums.TypeEnum
import com.alangpereira.smartpoint.repositories.PaymentRepository
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.BDDMockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.data.mongo.AutoConfigureDataMongo
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageImpl
import org.springframework.data.domain.PageRequest
import org.springframework.test.context.ActiveProfiles
import java.util.*
import kotlin.jvm.Throws

@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureDataMongo
class PaymentServiceTest {
    @Autowired
    val paymentService: PaymentService? = null

    @MockBean
    val paymentRepository: PaymentRepository? = null

    val employeeId = "1"
    val id = "1"

    @BeforeEach
    @Throws
    fun setUp() {
        BDDMockito
            .given<Page<Payment>>(paymentRepository?.findByEmployeeId(id, PageRequest.of(0, 10)))
            .willReturn(PageImpl(ArrayList<Payment>()))
        BDDMockito.given(paymentRepository?.save(payment())).willReturn(payment())
    }

    @Test
    fun testPaymentByEmployeeId() {
        val payment: Page<Payment>? = paymentService?.findByEmployeeId(employeeId, PageRequest.of(0, 10))
        Assertions.assertNotNull(payment)
    }

    @Test
    fun testPersist() {
        val payment: Payment? = paymentService?.persist(payment())
        Assertions.assertNotNull(payment)
    }


    private fun payment(): Payment = Payment(Date(), TypeEnum.START_WORK, "1")
}