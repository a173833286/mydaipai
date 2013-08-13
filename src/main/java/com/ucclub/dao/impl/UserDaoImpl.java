package com.ucclub.dao.impl;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.ucclub.dao.UserDao;
import com.ucclub.model.UserModel;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao{
	


	@SuppressWarnings("unchecked")
	@Override
	public List<UserModel> getListObject(Map<String, Object> m) {
		// TODO Auto-generated method stub

		return 		this.getSqlSession().selectList("getListObject", m);
	}

	@Override
	public boolean updateObject(UserModel t) {
		// TODO Auto-generated method stub
		final int row1=this.getSqlSession().update("updateObject", t);
		if(row1==1){
			return true;
		}
		return false;
	}

	@Override
	public boolean saveObject(UserModel t) {
		// TODO Auto-generated method stub
		final int row1=this.getSqlSession().insert("saveObject", t);
		if(row1==1){
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteObject(Integer p) {
		// TODO Auto-generated method stub
		final int row1=this.getSqlSession().delete("deleteObject", p);
		if(row1==1){
			return true;
		}
		return false;
	}

	@Override
	public UserModel getObect(Integer p) {
		// TODO Auto-generated method stub
		return (UserModel) this.getSqlSession().selectOne("getObect", p);
	}

}
