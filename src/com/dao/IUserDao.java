package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.entity.User;

public interface IUserDao {
	//根据id获取用户信息
	@Select("select * from users where id=#{id}")
	public User getUserById(Integer id);

	//获取全部用户信息
	@Select("select * from users")
	public List<User> getAllUser();
	
	//根据id删除用户信息
	@Delete("delete from users where id=#{id}")
	public Integer deleteUserById(Integer id);
	
	//根据id修改用户信息
	@Update("update users set address=#{address} where id=#{id}")
	public Integer updateUserById(User user);
	
	//新增用户信息
	@Insert("insert into users(ID,NAME,AGE,ADDRESS) values(#{id},#{name},#{age},#{address})")
	public Integer insertUser(User user);
}
