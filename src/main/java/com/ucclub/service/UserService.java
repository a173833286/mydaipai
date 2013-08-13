package com.ucclub.service;

import com.ucclub.model.UserModel;

public interface UserService {
  
	public void insertUser(UserModel um);
	public void getUser(Integer id);
	public void getAllUser();
}
