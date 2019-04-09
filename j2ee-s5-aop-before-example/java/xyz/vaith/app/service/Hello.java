package xyz.vaith.app.service;

public interface Hello {
    Integer addUser(String username, String password);
    void deleteUser(Integer id);
    void removeUser() throws Throwable;
}
