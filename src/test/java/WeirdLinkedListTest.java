import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WeirdLinkedListTest {
    private WeirdLinkedList.LinkedListNode createLinkedList(int[] arr){
        WeirdLinkedList.LinkedListNode result = null;

        for (int x : arr) {
            result = WeirdLinkedList.insertNodeIntoSinglyLinkedlist(result, String.valueOf(x));
        }

        return result;
    }

    @Test
    public void find() throws Exception {
        int[] inputList = new int[]{1, 2, 3};
        int[] inputSubList = new int[]{2, 3};

        int expected = 1;

        WeirdLinkedList.LinkedListNode list = createLinkedList(inputList);
        WeirdLinkedList.LinkedListNode subList = createLinkedList(inputSubList);;

        int result = WeirdLinkedList.find(list, subList);

        assertEquals(expected, result);
    }

    @Test
    public void notFound() throws Exception {
        int[] inputList = new int[]{1, 2, 3};
        int[] inputSubList = new int[]{3, 2};

        int expected = -1;

        WeirdLinkedList.LinkedListNode list = createLinkedList(inputList);
        WeirdLinkedList.LinkedListNode subList = createLinkedList(inputSubList);;

        int result = WeirdLinkedList.find(list, subList);

        assertEquals(expected, result);
    }
}
