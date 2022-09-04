package com.prodapt.userapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prodapt.userapp.entity.UserDetails;
import com.prodapt.userapp.repository.UserDetailRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	private UserDetailRepository userDetailsRepo;
	@Override
	public UserDetails addUser(UserDetails userDetails) {
		
		return userDetailsRepo.save(userDetails);
	}

	@Override
	public UserDetails getUserById(Long id) {
		Optional<UserDetails> userDetails = userDetailsRepo.findById(id);
		if(userDetails.isPresent()) {
			return userDetails.get();
		}
		return null;
	}

	@Override
	public UserDetails updateUser(UserDetails userDetails) {
		if(userDetailsRepo.existsById(userDetails.getId())) {
			userDetailsRepo.save(userDetails);
		}
		return userDetails;
	}

	@Override
	public void deleteUserById(Long id) {
		userDetailsRepo.deleteById(id);
}
}