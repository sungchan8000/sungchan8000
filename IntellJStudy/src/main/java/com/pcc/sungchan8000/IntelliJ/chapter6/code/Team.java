package com.pcc.sungchan8000.IntelliJ.chapter6.code;

public class Team {
    private String name;

    public Team(String name, String code) {
        this.name = name;
        this.code = code;
    }

    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
