//import ArrayLists
import java.util.ArrayList;

public class ArrayListFun {
    public static void main(String[] args) {
        //create an ArrayList of Integers
        //format is ArrayList<E> listName = new ArrayList<E>();
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

        //create an ArrayList of Doubles
        ArrayList<Double> doubleArrayList = new ArrayList<Double>();

        //create an ArrayList of Strings
        ArrayList<String> stringArrayList = new ArrayList<String>();

        //print your list of Doubles
        System.out.println(doubleArrayList);

        //add a new value to the end list of Integers then print it
        integerArrayList.add(3); //auto boxes for you
        integerArrayList.add(7);
        integerArrayList.add(12);
        integerArrayList.add(45);
        integerArrayList.add(-2);
        integerArrayList.add(18);
        System.out.println(integerArrayList);

        //add 57 at a index 2 in the Integer then print it
        integerArrayList.add(2, 57);
        System.out.println(integerArrayList);

        //get the item an index 4 in the Integer array list
        int val = integerArrayList.get(4); //unboxes into primitive
        System.out.println(val);


        //add a new value of to the Integer array list and get its size
        System.out.println(integerArrayList.size());
        integerArrayList.add(33);
        System.out.println(integerArrayList);
        System.out.println(integerArrayList.size());

        //set the item at index 3 to be 42.0 in the Doubles array, store that element, then
        // print the new list and the replaced value
        doubleArrayList.add(23.4);
        doubleArrayList.add(3.4);
        doubleArrayList.add(1.0);
        doubleArrayList.add(5.4);
        doubleArrayList.add(3.9);
        System.out.println(doubleArrayList);
        Double replacedValue = doubleArrayList.set(3, 42.0);
        System.out.println(replacedValue);
        System.out.println(doubleArrayList);

        //remove the item at index 2 in the Doubles array
        Double removedVal = doubleArrayList.remove(2);
        System.out.println(doubleArrayList);


    }
}