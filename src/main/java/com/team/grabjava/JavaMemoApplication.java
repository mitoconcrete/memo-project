package com.team.grabjava;

import com.team.grabjava.entities.Memo;
import com.team.grabjava.presentation.UserInterface;
import com.team.grabjava.service.JavaMemoService;

import java.util.List;
import java.util.Scanner;

public class JavaMemoApplication {
    public static void main(String[] args) {
        UserInterface UI = new UserInterface();
        JavaMemoService memoService = new JavaMemoService();



        while (true){   // 무한반복할 때 while
            UI.run();   // UI에 있는 run을 실행
            UI.numberInputReceive();
            Scanner inputValue = new Scanner(System.in);    // 스캐너로 inputValue에 대입
            String response = inputValue.nextLine();        // response라는 변수에 대입

            if (response.equals("1")){   // 1. 입력
                UI.contentReceive();
                String[] createResponse = inputValue.nextLine().split(" ");
                String name = createResponse[0];
                String password = createResponse[1];
                String memo = createResponse[2];
                boolean apiResult = memoService.addMemo(name, password, memo);
                if(apiResult){
                    UI.memoSave();
                }else{
                    UI.createInputError();
                }
            } else if (response.equals("2")) {   // 2. 목록 보기
                List<Memo> memoList = memoService.getMemoList();
                UI.getMemoList(memoList);
            } else if (response.equals("3")) {   // 3. 수정하기
                UI.numberInputReceive();
                int updateTargetId = Integer.parseInt(inputValue.nextLine());
                boolean updateTargetFindApiResult = memoService.hasMemoFindById(updateTargetId);
                if(updateTargetFindApiResult){
                    UI.changeMemo();
                    String updatePayload = inputValue.nextLine();
                    UI.passwordInputReceive();
                    String passwordForUpdate = inputValue.nextLine();
                    boolean updateApiResult = memoService.updateMemo(updateTargetId, passwordForUpdate, updatePayload);
                    if (updateApiResult) {
                        UI.revise();
                    }else{
                        UI.passwordChangeFail();
                    }
                }else{
                    UI.reviseFail();
                }
            } else if (response.equals("4")) {   // 4. 삭제하기
                UI.deleteMemoNumber();
                int deleteTargetId = Integer.parseInt(inputValue.nextLine());
                boolean deleteTargetFindApiResult = memoService.hasMemoFindById(deleteTargetId);    // 빌런누구야
                if(deleteTargetFindApiResult){
                    UI.passwordInputReceive();
                    String passwordForDelete = inputValue.nextLine();
                    boolean deleteApiResult = memoService.deleteMemo(deleteTargetId, passwordForDelete);
                    if(deleteApiResult){
                        UI.delete();
                    }else{
                        UI.createInputError();
                    }
                }
            } else if (response.equals("5")) {   // 종료메뉴
                UI.closeMessage();
                System.exit(0);
            }
        }
    }
}
