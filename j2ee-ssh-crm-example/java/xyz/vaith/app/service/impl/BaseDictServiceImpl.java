package xyz.vaith.app.service.impl;

import xyz.vaith.app.dao.BaseDictDao;
import xyz.vaith.app.domain.BaseDict;
import xyz.vaith.app.service.BaseDictService;

import java.util.List;

public class BaseDictServiceImpl implements BaseDictService {
    private BaseDictDao baseDictDao;

    public void setBaseDictDao(BaseDictDao baseDictDao) {
        this.baseDictDao = baseDictDao;
    }

    @Override
    public List<BaseDict> getDictByExample(BaseDict baseDict) {
        return baseDictDao.getDictByExample(baseDict);
    }
}
