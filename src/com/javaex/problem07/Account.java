package com.javaex.problem07;

public class Account {

    private String accountNo;
    private int balance;
    
    //생성자 작성
    public Account() {
    	
    }
    
    public Account(String accountNo) {
    	this.accountNo = accountNo;
    	this.balance = 0;
    }
    
    
    public Account(String accountNo, int balance) {
    	this.accountNo = accountNo;
    	this.balance = balance;
    }
    
    //필요한 메소드 작성
    public void deposit(int money) {
    	balance += money;
    }
    
    public void withdraw(int money) {
    	if(money<=balance) {				//잔고보다 출금이 적을 경우 인출
    		balance -= money;
		} else {							//잔고보다 출금이 많을 경우 
			System.out.println("잔고가 부족합니다.");
			System.out.println("잔고액 : "+balance);
		}
    }

    public void showBalance() {
    	System.out.println(balance);
    }
}
