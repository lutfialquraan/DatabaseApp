package model;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionPool {




    @Resource(name="jdbc/students")
    private DataSource pool;

    public Connection getConnection () throws SQLException {
        return pool.getConnection();
    }









}
