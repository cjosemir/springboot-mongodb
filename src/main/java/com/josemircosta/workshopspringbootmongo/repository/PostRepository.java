package com.josemircosta.workshopspringbootmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.josemircosta.workshopspringbootmongo.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
