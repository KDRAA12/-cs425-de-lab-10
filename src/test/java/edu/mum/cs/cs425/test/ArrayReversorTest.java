package edu.mum.cs.cs425.test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ArrayReversorTest {

    @Test
    public void testReverseArrayValidInput() {
        ArrayFlattener mockFlattener = Mockito.mock(ArrayFlattener.class);
        int[][] input = {{1, 3}, {0}, {4, 5, 9}};
        int[] flattenedArray = {1, 3, 0, 4, 5, 9};
        when(mockFlattener.flattenArray(input)).thenReturn(flattenedArray);
        ArrayReversor arrayReversor = new ArrayReversor(mockFlattener);
        int[] expectedOutput = {9, 5, 4, 0, 3, 1};
        assertArrayEquals(expectedOutput, arrayReversor.reverseArray(input));
        verify(mockFlattener).flattenArray(input);
    }

    @Test
    public void testReverseArrayNullInput() {
        ArrayFlattener mockFlattener = Mockito.mock(ArrayFlattener.class);
        when(mockFlattener.flattenArray(null)).thenReturn(null);
        ArrayReversor arrayReversor = new ArrayReversor(mockFlattener);
        assertNull(arrayReversor.reverseArray(null));
        verify(mockFlattener).flattenArray(null);
    }
}

