package com.javaex.problem06;

public class Friend {

    private String name;
    private String hp;
    private String school;

    
    //필요한 메소드 작성
    public void setName(String name) {
    	this.name = name;
    }
    
    public void setHp(String hp) {
    	this.hp = hp;
    }
    
    public void setSchool(String school) {
    	this.school = school;
    }
    
    public void setInfo(String[] str) {
    	this.name = str[0];
    	this.hp = str[1];
    	this.school = str[2];
    }
    
    
    
    
    public void showInfo(){
        System.out.println("이름:"+name+"  핸드폰:"+hp+"  학교:"+school);
    }

}
