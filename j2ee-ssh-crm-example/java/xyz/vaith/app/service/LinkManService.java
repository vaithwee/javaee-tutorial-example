package xyz.vaith.app.service;

import org.hibernate.criterion.DetachedCriteria;
import xyz.vaith.app.domain.LinkMan;
import xyz.vaith.app.domain.PageBean;

public interface LinkManService {
    PageBean<LinkMan> findAllByPage(DetachedCriteria detachedCriteria, Integer pageIndex, Integer pageSize);

    void save(LinkMan linkMan);

    LinkMan getLinkManById(Integer lid);

    void update(LinkMan linkMan);

    void delete(LinkMan linkMan);
}
