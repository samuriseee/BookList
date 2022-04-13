/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author HOME-SINGLE
 */
public class Book {
    private int id;
    private String bookName;
    private int price;
    
    private int getID() {
        return id;
    }
    private void setID(int id) {
        this.id = id;
    }
    
    private String getBookName() {
        return bookName;
    }
    private void setBookName(String bookName) {
        this.bookName = bookName;
    }
    
    private int getPrice() {
        return price;
    }
    private void setprice(int price) {
        this.price = price;
    }
}
