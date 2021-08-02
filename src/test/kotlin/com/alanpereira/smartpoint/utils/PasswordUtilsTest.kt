package com.alanpereira.smartpoint.utils

import com.alangpereira.smartpoint.utils.PasswordUtils
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

class PasswordUtilsTest {
    private val password = "123456"
    private val encoder = BCryptPasswordEncoder()

    @Test
    fun testCrypt() {
        val hash = PasswordUtils().crypt(password)
        Assertions.assertTrue(encoder.matches(password, hash))
    }
}