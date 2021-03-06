package xyz.vaith.mapper;

import org.apache.ibatis.annotations.*;
import xyz.vaith.domain.User;
import xyz.vaith.sql.UserDynamicSqlProvider;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    @Insert("INSERT INTO `tb_user` (`name`, `sex`, `age`) VALUES (#{name}, #{sex}, #{age})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int save(User user);

    @Delete("DELETE FROM `tb_user` WHERE `id` = #{id}")
    int removeUser(@Param("id") Integer id);

    @Update("UPDATE `tb_user` SET `name` = #{name}, `sex` = #{sex}, `age` = #{age} WHERE `id` = #{id}")
    void modifyUser(User user);

    @Select("SELECT * FROM `tb_user` WHERE `id` = #{id}")
    @Results({
            @Result(id = true, column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "sex", property = "sex"),
            @Result(column = "age", property = "age")
    })
    User selectUserById(Integer id);

    @Select("SELECT * FROM `tb_user`")
    List<User> selectAllUser();

    @SelectProvider(type = UserDynamicSqlProvider.class, method = "selectWithParam")
    List<User> selectByDynamicSql(Map<String, Object> param);

}
