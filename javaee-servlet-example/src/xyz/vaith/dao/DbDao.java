package xyz.vaith.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DbDao {

    private Connection connection;
    private String driver;
    private String url;
    private String username;
    private String password;

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public DbDao() {

    }

    public DbDao(String driver, String url, String user, String pwd) {
        this.driver = driver;
        this.url = url;;
        this.username = user;
        this.password = pwd;
    }

    public Connection getConnection() throws Exception {
        if (connection == null) {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, password);
        }
        return connection;
    }

    public boolean insert(String sql, Object...args) throws Exception {
        PreparedStatement statement = getPreparedStatement(sql, args);
        if (statement.executeUpdate() != 1) {
            return false;
        }
        return true;
    }

    public ResultSet query(String sql, Object...args) throws Exception {
        PreparedStatement statement = getPreparedStatement(sql, args);
        return statement.executeQuery();
    }

    public void modify(String sql, Object...args) throws Exception {
        PreparedStatement statement = getPreparedStatement(sql, args);
        statement.executeUpdate();
        statement.close();
    }

    private PreparedStatement getPreparedStatement(String sql, Object[] args) throws Exception {
        PreparedStatement statement = getConnection().prepareStatement(sql);
        for (int i = 0; i < args.length; ++i) {
            statement.setObject(i + 1, args[i]);
        }
        return statement;
    }

    public void closeConn() throws Exception {
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
    }


}
