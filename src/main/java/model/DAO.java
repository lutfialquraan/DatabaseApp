package model;

import java.sql.Connection;

import javax.annotation.Resource;


public class DAO {






    Connection connection;


    public DAO(Connection connection) {
        this.connection = connection;
    }




//    public void insertQuery (User user ) throws SQLException {
//
//        String string = "insert into users (name,password) values (?,?) ;";
//        PreparedStatement preparedStatement = connection.prepareStatement(string);
//        preparedStatement.setString(1,user.getName());
//        preparedStatement.setString(2,user.getPassword());
//        preparedStatement.execute();
//    }


}
