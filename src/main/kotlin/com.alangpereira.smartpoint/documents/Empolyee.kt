package com.alangpereira.documents

import com.alangpereira.enums.ProfileEnum
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Employee (
  val name: String,
  val email: String,
  val password: String,
  val document: String,
  val profile: ProfileEnum,
  val companyId: String,
  val valueHour: Double? = 0.0,
  val hoursPerDay: Float? = 0.0f,
  val hoursToLunch: Float? = 0.0f, 
  @Id val id: String? = null
)