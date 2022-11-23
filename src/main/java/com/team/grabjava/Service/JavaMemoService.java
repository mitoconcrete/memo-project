package com.team.grabjava.Service;


import com.team.grabjava.Entities.Memo;
import com.team.grabjava.Repository.JavaMemoRepository;
import com.team.grabjava.Repository.MemoRepository;

import java.util.List;


public class JavaMemoService implements MemoService{

    MemoRepository memoRepository = new JavaMemoRepository();

    @Override
    public boolean addMemo(String writer, String password, String memo) {
        memoRepository.addMemo(writer, password, memo);
        return true;
    }

    @Override
    public boolean updateMemo(int id, String password, String updatePayload) {
        try {
            memoRepository.updateMemo(id, password, updatePayload);
        } catch (IllegalArgumentException e) {
            System.out.println("Error : " + e.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public boolean deleteMemo(int id, String password) {
        try {
            memoRepository.deleteMemo(id, password);
        } catch (IllegalArgumentException e) {
            System.out.println("Error : " + e.getMessage());
            return false;
        }
        return true;
    }

    @Override
    public List<Memo> getMemoList() {
        return memoRepository.getMemoList();
    }

    @Override
    public boolean hasMemoFindById(int id) {
        Memo memo = memoRepository.getMemoById(id);
        return memo != null;
    }
}
