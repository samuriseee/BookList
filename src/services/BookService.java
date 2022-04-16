/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;
import Dao.BookListDao;
import java.sql.*;
import java.util.*;
import Model.Book;
/**
 *
 * @author HOME-SINGLE
 */
public class BookService {
    private BookListDao booklistDao;
    
    public BookService() {
        booklistDao = new BookListDao();
        
    }
    
    public List<Book> getAllBooks() throws SQLException {
        return booklistDao.getAllUsers();
    }

    public void DeleteBook(int bookId) throws SQLException {
        booklistDao.DeleteBook(bookId);
    }
    
    public void AddBook(String title, int price) throws SQLException {
        booklistDao.AddBook(title,price);
    }
}
