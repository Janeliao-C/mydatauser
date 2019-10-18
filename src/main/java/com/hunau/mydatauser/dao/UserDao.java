package com.hunau.mydatauser.dao;

import com.hunau.mydatauser.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import java.util.List;

@Mapper
@Repository
public interface UserDao {
    @Select("select id,name,pwd,sexy,birthday,age,isuse from tb_user where name like'%${value}%'")
        //@Transactional(readOnly = true)
    List<User> findBy(String name);

    @Select("select id,name,pwd,sexy,birthday,age,isuse from tb_user where id=#{id}")
    User selectUser(int id);
}
