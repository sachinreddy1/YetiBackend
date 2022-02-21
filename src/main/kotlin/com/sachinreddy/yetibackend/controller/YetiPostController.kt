package com.sachinreddy.yetibackend.controller

import com.sachinreddy.yetibackend.model.YetiPost
import com.sachinreddy.yetibackend.service.YetiPostService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("v1/posts")
class YetiPostController @Autowired constructor(
    private val yetiPostService: YetiPostService
) {
    @GetMapping
    fun getPosts(): List<YetiPost> {
        return yetiPostService.getPosts()
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun addPost(@RequestBody post: YetiPost): List<YetiPost> {
        return yetiPostService.addPost(post)
    }
}