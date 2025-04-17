package org.example.terraform2_app.domain.post.post.service

import org.example.terraform2_app.domain.post.post.entity.Post
import org.example.terraform2_app.domain.post.post.repository.PostRepository
import org.springframework.stereotype.Service

@Service
class PostService(
    private val postRepository: PostRepository
) {
    fun count() = postRepository.count()

    fun write(title: String, content: String): Post {
        return postRepository.save(Post(title = title, content = content))
    }

    fun findAll() = postRepository.findAll()
}