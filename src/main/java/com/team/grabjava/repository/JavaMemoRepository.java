package com.team.grabjava.repository;

import com.team.grabjava.entities.Memo;
import com.team.grabjava.entities.MemoList;

import java.util.List;

public class JavaMemoRepository implements MemoRepository{
    private MemoList memoDB = new MemoList();

    public List<Memo> getMemoList() {
        return this.memoDB.getMemoList();
    }

    @Override
    public void addMemo(String writer, String password, String memo) {
        this.memoDB.addMemo(writer, password, memo);
    }

    @Override
    public Memo getMemoById(int id) {
        return memoDB.getMemoById(id);
    }

    @Override
    public void updateMemo(int id, String password, String updatePayload) {
        Memo memo = getMemoById(id);
        if (memo == null) throw new IllegalArgumentException("메모가 존재하지 않습니다.");
        if (!memo.getPassword().equals(password)) throw  new IllegalArgumentException("패스워드가 일치하지 않습니다.");
        memoDB.updateMemo(memo, updatePayload);
    }

    @Override
    public void deleteMemo(int id, String password) {
        Memo memo = getMemoById(id);
        if (memo == null) throw new IllegalArgumentException("메모가 존재하지 않습니다.");
        if (!memo.getPassword().equals(password)) throw  new IllegalArgumentException("패스워드가 일치하지 않습니다.");
        memoDB.deleteMemo(memo);
    }
}
