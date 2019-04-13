package xyz.vaith.app.web.action;


import com.alibaba.fastjson.JSONArray;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import xyz.vaith.app.domain.BaseDict;
import xyz.vaith.app.service.BaseDictService;


import java.util.List;

public class BaseDictAction extends ActionSupport implements ModelDriven<BaseDict> {
    private BaseDict baseDict = new BaseDict();

    @Override
    public BaseDict getModel() {
        return baseDict;
    }

    private BaseDictService baseDictService;

    public void setBaseDictService(BaseDictService baseDictService) {
        this.baseDictService = baseDictService;
    }

    public String getDictByTypeCode() throws Exception {
        System.out.println("executing get dict by type code");
        List<BaseDict> dictByExample = baseDictService.getDictByExample(baseDict);
        for (BaseDict bd : dictByExample) {
            System.out.println(bd);
        }
        Object json = JSONArray.toJSON(dictByExample);
        System.out.println(json.toString());
        ServletActionContext.getResponse().setContentType("text/html;charset=UTF-8");
        ServletActionContext.getResponse().getWriter().println(json.toString());
        return NONE;
    }
}
