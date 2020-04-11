package com.pcc.sungchan8000.IntelliJ.chapter2.special;



import java.time.LocalDate;
import java.util.Optional;

public class FocusHierarchy {

    public void increaseFocus(){

        //Option + Up/Down 개체 단위로 선택하게 됩니다.

        System.out.println(Optional.of(new Member().getCourse()));
        System.out.println(LocalDate.of(2018,5,14));


    }
}
