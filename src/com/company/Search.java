package com.company;

import java.util.ArrayList;

public class Search {
    public ArrayList<Student> idNumber = new ArrayList<>();

    public Search(ArrayList<Student> idNumber) {
        this.idNumber = idNumber;
    }
    public int linSearch(Student obj) {
        int index = -1;
        for (int i = 0; i < idNumber.size(); i++) {
            if (obj.equals(idNumber.get(i))) {
                index = i + 1;
            }
        }
        return index;
    }
    public int binSearch(int key, int low, int high, int a) {
        int mid = (low + high)/2;
        if (idNumber.get(mid).equals(idNumber.get(key))) {
            return mid + 1;
        }
        else if (mid < key) {
            return binSearch(key, mid + 1, high, a);
        }
        else if (mid > key) {
            return binSearch(key, low, mid - 1, a);
        }
        return 0;
    }
}
