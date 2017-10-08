package cn.itcast.core.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.core.mapper.UserMapper;
import cn.itcast.core.pojo.User;
import cn.itcast.core.service.UserService;
@Service
@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper userMapper;

	@Override
	public void save(User user) {
		userMapper.save(user);
		
	}
	

}
