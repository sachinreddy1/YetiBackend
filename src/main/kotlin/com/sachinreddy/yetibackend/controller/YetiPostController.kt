package com.sachinreddy.yetibackend.controller

import com.sachinreddy.yetibackend.model.YetiPost
import com.sachinreddy.yetibackend.service.YetiPostService

class YetiPostController(private val yetiPostService: YetiPostService) {
    fun addPost(post: YetiPost) {
        yetiPostService.addPost(post)
    }
}