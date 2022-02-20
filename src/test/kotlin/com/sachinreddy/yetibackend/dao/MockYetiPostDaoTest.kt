package com.sachinreddy.yetibackend.dao

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MockYetiPostDaoTest {
    private val mockYetiPostDao = MockYetiPostDao()

    @Test
    fun `should provide a list of yeti posts`() {
        //given

        //when
        val posts = mockYetiPostDao.getPosts()

        // then
        assertThat(posts).isNotEmpty
    }

    @Test
    fun `should provide some mock data`() {
        //given

        //when
        val posts = mockYetiPostDao.getPosts()

        // then
        assertThat(posts).allMatch {
            it.userName.isNotBlank()
        }
    }
}