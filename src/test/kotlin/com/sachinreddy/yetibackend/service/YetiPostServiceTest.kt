package com.sachinreddy.yetibackend.service

import com.sachinreddy.yetibackend.dao.YetiPostDao
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

internal class YetiPostServiceTest {
    private val dataSource: YetiPostDao = mockk(relaxed = true)
    private val postService = YetiPostService(dataSource)

    @Test
    fun `should call data source to receive banks`() {
        // given

        // when
        postService.getPosts()

        // then
        verify(exactly = 1) { dataSource.getPosts() }
    }
}