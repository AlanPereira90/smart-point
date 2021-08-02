package com.alangpereira.smartpoint.repositories

import com.alangpereira.smartpoint.documents.Company
import org.springframework.data.mongodb.repository.MongoRepository

interface CompanyRepository : MongoRepository<Company, String> {
    fun findByDocument(document: String): Company?
}