package back_end.java.memoproject.src.main.java.com.team.grabjava.Presentation;

public class UserInterface {
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

}
