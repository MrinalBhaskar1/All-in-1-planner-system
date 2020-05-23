/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.id;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author HEMANT DHIMAN
 */
public class ID 
{
    static int id;
    static PreparedStatement statement;
    static Connection connection;
    static ResultSet SO;
    
    public static int getId()
    {
         try{
            Class.forName("com.mysql.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mrinal","root","root");
            statement=connection.prepareStatement("select max(ID) from booking1");
            SO=statement.executeQuery();
           if(SO.next())
           {
               id=SO.getInt(1);
           }
        }catch(ClassNotFoundException o)
        {
            o.printStackTrace();
        }   
        catch(SQLException sq)
        {
            sq.printStackTrace();
        }
         return id;
    }
    public static void main(String[] args) 
    {
        getId();
    }
}
