package com.alangpereira.smartpoint.services.impl

import com.alangpereira.smartpoint.documents.Company
import com.alangpereira.smartpoint.repositories.CompanyRepository
import com.alangpereira.smartpoint.services.CompanyService
import org.springframework.stereotype.Service

@Service
class CompanyServiceImpl(val companyRepository: CompanyRepository) : CompanyService {
    override fun findByDocument(document: String) = companyRepository.findByDocument(document)

    override fun persist(company: Company) = companyRepository.save(company)
}