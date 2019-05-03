package xyz.vaith.sql;

import org.apache.ibatis.jdbc.SQL;

import java.util.Map;

public class UserDynamicSqlProvider {
    public String selectWithParam(Map<String, Object> param) {
        return new SQL() {{
            SELECT("*");
            FROM("tb_user");
            if (param.get("id") != null) {
                WHERE("id = #{id}");
            }
            if (param.get("name") != null) {
                WHERE("name = #{name}");
            }

            if (param.get("sex") != null) {
                WHERE("sex = #{sex}");
            }
            if (param.get("age") != null) {
                WHERE("age = #{age}");
            }

        }}.toString();
    }
}
