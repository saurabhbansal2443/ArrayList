import java.util.ArrayList;

public class loop {
    public static void main(String[] args) {
         ArrayList<Integer> al=new ArrayList<>();
 
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);

        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
    }
}
