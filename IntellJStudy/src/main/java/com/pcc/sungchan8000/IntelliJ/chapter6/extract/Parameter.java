package com.pcc.sungchan8000.IntelliJ.chapter6.extract;

public class Parameter {

    /**
     * 파라미터 추출하는 단축키 option + command + P
     * @param method를 두고 파라미터를 받는 메소드를 추가하는 방법
     *
     *
     */
    public void extractParameter() {
        extractParameter(10);
    }

    /**
     * 파라미터 추출하는 단축키
     * @param num
     */
    public void extractParameter(int num){

        /**
         * extractParameter의 파라미터로 넘길경우,
         *
         * option + command + P 의 경우
         * 공통된 변수를 파라미터로 변경해 준다.
         *
         */
        System.out.println(num);
        System.out.println(num);


    }
}
