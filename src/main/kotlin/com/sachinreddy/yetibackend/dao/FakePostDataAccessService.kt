package com.sachinreddy.yetibackend.dao

import com.sachinreddy.yetibackend.model.YetiPost
import org.springframework.stereotype.Repository
import java.util.*
import kotlin.collections.ArrayList

@Repository
class FakePostDataAccessService: YetiPostDao {
    private val DB: MutableList<YetiPost> = mutableListOf()

    override fun insertPost(id: UUID, post: YetiPost): Int {
        DB.add(YetiPost(id, post.userName, post.numLikes, post.imageURI))
        return 1
    }
}