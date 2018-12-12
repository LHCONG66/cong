package cn.jt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.jt.feign.UserFeign;
import cn.jt.pojo.User;

@RestController
public class UserController {
	@Autowired
	private UserFeign userfeign;
	@RequestMapping("user/findAll")
	public List<User> findAll(){
		return userfeign.findAll();
	}
	
	@RequestMapping("user/find/{name}")
	public List<User> find(@PathVariable String name){
		return userfeign.find(name);	
	}
	
	@RequestMapping("user/insert/{name}/{birthday}/{address}")
	public String insert(@PathVariable String name,
			            @PathVariable String birthday,
			            @PathVariable String address) {
		return userfeign.insert(name, birthday, address);
	}
	
	@RequestMapping("/user/update/{name}/{birthday}/{address}/{id}")
	public String update(@PathVariable String name, 
			@PathVariable String birthday, 
			@PathVariable  String address,
			@PathVariable Long id) {
		return userfeign.update(name, birthday, address, id);
	}
	
	
	@RequestMapping("/user/delete/{id}")
	public String delete(@PathVariable Long id) {
	return userfeign.delete(id);
	}
}
