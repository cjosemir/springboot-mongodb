package com.josemircosta.workshopspringbootmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.josemircosta.workshopspringbootmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
