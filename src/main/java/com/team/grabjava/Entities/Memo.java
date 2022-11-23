package com.team.grabjava.Entities;

import java.util.Date;

public class Memo {
    private int id;
    private final String writer;
    private final String password;
    private String memo;
    private Date created_at;

    public Memo(int id, String writer, String password, String memo) {
        this.id = id;
        this.writer = writer;
        this.password = password;
        this.memo = memo;
        this.created_at = new Date();
    }

    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getMemo() {
        return memo;
    }

    public String getWriter() {
        return writer;
    }
    public Date getCreated_at() {
        return created_at;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMemo(String memo) {
        this.memo = memo;
        // 수정날짜로 변경해준다.
        this.created_at = new Date();
    }
}