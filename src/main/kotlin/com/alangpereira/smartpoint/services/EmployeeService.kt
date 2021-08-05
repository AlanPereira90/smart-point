package com.alangpereira.smartpoint.services

import com.alangpereira.smartpoint.documents.Employee

interface EmployeeService {
    fun persist(employee: Employee): Employee
    fun findByDocument(document: String): Employee?
    fun findByEmail(email: String): Employee?
}