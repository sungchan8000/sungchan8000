package com.pcc.sungchan8000.IntelliJ.chapter1.view;

public class EmailSender {
    public Long id;
    public String name;
    public String email;


    public EmailSender(Long id, String name, String email){

        this.id =id;
        this.name=name;
        this.email=email;

    }

    public static void receive(String from, String to) {
        System.out.println(from+"으로부터 " + to+ "님께");

    }

    public void send(String to){
        System.out.println(this.email+" 님이" + to+"님에게 메일을 보냅니다.");
    }

    public String getEmail() {
        return  email;
    }
}
