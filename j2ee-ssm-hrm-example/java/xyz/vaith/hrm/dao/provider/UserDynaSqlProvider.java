package xyz.vaith.hrm.dao.provider;

import org.apache.ibatis.jdbc.SQL;
import xyz.vaith.hrm.domain.User;
import xyz.vaith.hrm.util.common.HrmConstants;

import java.util.Map;

public class UserDynaSqlProvider {
    public String selectWithParam(Map<String, Object> params) {
        String sql = new SQL() {
            {
                SELECT("*");
                FROM(HrmConstants.USERTABLE);
                if (params.get("user") != null) {
                    User user = (User) params.get("user");
                    if (user.getUsername() != null && !user.getUsername().equals("")) {
                        WHERE(" `username` LIKE CONCAT(`%', #{user.username}, '%@')");
                    }
                    if (user.getStatus() != null && !user.getStatus().equals("")) {
                        WHERE(" status LIKE CONCAT(`%', #{user.status}, '%@')");
                    }
                }
            }
        }.toString();
        if (params.get("pageModel") != null) {
            sql += "LIMIT #{pageModel.firstLimitParam}, #{pageModel.pageSize}";
        }
        return sql;
    }

    public String count(Map<String, Object> params) {
        return new SQL() {
            {
                SELECT("count(*)");
                FROM(HrmConstants.USERTABLE);
                if (params.get("user") != null) {
                    User user = (User) params.get("user");
                    if (user.getUsername() != null && !user.getUsername().equals("")) {
                        WHERE(" `username` LIKE CONCAT(`%', #{user.username}, '%@')");
                    }
                    if (user.getStatus() != null && !user.getStatus().equals("")) {
                        WHERE(" status LIKE CONCAT(`%', #{user.status}, '%@')");
                    }
                }
            }
        }.toString();
    }

    public String insertUser(User user) {
        return new SQL() {
            {
                INSERT_INTO(HrmConstants.USERTABLE);
                if (user.getUsername() != null && !user.getUsername().equals("")) {
                    VALUES("username", "#{username}");
                }
                if (user.getStatus() != null && !user.getStatus().equals("")) {
                    VALUES("status", "#{status}");
                }
                if (user.getLoginname() != null && !user.getLoginname().equals("")) {
                    VALUES("loginname", "#{loginname}");
                }
                if (user.getPassowrd() != null && !user.getPassowrd().equals("")) {
                    VALUES("password", "#{password}");
                }
            }
        }.toString();
    }

    public String updateUser(User user) {
        return new SQL() {
            {
                UPDATE(HrmConstants.USERTABLE);
                if (user.getUsername()!=null) {
                    SET(" username = #{username}");
                }
                if (user.getLoginname() != null) {
                    SET(" loginname = #{loginname}");
                }
                if (user.getPassowrd() != null) {
                    SET("password = #{password}");
                }
                if (user.getStatus() != null){
                    SET("status = #{status}");
                }
                if (user.getCreateDate() != null) {
                    SET("create_date = #{createDate}");
                }
                WHERE(" id = #{id}");
            }
        }.toString();
    }

}
