package com.alangpereira.smartpoint.dtos

import org.hibernate.validator.constraints.Length
import org.hibernate.validator.constraints.br.CNPJ
import org.hibernate.validator.constraints.br.CPF
import javax.validation.constraints.Email
import javax.validation.constraints.NotEmpty

data class CompanyRegistrationDto (

    @get:NotEmpty(message = "Name can't be empty")
    @get:Length(min = 3, max = 200, message = "Name must contain between 3 and 200 characters")
    val name: String = "",

    @get:NotEmpty(message = "Email can't be empty")
    @get:Length(min = 5, max = 200, message = "Email must contain between 5 and 200 characters")
    @get:Email(message="Invalid email")
    val email: String = "",

    @get:NotEmpty(message = "Password can't be empty")
    val password: String = "",

    @get:NotEmpty(message = "Document can't be empty")
    @get:CPF(message="Invalid document")
    val cpf_document: String = "",

    @get:NotEmpty(message = "CNPJ can't be empty")
    @get:CNPJ(message="Invalid CNPJ")
    val cnpj_document: String = "",

    @get:NotEmpty(message = "CompanyName social can't be empty")
    @get:Length(min = 5, max = 200, message = "CompanyName must contain between 5 and 200 characters")
    val companyName: String = "",

    val id: String? = null
)