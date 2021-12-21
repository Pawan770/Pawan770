package com.oodles.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.oodles.model.UserDetails;
import com.oodles.repository.UserDetailsRepository;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService {
	@Autowired
private UserDetailsRepository userRepo;
	public UserDetails addUser(UserDetails user) {
		return userRepo.save(user);
	}
	public List<UserDetails> addUsers(List<UserDetails> user) {
		return userRepo.saveAll(user);
	}
	public  UserDetails getUserById(int id){
		return userRepo.findById(id).orElse(null);
	}
	
	public  List<UserDetails> getUsers() {
		return userRepo.findAll();
	}
  
	public String deleteuserById(int id) {
		 userRepo.deleteById(id);
		 return"Record deleted:"+id;
	}
	public  UserDetails updateUser(UserDetails user){
		//UserDetails users=userRepo.findById(user.getId()).orElse(null);
		UserDetails users=userRepo.findById(user.getId()).orElse(user);
		users.setFullName(user.getFullName());
		users.setId(user.getId());
		users.setAddress(user.getAddress());
		users.setCity(user.getCity());
		users.setEmail(user.getEmail());
		users.setPhoneNumber(user.getPhoneNumber());
		users.setUserName(user.getUserName());
		users.setState(user.getState());
		users.setZipCode(user.getZipCode());
		users.setAboutMe(user.getAboutMe());
		return userRepo.save(users);
		 }
}
