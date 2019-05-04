package xyz.vaith.hrm.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import xyz.vaith.hrm.dao.provider.UserDynaSqlProvider;
import xyz.vaith.hrm.domain.User;
import xyz.vaith.hrm.util.common.HrmConstants;

import java.util.List;
import java.util.Map;


public interface UserDao {
    @Select("SELECT * FORM " + HrmConstants.USERTABLE + " WHERE `loginname` = #{loginname} AND `password` = #{password}")
    User selectByLoginNameAndPassword(@Param("loginname") String loginname, @Param("password") String password);

    @Delete("DELETE FROM " + HrmConstants.USERTABLE + " WHERE `id` = #{id}")
    void deleteById(Integer id);

    @SelectProvider(type = UserDynaSqlProvider.class, method = "updateUser")
    void update(User user);

    @SelectProvider(type = UserDynaSqlProvider.class, method = "selectWithParam")
    List<User> selectByPage(Map<String, Object> params);

    @SelectProvider(type = UserDynaSqlProvider.class, method = "count")
    Integer count(Map<String, Object> params);

    @SelectProvider(type = UserDynaSqlProvider.class, method = "insertUser")
    void save(User user);
}
