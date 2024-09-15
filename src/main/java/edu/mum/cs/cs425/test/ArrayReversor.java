package edu.mum.cs.cs425.test;

public class ArrayReversor {

    private final ArrayFlattener arrayFlattener;

    public ArrayReversor(ArrayFlattener arrayFlattener) {
        this.arrayFlattener = arrayFlattener;
    }

    public int[] reverseArray(int[][] nestedArray) {
        int[] flattenedArray = arrayFlattener.flattenArray(nestedArray);
        if (flattenedArray == null) {
            return null;
        }

        int[] reversedArray = new int[flattenedArray.length];
        for (int i = 0; i < flattenedArray.length; i++) {
            reversedArray[i] = flattenedArray[flattenedArray.length - 1 - i];
        }

        return reversedArray;
    }

}
