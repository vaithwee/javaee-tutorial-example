package xyz.vaith.app.service.impl;

import xyz.vaith.app.dao.BaseDictDao;
import xyz.vaith.app.service.BaseDictService;

public class BaseDictServiceImpl implements BaseDictService {
    private BaseDictDao baseDictDao;

    public void setBaseDictDao(BaseDictDao baseDictDao) {
        this.baseDictDao = baseDictDao;
    }
}
