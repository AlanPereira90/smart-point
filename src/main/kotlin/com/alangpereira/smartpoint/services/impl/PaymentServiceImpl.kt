package com.alangpereira.smartpoint.services.impl

import com.alangpereira.smartpoint.documents.Payment
import com.alangpereira.smartpoint.repositories.PaymentRepository
import com.alangpereira.smartpoint.services.PaymentService
import org.springframework.data.domain.Page
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service

@Service
class PaymentServiceImpl(val paymentRepository: PaymentRepository) : PaymentService {
    override fun findByEmployeeId(employeeId: String, pageRequest: PageRequest) =
        paymentRepository.findByEmployeeId(employeeId, pageRequest)

    override fun persist(payment: Payment) = paymentRepository.save(payment)

    override fun remove(id: String) = paymentRepository.deleteById(id)
}