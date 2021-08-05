package com.alangpereira.smartpoint.services

import com.alangpereira.smartpoint.documents.Company
import com.alangpereira.smartpoint.repositories.CompanyRepository
import com.alangpereira.smartpoint.services.CompanyService
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.BDDMockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.data.mongo.AutoConfigureDataMongo
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.ActiveProfiles

@SpringBootTest
@ActiveProfiles("test")
@AutoConfigureDataMongo
class CompanyServiceTest {
    @Autowired
    val companyService: CompanyService? = null

    @MockBean
    private val companyRepository: CompanyRepository? = null

    private val document = "11111111111111"

    @BeforeEach
    @Throws(Exception::class)
    fun setUp() {
        BDDMockito.given(companyRepository?.findByDocument(document)).willReturn(company())
        BDDMockito.given(companyRepository?.save(company())).willReturn(company())
    }

    @Test
    fun findByDocument() {
        val company: Company? = companyService?.findByDocument(document)
        Assertions.assertNotNull(company)
        Assertions.assertEquals(company(), company)
    }

    @Test
    fun testPersist() {
        val company: Company? = companyService?.persist(company())
        Assertions.assertNotNull((company))
        Assertions.assertEquals(company(), company)
    }

    private fun company(): Company = Company( "Razão Social", document, "1" )
}