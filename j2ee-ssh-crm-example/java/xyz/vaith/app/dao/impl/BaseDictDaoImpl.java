package xyz.vaith.app.dao.impl;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import xyz.vaith.app.dao.BaseDictDao;
import xyz.vaith.app.domain.BaseDict;

import java.util.List;

public class BaseDictDaoImpl extends HibernateDaoSupport implements BaseDictDao {
    @Override
    public List<BaseDict> getDictByExample(BaseDict baseDict) {
        List<BaseDict> byExample = this.getHibernateTemplate().findByExample(baseDict);
        return byExample;
    }
}
