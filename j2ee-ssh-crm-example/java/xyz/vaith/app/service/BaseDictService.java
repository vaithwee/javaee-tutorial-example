package xyz.vaith.app.service;

import xyz.vaith.app.domain.BaseDict;

import java.util.List;

public interface BaseDictService {
    List<BaseDict> getDictByExample(BaseDict baseDict);
}
