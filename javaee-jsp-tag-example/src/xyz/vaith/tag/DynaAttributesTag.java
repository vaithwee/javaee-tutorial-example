package xyz.vaith.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.DynamicAttributes;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.ArrayList;

public class DynaAttributesTag extends SimpleTagSupport implements DynamicAttributes {

    private ArrayList<String> keys = new ArrayList<String>();
    private ArrayList<Object> values = new ArrayList<Object>();

    @Override
    public void setDynamicAttribute(String s, String s1, Object o) throws JspException {
        keys.add(s1);
        values.add(o);
    }

    @Override
    public void doTag() throws JspException, IOException {
        JspWriter writer = getJspContext().getOut();
        writer.println("<ol>");
        for (int idx = 0; idx < keys.size(); ++idx) {
            String key = keys.get(idx);
            Object value = values.get(idx);
            writer.println("<li>" + key + " = " + value + "</li>" );
        }
        writer.println("</ol>");
    }
}
