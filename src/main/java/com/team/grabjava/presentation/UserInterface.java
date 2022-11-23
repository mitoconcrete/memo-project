package com.team.grabjava.presentation;

import com.team.grabjava.entities.Memo;

import java.util.List;

public class UserInterface implements ErrorCollection {
    public void run() {
        // 메모장 프로그램 메뉴 구성
        System.out.println("=메모장 프로그램=");

        System.out.println("1.입력"); // 작성자, 패스워드 , 메모내용(메소드)
        System.out.println("2.목록보기");
        System.out.println("3.수정");
        System.out.println("4.삭제");
        System.out.println("5.종료");
    }

    /** 입력기능 **/
    // 번호
    public void numberInputReceive(){
        System.out.println("번호를 입력해 주세요 : ");
    }

    // 이름, 비밀번호, 메모 입력
    public void contentReceive(){
        System.out.println("이름 , 비밀번호, 메모를 입력해 주세요 : ");
    }

    // 메모내용 저장 메소드
    public void memoSave(){
        System.out.println("저장되었습니다.");
    }

    public void passwordInputReceive(){
        System.out.println("패스워드를 입력하세요.");
    }

    ㅔ

    /** 수정기능 **/
    // 수정할 글 입력 화면
    public void changeMemo(){
        System.out.println("수정할 글을 입력하세요 : ");
    }
    // 수정 재확인 화면
    public void checkChangeMemo(){
        System.out.println("정말 수정하시겠습니까? : y / n");
    };

    // 수정 완료 메소드
    public void revise(){
        System.out.println("수정되었습니다.");
    }

    /** 목록 조회 기능 **/
    public void getMemoList(List<Memo> memoList){
        if(memoList.size() != 0){
            for(Memo memo: memoList){
                System.out.println(memo.getId() + " / " + memo.getWriter() + " / " + memo.getMemo() + " / " + memo.getCreated_at());
            }
        }else{
            System.out.println("메모가 존재하지 않습니다.");
        }
    }


    /** 삭제 기능  **/
    // 삭제할 글 번호를 입력 화면
    public void deleteMemoNumber(){
        System.out.println("삭제할 글의 번호를 입력하세요 : ");
    };

    // 메모 삭제 재확인 출력 메소드
    public void deleteCheck(){
        System.out.println("정말 삭제하시겠습니까? : y / n");
    }

    // 메모 삭제 메소드
    public void delete(){
        System.out.println("삭제되었습니다.");
    }

    // 프로그램 종료 화면
    public void closeMessage(int input){
        System.out.println("프로그램을 종료합니다.");
    };

    @Override
    public void createInputError() {
        System.out.println("입력에 실패하였습니다.");
    }

    // 시작메뉴에서 1 ~ 5번 이외에 숫자 or 공백를 입력할 경우 발생하는 오류
    @Override
    public void numberInputError() {
        System.out.println("잘못 입력하셨습니다.");
    }

    // 수정할 글이 존재하지 않을 경우 발생하는 메세지
    @Override
    public void reviseFail() {
        System.out.println("수정할 글이 존재하지 않습니다.");
    }

    // 수정할 글의 비밀번호가 일치하지 않을 때 발생하는 오류
    @Override
    public void passwordChangeFail() {
        System.out.println("수정할 글의 비밀번호가 일치하지 않습니다.");
    }

}
