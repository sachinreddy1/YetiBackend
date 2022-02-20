package com.sachinreddy.yetibackend.controller

import com.sachinreddy.yetibackend.model.YetiPost
import com.sachinreddy.yetibackend.service.YetiPostService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("posts")
class YetiPostController(private val yetiPostService: YetiPostService) {
    @GetMapping
    fun getPosts(): List<YetiPost> {
        return yetiPostService.getPosts()
    }
}