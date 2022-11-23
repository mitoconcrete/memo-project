package com.team.grabjava.Entities;

import com.team.grabjava.Utils.MemoDateComparator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MemoList {
    // 여러 건의 메모를 저장하는 클래스이다.
    private List<Memo> memoList = new ArrayList<Memo>();

    // 메모 전체를 조회 할 수 있다.
    public List<Memo> getMemoList() {
        // 작성 최신 순으로 메모를 출력한다.
        memoList.sort(new MemoDateComparator());
        return memoList;
    }

    // 1건의 글을 메모 리스트에 추가 할 수 있다.
    public void addMemo(String writer, String password, String memo){
        int id = memoList.size() + 1;
        memoList.add(new Memo(id, writer, password, memo));
    }


    // 글의 수정 또는 삭제 시 글 번호를 넘겨 받고, 리스트에서 글 번호에 해당하는 글 1건을 얻어와 리턴시키는 메소드가 있다.
    public Memo getMemoById(int id){
        for(Memo memo: this.memoList){
            if(memo.getId() == id){
                return memo;
            }
        }
        return null;
    }

    // 해당되는 글 1건을 수정하는 메소드가 있다.
    public void updateMemo(Memo memo, String payload){
        memo.setMemo(payload);
    }

    // 글 1건을 삭제하는 메소드가 있다.
    public void deleteMemo(Memo targetMemo) {
        Iterator<Memo> iterator = memoList.iterator();
        int id = 1;
        // 해당되는 것 삭제.
        while (iterator.hasNext()) {
            Memo memo = (Memo) iterator.next();
            if (memo.equals(targetMemo)) {
                iterator.remove();
                break;
            }
        }
        // 삭제 후 글 번호를 다시 붙혀준다.
        // 글이 삭제된 후 새 글이 입력될 때 idx가 기존 idx값에 이어서 1씩 증가할 수 있도록 count의 값을 수정한다.
        for(int i = 0; i < memoList.size(); i++){
            Memo memo = memoList.get(i);
            memo.setId(i + 1);
        }
    }
}