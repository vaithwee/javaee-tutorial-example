package xyz.vaith.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import xyz.vaith.domain.User;

public interface UserMapper {
    @Select("SELECT * FROM `tb_user` WHERE `loginname` = #{loginname} and `password` = #{password}")
    User findWithLoginNameAndPassword(@Param("loginname") String loginname, @Param("password") String password);
}
