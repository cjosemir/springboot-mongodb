package com.josemircosta.workshopspringbootmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.josemircosta.workshopspringbootmongo.domain.User;
import com.josemircosta.workshopspringbootmongo.reposity.UserReposity;

@Service
public class UserService {
	
	
	@Autowired
	private UserReposity repo;

	public List<User> findAll(){
		return repo.findAll();
	}
}
