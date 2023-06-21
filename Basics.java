import java.util.*;

public class Basics{
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
  // add at last 
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);

// add at specific index
       //al.add(2,30);
   // Remove at specific index;
   
       //al.remove(2);

       // get at specific index

       //int ele = al.get(2);

       // set at index

       //al.set(2,99);

       // size of the arrayList

       //int l = al.size();

         //. remove all the elements from arrayList

         //al.clear();

         // check contains 

         boolean flag = al.contains(700);
        System.out.println(flag);
    }
}