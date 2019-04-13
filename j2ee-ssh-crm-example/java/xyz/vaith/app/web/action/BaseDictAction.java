package xyz.vaith.app.web.action;

import com.opensymphony.xwork2.ActionSupport;
import xyz.vaith.app.service.BaseDictService;

public class BaseDictAction extends ActionSupport {
    private BaseDictService baseDictService;

    public void setBaseDictService(BaseDictService baseDictService) {
        this.baseDictService = baseDictService;
    }
}
