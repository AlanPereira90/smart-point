package com.alangpereira.smartpoint.services

import com.alangpereira.smartpoint.documents.Company

interface CompanyService {
    fun findByDocument(document: String): Company?
    fun persist(company: Company): Company
}