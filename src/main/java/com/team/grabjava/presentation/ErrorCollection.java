package com.team.grabjava.presentation;

public interface ErrorCollection {

    // 시작메뉴에서 1 ~ 5번 이외에 숫자 or 공백를 입력할 경우 발생하는 오류
    public void numberInputError();

    // 수정할 글이 존재하지 않을 경우 발생하는 메세지
    public void reviseFail();

    // 수정할 글의 비밀번호가 일치하지 않을 때 발생하는 오류
    public void passwordChangeFail();
}