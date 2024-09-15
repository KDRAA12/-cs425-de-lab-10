package edu.mum.cs.cs425.test;


public class ArrayFlattener {

    public int[] flattenArray(int[][] nestedArray) {
        if (nestedArray == null) {
            return null;
        }

        return java.util.Arrays.stream(nestedArray)
                .flatMapToInt(java.util.Arrays::stream)
                .toArray();
    }


}

