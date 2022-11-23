package com.team.grabjava.Service;

import Entity.Memo;
import Repository.JavaMemoRepository;
import Repository.MemoRepository;

import java.util.List;

public class JavaMemoService implements MemoService{

    MemoRepository memoRepository = new JavaMemoRepository();

    @Override
    public boolean saveMemo(String writer, String password, String memo) {
        memoRepository.saveMemo(writer, password, memo);
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
