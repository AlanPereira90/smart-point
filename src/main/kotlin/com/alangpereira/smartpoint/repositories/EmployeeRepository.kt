package com.alangpereira.smartpoint.repositories

import com.alangpereira.smartpoint.documents.Employee
import org.springframework.data.mongodb.repository.MongoRepository

interface EmployeeRepository : MongoRepository<Employee, String> {
    fun findByEmail(email: String): Employee?
    fun findByDocument(document: String): Employee?
}