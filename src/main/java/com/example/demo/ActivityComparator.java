package com.example.demo;

import java.util.Comparator;

public class ActivityComparator implements Comparator<Activity> {
    public int compare (Activity A1, Activity A2) {
        if (A1.getId() == A2.getId()) return 0;
        else if (A1.getId() > A2.getId()) return -1;
        else return 1;
    }
}
