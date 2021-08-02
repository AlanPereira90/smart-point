package com.alangpereira.smartpoint.documents

import com.alangpereira.smartpoint.enums.TypeEnum
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*

@Document
data class Posting (
  val date: Date, 
  val type: TypeEnum,
  val employeeId: String,
  val description: String? = "",
  val localization: String? = "",
  @Id val id: String? = null
)