package com.alangpereira.smartpoint.services

import com.alangpereira.smartpoint.documents.Payment
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest

interface PaymentService {
    fun findByEmployeeId(employeeId: String, pageRequest: PageRequest): Page<Payment>
    fun persist(payment: Payment): Payment
    fun remove(id: String)
}