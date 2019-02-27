package xyz.vaith.app.convertor;

import org.apache.struts2.util.StrutsTypeConverter;
import xyz.vaith.app.bean.User;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UserConvertor extends StrutsTypeConverter {
    @Override
    public Object convertFromString(Map map, String[] strings, Class aClass) {
        Set result = new HashSet();
        for (int i = 0; i < strings.length; ++i) {
            User user = new User();
            String[] userValues = strings[i].split(",");
            user.setUsername(userValues[0]);
            user.setPassword(userValues[1]);
            result.add(user);
        }
        return result;
    }

    @Override
    public String convertToString(Map map, Object o) {
        if (o.getClass() == Set.class) {
            Set users = (Set)o;
            String result = "{";
            for (Object obj : users) {
                User user = (User)obj;
                result += "<" + user.getUsername() + ", " + user.getPassword() + ">";
            }
            return result + "}";
        }
        return null;
    }
}
