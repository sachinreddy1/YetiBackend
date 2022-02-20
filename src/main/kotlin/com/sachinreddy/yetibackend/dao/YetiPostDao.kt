package com.sachinreddy.yetibackend.dao

import com.sachinreddy.yetibackend.model.YetiPost

interface YetiPostDao {
    fun getPosts(): List<YetiPost>
}