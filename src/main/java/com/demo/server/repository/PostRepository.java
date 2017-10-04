package com.demo.server.repository;


import com.demo.server.domain.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface PostRepository extends CrudRepository<Post, Long> {
}
