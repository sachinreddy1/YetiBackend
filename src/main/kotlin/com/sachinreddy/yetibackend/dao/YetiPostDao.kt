package com.sachinreddy.yetibackend.dao

import com.sachinreddy.yetibackend.model.YetiPost
import java.util.UUID

interface YetiPostDao {
    fun getPosts(): List<YetiPost>

    fun insertPost(id: UUID, post: YetiPost): List<YetiPost>

    fun addPerson(post: YetiPost): List<YetiPost> {
        val id = UUID.randomUUID()
        return insertPost(id, post)
    }
}