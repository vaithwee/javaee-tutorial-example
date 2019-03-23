package xyz.vaith.app.service;

public class ProductService {
    public void save() {
        System.out.println("save");
    }
    public void update() {
        System.out.println("update");
    }
    public String find() {
        System.out.println("find");
        return "Wee";
    }
    public void delete() {
        System.out.println("delete");
        int i = 1 / 0;
    }
}
