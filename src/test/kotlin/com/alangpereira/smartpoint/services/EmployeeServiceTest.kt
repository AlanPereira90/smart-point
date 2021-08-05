package com.alangpereira.smartpoint.services

import com.alangpereira.smartpoint.documents.Employee
import com.alangpereira.smartpoint.enums.ProfileEnum
import com.alangpereira.smartpoint.repositories.EmployeeRepository
import com.alangpereira.smartpoint.services.EmployeeService
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.data.mongo.AutoConfigureDataMongo
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.ActiveProfiles
import kotlin.jvm.Throws
import org.mockito.BDDMockito


@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureDataMongo
class EmployeeServiceTest {
    @Autowired
    val employeeService: EmployeeService? = null

    @MockBean
    private val employeeRepository: EmployeeRepository? = null

    private val document: String = "11111111111111"
    private val email: String = "test@test.com"
    private val id: String = "1"

    @BeforeEach
    @Throws
    fun setUp() {
        BDDMockito.given(employeeRepository?.findByDocument(document)).willReturn(employee())
        BDDMockito.given(employeeRepository?.findByEmail(email)).willReturn(employee())
        BDDMockito.given(employeeRepository?.save(employee())).willReturn(employee())
    }

    @Test
    fun testFindByDocument() {
        val employee = employeeService?.findByDocument(document)
        Assertions.assertNotNull(employee)
        Assertions.assertEquals(employee, employee())
    }

    @Test
    fun testFindByEmail() {
        val employee = employeeService?.findByEmail(email)
        Assertions.assertNotNull(employee)
        Assertions.assertEquals(employee, employee())
    }

    @Test
    fun testPersist() {
        val employee = employeeService?.persist(employee())
        Assertions.assertNotNull(employee)
        Assertions.assertEquals(employee, employee())
    }

    private fun employee(): Employee = Employee(
        "Teste",
        email,
        "1234",
        document,
        ProfileEnum.ROLE_ADMIN,
        "1"
    )
}