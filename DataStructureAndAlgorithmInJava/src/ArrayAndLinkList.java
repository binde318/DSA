import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayAndLinkList {
    //comparing Arraylist and LinkedList
    public static void main(String[] args) {
        LinkedList<Integer>linkedList = new LinkedList<>();
        ArrayList<Integer>arrayList = new ArrayList<>();

        long startTime;
        long endTime;
        long elapseTime;
        for (int i = 0; i < 100; i++){
            linkedList.add(i);
            arrayList.add(i);
        }
        //**************LinkedList************
        startTime= System.nanoTime();
        //linkedList.get(0);
        linkedList.get(50);

        endTime= System.nanoTime();

        elapseTime = endTime - startTime;

        System.out.println("Linkedlist:\t" + elapseTime + " ns");

        //****************ArrayList*******************
        startTime= System.nanoTime();
        //arrayList.get(0);
        arrayList.get(50);

        endTime= System.nanoTime();

        elapseTime = endTime - startTime;

        System.out.println("ArrayList:\t" + elapseTime + " ns");

    }
}
