package xyz.vatih.execption;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class SysExecptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, Object o, Exception e) {
        SysExecption error = null;
        if (e instanceof SysExecption) {
            error = (SysExecption)e;
        } else  {
            error = new SysExecption("server is done");
        }
        ModelAndView mv = new ModelAndView();
        mv.addObject("errorMsg", error.getMessage());
        mv.setViewName("error");
        return mv;
    }
}
