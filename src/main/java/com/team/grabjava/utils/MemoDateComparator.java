package com.team.grabjava.utils;



import com.team.grabjava.entities.Memo;

import java.util.Comparator;

public class MemoDateComparator implements Comparator<Memo> {

    @Override
    public int compare(Memo o1, Memo o2) {
        return o1.getCreated_at().compareTo(o2.getCreated_at()) * -1;
    }
}
