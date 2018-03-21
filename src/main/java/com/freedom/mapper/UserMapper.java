package com.freedom.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.freedom.entity.User;

@Mapper
public interface UserMapper {
	
	@Select("SELECT * FROM T_USER WHERE userId=#{userId}")
	User selectByPrimaryKey(@Param("userId") Integer userId);
	
	
	
	@Select("SELECT * FROM T_USER")
	List<User> selectAllUsers();
	
	

}
