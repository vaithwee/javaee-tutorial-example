package xyz.vaith.app.service.impl;

import xyz.vaith.app.service.BaseDao;
//前面一个泛型是定义 后面一个是使用
public class BaseDaoImpl<T> implements BaseDao<T> {
    @Override
    public void save(T e) {
        System.out.println("program save object" + e);
    }
}
