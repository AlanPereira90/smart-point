package com.alangpereira.smartpoint.repositories

import com.alangpereira.smartpoint.documents.Payment
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.repository.MongoRepository

interface PaymentRepository : MongoRepository<Payment, String> {
    fun findByEmployeeId(employeeId: String, pageable: Pageable): Page<Payment>
}