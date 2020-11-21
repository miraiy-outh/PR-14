package com.company;

import java.util.ArrayList;

public class Search {
    public ArrayList<Student> idNumber = new ArrayList<>();
    private StudentComparator comparator = new StudentComparator();

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
    public int binSearch(Student key, int low, int high) {
        int mid = (low + high)/2;
        if (idNumber.get(mid).equals(key)) {
            return mid + 1;
        }
        else if (comparator.compare(idNumber.get(mid), key) == 1) {
            return binSearch(key, mid + 1, high);
        }
        else if (comparator.compare(idNumber.get(mid), key) == -1) {
            return binSearch(key, low, mid - 1);
        }
        return 0;
    }
}
