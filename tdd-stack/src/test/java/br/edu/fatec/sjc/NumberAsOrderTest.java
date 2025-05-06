package br.edu.fatec.sjc;

import org.junit.jupiter.api.Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class NumberAsOrderTest {
    @Test
    public void testSortWithSixNumbers() throws StackEmptyException {
        Deque<Integer> stackData = new ArrayDeque<>(List.of(45, 12, 33, 9, 27, 6));
        CustomStack<Integer> mockStack = mock(CustomStack.class);

        when(mockStack.isEmpty()).thenAnswer(invocation -> stackData.isEmpty());

        when(mockStack.pop()).thenAnswer(invocation -> stackData.pop());

        NumberAscOrder<Integer> sorter = new NumberAscOrder<>(mockStack);
        List<Integer> result = sorter.sort();

        List<Integer> expected = List.of(6, 9, 12, 27, 33, 45);
        assertEquals(expected, result);
    }

    @Test
    public void testSortWithEmptyStack() throws StackEmptyException {
        CustomStack<Integer> mockStack = mock(CustomStack.class);
        when(mockStack.isEmpty()).thenReturn(true);

        NumberAscOrder<Integer> sorter = new NumberAscOrder<>(mockStack);
        List<Integer> result = sorter.sort();

        assertTrue(result.isEmpty());
    }
}
