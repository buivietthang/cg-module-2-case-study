package service;

import model.Staff;

import java.util.Comparator;

public class SortByIdCard implements Comparator<Staff> {

    @Override
    public int compare(Staff o1, Staff o2) {
        return o1.getIdCard().compareTo(o2.getIdCard());
    }
}
