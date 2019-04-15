package xyz.vaith.app.web.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.hibernate.criterion.DetachedCriteria;
import xyz.vaith.app.domain.LinkMan;
import xyz.vaith.app.domain.PageBean;
import xyz.vaith.app.service.LinkManService;

public class LinkManAction extends ActionSupport implements ModelDriven<LinkMan> {
    private LinkMan linkMan = new LinkMan();

    private Integer pageIndex;
    private Integer pageSize;

    public Integer getPageIndex() {
        if (pageIndex==null) {
            return 0;
        }
        return pageIndex;
    }

    public Integer getPageSize() {
        if (pageSize==null || pageSize==0){
            return 3;
        }
        return pageSize;
    }

    @Override
    public LinkMan getModel() {
        return this.linkMan;
    }

    private LinkManService linkManService;

    public void setLinkManService(LinkManService linkManService) {
        this.linkManService = linkManService;
    }


    public String list() throws Exception {
        DetachedCriteria detachedCriteria = DetachedCriteria.forClass(LinkMan.class);
        PageBean<LinkMan> linkMans = linkManService.findAllByPage(detachedCriteria, getPageIndex(), getPageSize());
        ActionContext.getContext().getValueStack().push(linkMans);
        System.out.println(linkMans.getList());
        return SUCCESS;
    }
}
