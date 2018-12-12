package cn.jt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.jt.pojo.User;
import cn.jt.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userservice;
	@RequestMapping("/user/findAll")
	public List<User> findAll(){
		return userservice.findAll();
	}
	@RequestMapping("user/find/{name}")
	public List<User> find(@PathVariable String name){
		User user = new User();
		user.setName(name);
		return userservice.find(user);
	}
     @RequestMapping("user/insert/{name}/{birthday}/{address}")
	public String insert(User user) {
		try {
			userservice.insert(user);
			return "新城成功";
		} catch (Exception e) {
			e.printStackTrace();
			 return "新增失败";
		}
	}
     
     @RequestMapping("user/update/{name}/{birthday}/{address}/{id}")
     public String update(User user) {
    	 try {
    		 
			int a = userservice.update(user);
			if(a!=0) {
				return "修改成功";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
    	 return "修改失败";
     }
     
     @RequestMapping("user/delete/{id}")
     public String delete(@PathVariable Long id) {
    	 
    	 try {
			userservice.delete(id);
			return "delete success";
		} catch (Exception e) {
			e.printStackTrace();
		}
    	 return "删除失败";
     }
}
