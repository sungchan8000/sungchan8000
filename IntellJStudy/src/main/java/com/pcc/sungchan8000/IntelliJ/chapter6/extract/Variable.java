package com.pcc.sungchan8000.IntelliJ.chapter6.extract;

public class Variable {

    public void extractVariable(){

        //공통된 기능을 하나의 변수로 만들고 기능을 첨가하는 것이 일반적인 방법임.
        //option+command+V
        String message = String.format("%d+%d=%d", 1, 2, 1 + 2);

        System.out.println(message);

        System.out.println(String.format("%d+%d=%d", 1, 2, 1 + 2));
    }
}
