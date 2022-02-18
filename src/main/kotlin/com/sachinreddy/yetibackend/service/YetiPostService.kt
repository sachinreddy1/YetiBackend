package com.sachinreddy.yetibackend.service

import com.sachinreddy.yetibackend.dao.YetiPostDao
import com.sachinreddy.yetibackend.model.YetiPost
import org.springframework.stereotype.Service

@Service
class YetiPostService(private val yetiPostDao: YetiPostDao) {
    fun addPost(post: YetiPost): Int {
        return yetiPostDao.insertPost(post)
    }
}