package com.sachinreddy.yetibackend.dao

import com.sachinreddy.yetibackend.model.YetiPost
import org.springframework.stereotype.Repository
import java.util.*

@Repository
class MockYetiPostDao: YetiPostDao {
    private val posts = mutableListOf(
        YetiPost(UUID.randomUUID(), "sachinreddy", 3, "")
    )

    override fun getPosts(): List<YetiPost> {
        return posts
    }

    override fun insertPost(id: UUID, post: YetiPost): List<YetiPost> {
        posts.add(YetiPost(id, post.userName, post.numLikes, post.imageURI))
        return posts
    }
}