package xyz.vaith.app.dao;

import xyz.vaith.app.domain.BaseDict;

import java.util.List;

public interface BaseDictDao {
    List<BaseDict> getDictByExample(BaseDict baseDict);
}
