package com.pcc.sungchan8000.IntelliJ.chapter1.view;

public class ViewDefinition {

    public void viewDefinitioin(){


        //클래스 생성자도 볼 수 있다.
        EmailSender emailSender = new EmailSender(1L,"sungchan8000","sungchan8000@gmail.com");


        //send라는 메소드의 구현부를 즉시 볼 수 있는 방법
        //fn+Option+space
        emailSender.send("test@gmail.com");

        //interlliJ 얼티메이트 버전에서는 


    }
}
