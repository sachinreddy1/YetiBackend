package com.sachinreddy.yetibackend.controller

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@SpringBootTest
@AutoConfigureMockMvc
internal class YetiPostControllerTest {
    @Autowired
    lateinit var mockMvc: MockMvc

    @Test
    fun `should return all posts`() {
        // when
        mockMvc.get("/posts")
            .andDo { print() }
            .andExpect {
                status { isOk()}
                content { contentType(MediaType.APPLICATION_JSON) }

            }



    }
}