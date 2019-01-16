package xyz.vaith.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class FragmentTag extends SimpleTagSupport {
    private JspFragment fragment;

    public JspFragment getFragment() {
        return fragment;
    }

    public void setFragment(JspFragment fragment) {
        this.fragment = fragment;
    }

    @Override
    public void doTag() throws JspException, IOException {
        JspWriter writer = getJspContext().getOut();
        writer.println("<div style='padding:10px;border:1px solid black;border-radius:20px;' >");
        writer.println("<h3>下面是动态传入的jsp片段</h3>");
        fragment.invoke(null);
        writer.println("</div>");
    }
}
