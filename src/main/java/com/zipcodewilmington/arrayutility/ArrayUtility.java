package com.zipcodewilmington.arrayutility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<Type extends Object> {
    public Type[] inputArray;

    public ArrayUtility(Type[] inputArray) {
        this.inputArray = inputArray;
    }

    public Integer countDuplicatesInMerge(Type[] arrayToMerge, Type valueToEvaluate) {
        ArrayList<Type> mergedList = new ArrayList<>(Arrays.asList(inputArray));
        mergedList.addAll(Arrays.asList(arrayToMerge));
        Integer count = 0;

        for (Type value: mergedList) {
            if(value.equals(valueToEvaluate)) {
                count++;
            }
        }
        return count;
    }

    public Type[] removeValue(Type valueToRemove) {
        ArrayList<Type> newArrayList = new ArrayList<>();
        for(Type value : inputArray) {
            if(!value.equals(valueToRemove)) {
                newArrayList.add(value);
            }
        }

        Type[] newArray = Arrays.copyOf(inputArray, newArrayList.size());

        for(int i = 0; i < newArrayList.size(); i++) {
            newArray[i] = newArrayList.get(i);
        }
        return newArray;
    }

    public Type getMostCommonFromMerge(Type[] arrayToMerge) {
        ArrayList<Type> mergedList = new ArrayList<>(Arrays.asList(inputArray));
        mergedList.addAll(Arrays.asList(arrayToMerge));
        Type mostCommon = null;
        int counter = 0;

        for(int i = 0; i < mergedList.size(); i++) {
            int tempCounter = 0;
            Type tempMostCommon = mergedList.get(i);
            for(int j = 0; j < mergedList.size(); j++) {
                if(mergedList.get(i).equals(mergedList.get(j))) {
                    tempCounter++;
                }
            }
            if (tempCounter > counter) {
                counter = tempCounter;
                mostCommon = tempMostCommon;
            }
        }
        return mostCommon;
    }

    public Integer getNumberOfOccurrences(Type valueToEvaluate) {
        Integer count = 0;

        for (Type value: inputArray) {
            if(value.equals(valueToEvaluate)) {
                count++;
            }
        }
        return count;
    }
}
