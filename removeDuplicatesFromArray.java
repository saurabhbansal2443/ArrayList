import java.util.ArrayList;

public class removeDuplicatesFromArray {
    public static void main(String[] args) {
        int[] arr = {1,1,2,1,4,1,5,3,3,2,7,2,9};

        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            int ele = arr[i];

            boolean flag = al.contains(ele);

            if(flag==false){
                al.add(ele);
            }
        }

        System.out.println(al);
    }
}
