package com.alangpereira.smartpoint.utils

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

class PasswordUtils {
    fun crypt(password: String): String = BCryptPasswordEncoder().encode(password)
}