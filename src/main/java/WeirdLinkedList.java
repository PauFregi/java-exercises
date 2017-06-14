public class WeirdLinkedList {

    public static class LinkedListNode{
        String val;
        LinkedListNode next;

        LinkedListNode(String node_value) {
            val = node_value;
            next = null;
        }
    }

    public static LinkedListNode insertNodeIntoSinglyLinkedlist(LinkedListNode head, String val){
        if(head == null) {
            head = new LinkedListNode(val);
        }
        else {
            LinkedListNode end = head;
            while (end.next != null) {
                end = end.next;
            }
            LinkedListNode node = new LinkedListNode(val);
            end.next = node;
        }
        return head;
    }

    public static int find(LinkedListNode list, LinkedListNode subList){
        boolean found = false;
        int index = 0;
        while (!found && list != null){
            found = match(list, subList);
            list = list.next;
            if (!found) index++;
        }
        return (found) ? index : -1;
    }

    public static boolean match(LinkedListNode list, LinkedListNode subList){
        if(subList == null) return true;
        if(list == null) return false;
        if(!list.val.equals(subList.val)) return false;
        return match(list.next, subList.next);
    }

}
