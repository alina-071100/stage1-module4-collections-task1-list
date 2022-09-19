package com.epam.mjc.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreator {
    public ArrayList<String> createArrayList(List<String> sourceList) {

        ArrayList<String> result = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < sourceList.size(); i++) {
            count++;
            if(count == 3){
                count = 0;
                result.add(sourceList.get(i));
                result.add(sourceList.get(i));
            }
        }
        return result;
    }
}
