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
    
    public int getID() {
        return id;
    }
    public void setID(int id) {
        this.id = id;
    }
    
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    
    public int getPrice() {
        return price;
    }
    public void setprice(int price) {
        this.price = price;
    }
}
