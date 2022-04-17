/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;
import Model.Book;
import java.sql.*;
import java.util.*;
import Dao.JDBCConnect;

/**
 *
 * @author HOME-SINGLE
 */
public class BookListDao {
    
    public List<Book> getAllUsers() throws SQLException {
        List<Book> books = new ArrayList<Book>();
        
        Connection connection = JDBCConnect.getJDBCConnection();

        String sql = "SELECT * FROM books";
        
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()) {
                Book book = new Book();
                
                book.setID(rs.getInt("id"));
                book.setBookName(rs.getString("bookName"));
                book.setprice(rs.getInt("price"));
                
                books.add(book);
                
            }
        }
        catch (SQLException e) {
            e.printStackTrace();;
        }
        return books;
    }
    
    public void DeleteBook(int id) throws SQLException {

        Connection connection = JDBCConnect.getJDBCConnection();

        String sql = "delete from books where id = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            int rs = preparedStatement.executeUpdate();
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }

    public void AddBook(String title,int price) throws SQLException {
        Connection connection = JDBCConnect.getJDBCConnection();

        String sql = "insert into books values ('" + title + "'," + price + ")" ;

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            int rs = preparedStatement.executeUpdate();
            
            System.out.println(rs);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void UpdateBook(int row) {
        

    }
    
}
