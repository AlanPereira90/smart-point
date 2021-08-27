package com.alangpereira.smartpoint.dtos

data class CompanyDto (
    val name: String,
    val document: String,
    val id: String? = null
)