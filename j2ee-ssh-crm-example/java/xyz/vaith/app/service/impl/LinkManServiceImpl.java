package xyz.vaith.app.service.impl;

import com.sun.xml.bind.v2.model.core.ID;
import org.hibernate.criterion.DetachedCriteria;
import xyz.vaith.app.dao.LinkManDao;
import xyz.vaith.app.domain.Customer;
import xyz.vaith.app.domain.LinkMan;
import xyz.vaith.app.domain.PageBean;
import xyz.vaith.app.service.LinkManService;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
public class LinkManServiceImpl implements LinkManService {
    private LinkManDao linkManDao;

    public void setLinkManDao(LinkManDao linkManDao) {
        this.linkManDao = linkManDao;
    }

    @Override
    public PageBean<LinkMan> findAllByPage(DetachedCriteria detachedCriteria, Integer pageIndex, Integer pageSize) {
        PageBean pageBean = new PageBean();
        pageBean.setPageIndex(pageIndex);
        pageBean.setPageSize(pageSize);
        Integer count = linkManDao.findCount(detachedCriteria);
        pageBean.setTotalCount(count);
        pageBean.setTotalPage((int) Math.ceil(count.doubleValue() / pageSize));
        Integer begin = pageIndex * pageSize;
        List<LinkMan> list = linkManDao.findByPage(detachedCriteria, pageIndex, pageSize);
        pageBean.setList(list);
        return pageBean;
    }

    @Override
    public void save(LinkMan linkMan) {
        this.linkManDao.save(linkMan);
    }

    @Override
    public LinkMan getLinkManById(Integer lid) {
        return this.linkManDao.getLinkManById(lid);
    }

    @Override
    public void update(LinkMan linkMan) {
        this.linkManDao.update(linkMan);
    }

    @Override
    public void delete(LinkMan linkMan) {
        this.linkManDao.delete(linkMan);
    }
}
