package com.alangpereira.smartpoint.documents

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Company (
  val companyName: String,
  val companyDocument: String,
  @Id val id: String? = null
)