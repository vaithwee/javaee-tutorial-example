package xyz.vaith.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import xyz.vaith.domain.User;

public class UserValidator implements Validator {
    @Override
    public boolean supports(Class<?> aClass) {
        return User.class.isAssignableFrom(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "loginname", null, "用户名不能为空");
        ValidationUtils.rejectIfEmpty(errors, "password", null, "密码不能为空");
        User user = (User)o;
        if (user.getLoginname().length() > 10) {
            errors.rejectValue("loginname", null, "用户名不能超过10个字符");
        }
        if (user.getPassword()!= null && !user.getPassword().equals("") && user.getPassword().length() < 6) {
            errors.rejectValue("password", null, "密码不能小于6位");
        }
    }
}
