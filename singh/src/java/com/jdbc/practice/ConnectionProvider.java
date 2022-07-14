
package com.jdbc.practice;
import java.util.*;
import java.sql.*;
public class ConnectionProvider {
    public Connection con;
    public static void main(String[] args){
    try{
    Class.forName("com.mysql.cj.jdbc.Drive");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/youtube","root","root");
    if(con!=null){
        System.out.println("successfully connected");
    }
}catch(Exception e){
    System.out.println("not connected");
}
}
}
