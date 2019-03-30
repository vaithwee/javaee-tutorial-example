package xyz.vaith.app.event;

import org.springframework.context.ApplicationEvent;

public class EmailEvent extends ApplicationEvent {
    private String address;
    private String text;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public EmailEvent(Object source) {
        super(source);
    }

    public EmailEvent(Object source, String address, String text) {
        super(source);
        this.address = address;
        this.text = text;
    }

    @Override
    public String toString() {
        return "EmailEvent{" +
                "address='" + address + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
