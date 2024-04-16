package com.ExemploDto.ExemploDto.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ExemploDto.ExemploDto.DTO.UserDTO;
import com.ExemploDto.ExemploDto.Model.User;
import com.ExemploDto.ExemploDto.Repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;

	@Transactional
	public UserDTO findById(Long id) {
		User entity = repository.findById(id).get();
		UserDTO dto = new UserDTO(entity);
		return dto;
	}
}
