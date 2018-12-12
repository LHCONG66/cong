package cn.jt.service;

import java.util.List;

import cn.jt.pojo.User;

public interface UserService {
	public List<User> findAll();
	public List<User> find(User user);
	public void insert(User user);
	public int update(User user);
	public void delete(Long id);
}
