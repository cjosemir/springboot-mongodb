package com.josemircosta.workshopspringbootmongo.reposity;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.josemircosta.workshopspringbootmongo.domain.User;

@Repository
public interface UserReposity extends MongoRepository<User, String>{

}
