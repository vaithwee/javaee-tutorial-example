package xyz.vaith.app.service.impl;

import org.hibernate.criterion.DetachedCriteria;
import xyz.vaith.app.dao.LinkManDao;
import xyz.vaith.app.domain.Customer;
import xyz.vaith.app.domain.LinkMan;
import xyz.vaith.app.domain.PageBean;
import xyz.vaith.app.service.LinkManService;

import java.util.List;

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
}
