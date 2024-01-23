
import java.util.*;
public class Classroom {

    public class Student {
        int phy, math, che, bio;

        Student(int phy, int math, int che, int bio) {
            this.bio = bio;
            this.phy = phy;
            this.che = che;
            this.math = math;
        }

    }

    public static void main(String[] args) {

        ArrayList<Integer> sp = new ArrayList<>();
        System.out.println(sp);
        int n = 5;
        for (int i = 0; i <= n + n; i++) {
            sp.add(i);
        }
        System.out.println(sp);
        System.out.println("getting  " + sp.get(02));
        System.out.println(sp.contains(88));
        System.out.println(sp);
        sp.add(1, 66);
        System.out.println(sp);

        System.out.println(sp.size());
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

        ArrayList<ArrayList<Integer>> num = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                even.add(i);
            } else {
                odd.add(i);
            }

        }

        num.add(even);
        num.add(odd);
System.out.println(" even blank " +even);
System.out.println("odd bank is " +odd);
System.out.println(num);
///////////

int[] arr = new int[10];
for(int i = 0; i<arr.length-1; i++){
   arr[i] = i+1;
}
int temp  ;

for(int  i = 0; i<arr.length; i++){
    
  if(arr[i]==0){ 
    System.out.print("null");
}}


    

Scanner sc = new Scanner(System.in);
System.out.println("enter idx && data ");
int idx = sc.nextInt();
int data = sc.nextInt();
for(int  i = 0; i<arr.length; i++){
    if(i<idx){

    }else{
        temp = arr[i];
        arr[i] = data;
        data =  temp; 
    }
}


for(int  i = 0; i<arr.length; i++){
    System.out.print(" "+arr[i]);
}


    }
} 