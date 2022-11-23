package com.team.grabjava.Service;

import com.team.grabjava.Entities.Memo;
import java.util.List;

public interface MemoService {

    boolean saveMemo(String writer, String password, String memo);
    boolean updateMemo(int id, String password, String updatePayload);
    boolean deleteMemo(int id, String password);
    List<Memo> getMemoList();
    boolean hasMemoFindById(int id);
}
