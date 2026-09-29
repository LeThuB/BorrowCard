package BorrowCard.entity;

import BorrowCard.util.Getinput;

import java.time.LocalDate;
import java.util.Scanner;

public class BorrowCard {
    private int cardID;
    private String bookTitle;
    private String borrowerName;
    private LocalDate borrowDate;
    private LocalDate returnDeadline;
    private int quantity;
    private String status;

    public BorrowCard() {
    }

    public BorrowCard(int cardID, String bookTitle, String borrowrName, LocalDate borrowDate, LocalDate returnDeadline, int quantity, String status) {
        this.cardID = cardID;
        this.bookTitle = bookTitle;
        this.borrowerName = borrowrName;
        this.borrowDate = borrowDate;
        this.returnDeadline = returnDeadline;
        this.quantity = quantity;
        this.status = status;
    }

    public int getCardID() {
        return cardID;
    }

    public void setCardID(int cardID) {
        this.cardID = cardID;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBorrowrName() {
        return borrowerName;
    }

    public void setBorrowrName(String borrowrName) {
        this.borrowerName = borrowrName;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public LocalDate getReturnDeadline() {
        return returnDeadline;
    }

    public void setReturnDeadline(LocalDate returnDeadline) {
        this.returnDeadline = returnDeadline;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void inputData(Scanner scanner){
        this.bookTitle = Getinput.getString(scanner,"Nhập tên sách mượn : ",1,150);
        this.borrowerName = Getinput.getString(scanner,"Nhập tên độc giả : ", 1,100);
        this.borrowDate = Getinput.getLocalDate(scanner,"Nhập ngày mượn sách : ");
        this.returnDeadline = Getinput.getLocalDate(scanner,"Nhập hạn trả sách : ");
        this.quantity = Getinput.getInt(scanner,"Nhập số lượng mượn : ",1,Integer.MAX_VALUE);
        this.status = Getinput.getString(scanner,"Trạng thái : ",1,30);

    }

    public void displayData(){
        System.out.printf("| Card ID : %-6d | Book Title : %-25s | Borrower Name : %-20s " +
                "| Borrow Date : %-20s | Return Deadline : %-20s | Quantity : %-5d | Status : %-25%n",
                cardID,bookTitle,borrowerName,borrowDate,returnDeadline,quantity,status);
    }
}
