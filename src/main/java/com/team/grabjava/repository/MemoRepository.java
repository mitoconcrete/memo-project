package com.team.grabjava.repository;

import com.team.grabjava.entities.Memo;

import java.util.List;

public interface MemoRepository {

    List<Memo> getMemoList();
    void addMemo(String writer, String password, String memo);
    Memo getMemoById(int id);
    void updateMemo(int id, String password, String updatePayload);
    void deleteMemo(int id, String password);
}
