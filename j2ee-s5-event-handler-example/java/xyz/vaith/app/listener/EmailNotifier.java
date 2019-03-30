package xyz.vaith.app.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import xyz.vaith.app.event.EmailEvent;

public class EmailNotifier implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        if (applicationEvent instanceof EmailEvent) {
            EmailEvent emailEvent = (EmailEvent) applicationEvent;
            System.out.println("需要发送邮件的接收地址:" + emailEvent.getAddress() );
            System.out.println("需要发送邮件的邮件正文:" + emailEvent.getText());

        } else  {
            System.out.println("其他事件");
        }
    }
}
