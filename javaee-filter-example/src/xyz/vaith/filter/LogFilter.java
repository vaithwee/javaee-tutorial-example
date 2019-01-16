package xyz.vaith.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class LogFilter implements Filter {
    private FilterConfig config;
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤开始");
        ServletContext context = this.config.getServletContext();
         long before = System.currentTimeMillis();
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        System.out.println("Filter已经截获到用户的请求地址:" + request.getServletPath());
        filterChain.doFilter(servletRequest, servletResponse);
        long after = System.currentTimeMillis();
        System.out.println("过滤结束");
        System.out.println("请求被定为到" + request.getRequestURI() +", 所花时间为: " + (after - before));
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.config = filterConfig;
    }

    @Override
    public void destroy() {
        this.config = null;
    }
}
