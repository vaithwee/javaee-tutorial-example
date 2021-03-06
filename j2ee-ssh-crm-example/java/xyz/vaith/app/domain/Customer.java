package xyz.vaith.app.domain;

import java.util.HashSet;
import java.util.Set;

public class Customer {
    private Integer cid;
    private String name;
    private BaseDict source;
    private BaseDict industry;
    private BaseDict level;
    private String phone;
    private String mobile;
    private String image;
    private Set<LinkMan> linkMans = new HashSet<LinkMan>();

    public Set<LinkMan> getLinkMans() {
        return linkMans;
    }

    public void setLinkMans(Set<LinkMan> linkMans) {
        this.linkMans = linkMans;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BaseDict getSource() {
        return source;
    }

    public void setSource(BaseDict source) {
        this.source = source;
    }

    public BaseDict getIndustry() {
        return industry;
    }

    public void setIndustry(BaseDict industry) {
        this.industry = industry;
    }

    public BaseDict getLevel() {
        return level;
    }

    public void setLevel(BaseDict level) {
        this.level = level;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                ", source='" + source + '\'' +
                ", industry='" + industry + '\'' +
                ", level='" + level + '\'' +
                ", phone='" + phone + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}
