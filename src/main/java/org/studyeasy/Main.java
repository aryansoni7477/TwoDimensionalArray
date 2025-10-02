package org.studyeasy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TwoDimensionalArray arr1=new TwoDimensionalArray(3,3);
        arr1.insertValueInArray(0,0,10);
        arr1.insertValueInArray(0,1,20);
        arr1.insertValueInArray(0,2,30);
        arr1.insertValueInArray(1,0,40);
        arr1.insertValueInArray(1,1,50);
        arr1.insertValueInArray(1,2,60);
        arr1.insertValueInArray(2,0,70);
        arr1.insertValueInArray(2,1,80);
        arr1.insertValueInArray(2,2,90);
//        System.out.println(Arrays.deepToString(arr1.arr));
//        arr1.accessValueInArray(2,1);
//        arr1.traverse2dArray();
        arr1.search(74);
        arr1.deleteValueInArray(2,1);
        arr1.traverse2dArray();
        arr1.deleteValueInArray(2,2);
        arr1.traverse2dArray();

    }

}