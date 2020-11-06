package com.company;

import java.util.ArrayList;

public class Search {
    public ArrayList<Student> IDNumber = new ArrayList<>();

    public Search(ArrayList<Student> IDNumber) {
        this.IDNumber = IDNumber;
    }
    public int linSearch(Student obj) {
        int index = -1;
        for (int i = 0; i < IDNumber.size(); i++) {
            if (obj.equals(IDNumber.get(i))) {
                index = i + 1;
            }
        }
        return index;
    }
    public int binSearch(Student key, int low, int high, int a) {
        int mid = (low + high)/2;
        if (IDNumber.indexOf(IDNumber.get(mid)) == IDNumber.indexOf(key)) {
            return mid + 1;
        }
        else if (IDNumber.indexOf(IDNumber.get(mid)) < IDNumber.indexOf(key)) {
            return binSearch(key, mid + 1, high, a);
        }
        else if (IDNumber.indexOf(IDNumber.get(mid)) > IDNumber.indexOf(key)) {
            return binSearch(key, low, mid - 1, a);
        }
        return 0;
    }
}
