package com.sachinreddy.yetibackend.dao

import com.sachinreddy.yetibackend.model.YetiPost
import java.util.*

interface YetiPostDao {
    fun insertPost(int: UUID, post: YetiPost): Int

    fun insertPost(post: YetiPost): Int {
        val id: UUID = UUID.randomUUID()
        return insertPost(id, post)
    }
}