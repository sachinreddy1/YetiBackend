package com.sachinreddy.yetibackend.service

import com.sachinreddy.yetibackend.dao.YetiPostDao
import com.sachinreddy.yetibackend.model.YetiPost
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class YetiPostService @Autowired constructor(
    private val yetiPostDao: YetiPostDao
) {
    fun getPosts(): List<YetiPost> {
        return yetiPostDao.getPosts()
    }

    fun addPost(post: YetiPost): List<YetiPost> {
        return yetiPostDao.addPerson(post)
    }
}