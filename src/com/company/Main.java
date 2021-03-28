package com.company;
import java.util.*;

public class Main {

    public static int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> b[1] - a[1]);
        int maxBox = 0;
        for (int[] boxType: boxTypes) {
            int numBox = Math.min(truckSize, boxType[0]);
            maxBox += numBox * boxType[1];
            truckSize -= numBox;
            if (truckSize==0) {
                break;
            }
        }
        return maxBox;
    }

    public static void main(String[] args) {
	int[][] boxTypes = {{5,10},{2,5},{4,7},{3,9}};
    int max = maximumUnits(boxTypes, 12);
    System.out.println(max);
    }
}
