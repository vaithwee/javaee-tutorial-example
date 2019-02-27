package xyz.vaith.app.converter;

import org.apache.struts2.util.StrutsTypeConverter;
import xyz.vaith.app.model.User;

import java.util.Map;

public class UserConver extends StrutsTypeConverter {
    @Override
    public Object convertFromString(Map map, String[] strings, Class aClass) {
        User user = new User();
        String[] values = strings[0].split(",");
        user.setPassword(values[0]);
        user.setUsername(values[1]);
        return user;
    }

    @Override
    public String convertToString(Map map, Object o) {
        User user = (User)o;
        return user.getPassword() + "," + user.getUsername();
    }
}
