package xyz.vaith.app.service.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import xyz.vaith.app.service.UserService;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service("userServiceOther")
@Scope("prototype")
public class UserDaoOtherImpl implements UserService {

    @PostConstruct
    public void init() {
        System.out.println("UserDaoOtherImpl init method executing");
    }

    @Override
    public void save() {
        System.out.println("UserDaoOtherImpl save method executing");
    }

    @PreDestroy
    public void  destroy() {
        System.out.println("UserDaoOtherImpl destroy method executing");
    }
}
