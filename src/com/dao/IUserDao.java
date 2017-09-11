package com.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.entity.User;

public interface IUserDao {
	//����id��ȡ�û���Ϣ
	@Select("select * from users where id=#{id}")
	public User getUserById(Integer id);

	//��ȡȫ���û���Ϣ
	@Select("select * from users")
	public List<User> getAllUser();
	
	//����idɾ���û���Ϣ
	@Delete("delete from users where id=#{id}")
	public Integer deleteUserById(Integer id);
	
	//����id�޸��û���Ϣ
	@Update("update users set address=#{address} where id=#{id}")
	public Integer updateUserById(User user);
	
	//�����û���Ϣ
	@Insert("insert into users(ID,NAME,AGE,ADDRESS) values(#{id},#{name},#{age},#{address})")
	public Integer insertUser(User user);
}
