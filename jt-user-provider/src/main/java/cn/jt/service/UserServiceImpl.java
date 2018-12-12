package cn.jt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;

import cn.jt.mapper.UserMapper;
import cn.jt.pojo.User;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserMapper usermapper;
	
  public List<User> findAll(){
	  return usermapper.selectList(null);
  }
  
  //按条件查询
  public List<User> find(User user){
	  //处理where orderby，group by这种方式QBC
	  EntityWrapper<User> entityWrapper = new EntityWrapper<User>();
	//MP有自己语法规则，条件里使用字段名称，{0}参数，第一个参数
	  entityWrapper.where("name like {0}","%"+ user.getName()+"%");
	  //设置where条件
	  return usermapper.selectList(entityWrapper);
  }
  
  public void insert(User user) {
	  usermapper.insert(user);
  }
  
  public int update(User user) {
	//封装where id=?
	  EntityWrapper<User> wrapper = new EntityWrapper<User>();
	  wrapper.where("id = {0}", user.getId());
	  int a = usermapper.update(user, wrapper);
	  return a;
  }
  
  public void delete(Long id) {
	  
	  usermapper.deleteById(id);
  }
}
