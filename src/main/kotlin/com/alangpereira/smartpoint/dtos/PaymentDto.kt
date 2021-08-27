package com.alangpereira.smartpoint.dtos

import javax.validation.constraints.NotEmpty

data class PaymentDto (
    @get:NotEmpty(message = "Date can't be empty")
    val date: String? = null,

    @get:NotEmpty(message = "Type can't be empty")
    val type: String? = null,

    val employeeId: String? = null,
    val description: String? = null,
    val localization: String? = null,
    val id: String? = null
)