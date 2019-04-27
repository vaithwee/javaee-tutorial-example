package xyz.vaith.controller;

import com.sun.xml.internal.ws.api.databinding.DatabindingConfig;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dataBinding")
public class DataBindingController {
    private static final Log logger = LogFactory.getLog(DatabindingConfig.class);

    @RequestMapping("/pathVariableTest/{userId}")
    public void pathVariableTest(@PathVariable Integer userId) {
        logger.info("@PathVariable User Id :" + userId);
    }

    @RequestMapping("/requestHeaderTest")
    public void requestHeaderTest(@RequestHeader("User-Agent") String userAgent, @RequestHeader(value = "Accept") String[] accepts) {
        logger.info("UserAgent: " + userAgent);
        for (String accept : accepts) {
            logger.info(accept);
        }
    }

    @RequestMapping("/cookieValueTest")
    public void cookieValueTest(@CookieValue(value = "JSESSIONID", defaultValue = "") String sessionId) {
        logger.info("JSESSIONID:" + sessionId);
    }
}
