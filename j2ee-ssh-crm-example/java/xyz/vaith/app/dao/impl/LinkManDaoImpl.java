package xyz.vaith.app.dao.impl;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import xyz.vaith.app.dao.LinkManDao;
import xyz.vaith.app.domain.LinkMan;

import java.util.List;

public class LinkManDaoImpl extends HibernateDaoSupport implements LinkManDao {

    @Override
    public Integer findCount(DetachedCriteria detachedCriteria) {
        detachedCriteria.setProjection(Projections.rowCount());
        List<Long> list = (List<Long>) this.getHibernateTemplate().findByCriteria(detachedCriteria);
        if (list.size() > 0){
            return list.get(0).intValue();
        }
        return 0;
    }

    @Override
    public List<LinkMan> findByPage(DetachedCriteria detachedCriteria, Integer pageIndex, Integer pageSize) {
        detachedCriteria.setProjection(null);
        List<LinkMan> list = (List<LinkMan>) this.getHibernateTemplate().findByCriteria(detachedCriteria, pageIndex*pageSize, pageSize);
        return list;
    }

    @Override
    public void save(LinkMan linkMan) {
        this.getHibernateTemplate().save(linkMan);
    }

    @Override
    public LinkMan getLinkManById(Integer lid) {
        LinkMan linkMan = new LinkMan();
        linkMan.setLid(lid);
        List<LinkMan> list = this.getHibernateTemplate().findByExample(linkMan);
        if (list.size() > 0) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public void update(LinkMan linkMan) {
        this.getHibernateTemplate().update(linkMan);
    }

    @Override
    public void delete(LinkMan linkMan) {
        this.getHibernateTemplate().delete(linkMan);
    }
}
