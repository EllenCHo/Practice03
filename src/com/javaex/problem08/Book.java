package com.javaex.problem08;

public class Book {
    private int bookNo;			
    private String title;
    private String author;
    private int stateCode;
    
    public Book(int bookNo, String title, String author) {
    	this.bookNo = bookNo;
    	this.title = title;
    	this.author = author;
    	stateCode = 1;
    }
    
    public int getBookNo() {
    	return bookNo;
    }
    
    public String getTitle() {
    	return title;
    }
    
    public String getAuthor() {
    	return author;
    }
    
    public int getStateCode() {
    	return stateCode;
    }
    
    public void setBookNo(int bookNo) {
    	this.bookNo = bookNo;
    }
    
    public void setTitle(String title) {
    	this.title = title;
    }
    
    public void setAuthor(String author) {
    	this.author = author;
    }
    
    public void setStateCode(int stateCode) {
    	this.stateCode = stateCode;
    }
    public void rent() {
    	stateCode = 0;
    	System.out.println(title + "이(가) 대여 됐습니다.");

    	
    }
    
    public void print() {
    	if(stateCode==1) {
    		System.out.println(bookNo + "\t" + "책 제목:" + title + "\t" + "작가:" + author + "\t대여 유무 : 재고 있음");
    	} else {
    		System.out.println(bookNo + "\t" + "책 제목:" + title + "\t" + "작가:" + author + "\t대여 유무 : 대여중");
    	}
    	
    }
    
    
    
    
}
