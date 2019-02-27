package xyz.vaith.app.converter;

import ognl.DefaultTypeConverter;
import xyz.vaith.app.model.User;

import java.util.Map;

public class UserConverter extends DefaultTypeConverter {
    @Override
    public Object convertValue(Map context, Object value, Class toType) {
        if (toType == User.class) {
            String[] params = (String[])value;
            User user = new User();
            String[] userValues = params[0].split(",");
            user.setUsername(userValues[0]);
            user.setPassword(userValues[1]);
            return user;
        } else if (toType == String.class) {
            User user = (User)value;
            return "<" + user.getUsername() + ", " + user.getPassword() + ">";
        }
        return null;
    }
}
