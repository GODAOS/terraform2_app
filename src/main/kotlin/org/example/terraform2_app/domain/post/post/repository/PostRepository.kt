package org.example.terraform2_app.domain.post.post.repository

import org.example.terraform2_app.domain.post.post.entity.Post
import org.springframework.data.jpa.repository.JpaRepository

interface PostRepository : JpaRepository<Post, Long>