package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
        public void sort(List<String> sourceList) {
            for (int i = 0; i < sourceList.size(); i++) {
                for (int j = 0; j < sourceList.size(); j++) {
                    if(Math.abs(Integer.parseInt(sourceList.get(i))) < Math.abs(Integer.parseInt(sourceList.get(j)))) {
                        String c = sourceList.get(i);
                        sourceList.set(i,sourceList.get(j));
                        sourceList.set(j,c);
                    }
                }
            }
        }
    }

    class ListComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            return a.compareTo(b);
        }
    }