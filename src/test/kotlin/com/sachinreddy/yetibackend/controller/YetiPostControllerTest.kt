package com.sachinreddy.yetibackend.controller

import com.fasterxml.jackson.databind.ObjectMapper
import com.sachinreddy.yetibackend.model.YetiPost
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get
import org.springframework.test.web.servlet.post
import java.util.*

@SpringBootTest
@AutoConfigureMockMvc
internal class YetiPostControllerTest @Autowired constructor(
    val mockMvc: MockMvc,
    val objectMapper: ObjectMapper
){
    val baseUrl = "/v1/posts"

    @Test
    fun `should return all posts`() {
        // when
        val posts = mockMvc.get(baseUrl)
            .andDo { print() }
            .andExpect {
                status { isOk()}
                content { contentType(MediaType.APPLICATION_JSON) }

            }
    }

    @Test
    fun `should add a post`() {
        // given
        val newPost = YetiPost(UUID.randomUUID(), "test", 3, "")

        // when
        val performPost = mockMvc.post(baseUrl) {
            contentType = MediaType.APPLICATION_JSON
            content = objectMapper.writeValueAsString(newPost)
        }

        // then
        performPost
            .andDo { print() }
                .andExpect {
                    status { isCreated() }
                    content { contentType(MediaType.APPLICATION_JSON) }
                }
    }
}