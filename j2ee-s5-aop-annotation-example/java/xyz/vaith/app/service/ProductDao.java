package xyz.vaith.app.service;

public class ProductDao {
    public void save() {
        System.out.println("save");
    }

    public void update() {
        System.out.println("update");
    }

    public String find() {
        System.out.println("find");
        return "goods";
    }

    public void delete() throws Throwable {
        System.out.println("delete");
        int z = 1 / 0;
    }
}
