package com.team.grabjava.service;

import com.team.grabjava.entities.Memo;
import java.util.List;

public interface MemoService {

    boolean addMemo(String writer, String password, String memo);
    boolean updateMemo(int id, String password, String updatePayload);
    boolean deleteMemo(int id, String password);
    List<Memo> getMemoList();
    boolean hasMemoFindById(int id);
}
