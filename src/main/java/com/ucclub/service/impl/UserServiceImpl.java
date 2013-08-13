package com.ucclub.service.impl;

import java.lang.annotation.Target;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ucclub.dao.UserDao;
import com.ucclub.model.UserModel;
import com.ucclub.service.UserService;
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
    private UserDao userDao;
	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.SERIALIZABLE)
	public void insertUser(UserModel um) {
		// TODO Auto-generated method stub
		userDao.saveObject(um);
	}

	@Override
	@Transactional(propagation=Propagation.NEVER,isolation=Isolation.READ_COMMITTED)
	public void getUser(Integer id) {
		// TODO Auto-generated method stub
		userDao.getObect(id);
	}

	@Override
	@Transactional(propagation=Propagation.NEVER,isolation=Isolation.READ_COMMITTED)
	public void getAllUser() {
		// TODO Auto-generated method stub
		userDao.getListObject(null);
	}

}
