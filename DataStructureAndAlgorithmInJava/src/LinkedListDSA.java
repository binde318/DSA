import java.util.LinkedList;

public class LinkedListDSA {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        //insertion method and deletion method
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("E");
        linkedList.offer("F");
        linkedList.add(4,"J"); //insert elements
        linkedList.remove("A"); //delete element
        System.out.println(linkedList.indexOf("F"));
        System.out.println(linkedList.peekFirst()); //get the first element in the list
        System.out.println(linkedList.peekLast());//get the last element in the list
        linkedList.addFirst("M");  //add or insert element at the top of the linkedlist
        linkedList.addLast("Y"); //add or insert element at the end or bottom of linkedlist
        //linkedList.poll();
        System.out.println(linkedList);
        System.out.println(linkedList.size());
        System.out.println(linkedList.pollFirst());
    }
}
