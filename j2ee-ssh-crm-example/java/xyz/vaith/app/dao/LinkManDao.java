package xyz.vaith.app.dao;

import org.hibernate.criterion.DetachedCriteria;
import xyz.vaith.app.domain.LinkMan;

import java.util.List;

public interface LinkManDao {
    Integer findCount(DetachedCriteria detachedCriteria);
    List<LinkMan> findByPage(DetachedCriteria detachedCriteria, Integer pageIndex, Integer pageSize);
}