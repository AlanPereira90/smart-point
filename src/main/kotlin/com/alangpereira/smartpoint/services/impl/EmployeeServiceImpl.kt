package com.alangpereira.smartpoint.services.impl

import com.alangpereira.smartpoint.documents.Employee
import com.alangpereira.smartpoint.repositories.EmployeeRepository
import org.springframework.stereotype.Service
import com.alangpereira.smartpoint.services.EmployeeService as EmployeeService

@Service
class EmployeeServiceImpl(val employeeRepository: EmployeeRepository) : EmployeeService {
    override fun persist(employee: Employee): Employee = employeeRepository.save(employee)

    override fun findByDocument(document: String): Employee? = employeeRepository.findByDocument(document)

    override fun findByEmail(email: String): Employee? = employeeRepository.findByEmail(email)
}