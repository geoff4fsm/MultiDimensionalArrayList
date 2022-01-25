import java.io.*;
import java.util.*;

public class MultiDimentionalArrayList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of lines: ");
        int n = input.nextInt();
        int d, q, x, y, num;
        ArrayList[] arr = new ArrayList[n];
        for(int i = 0; i < n; i++){
            System.out.println("Enter number of integers on this line: ");
            d = input.nextInt();
            arr[i] = new ArrayList();
            System.out.println("Enter " + d + " integers");
            for(int j = 0; j < d; j++){
                num =  input.nextInt();
                arr[i].add(num);
            }
        }
        System.out.println("Enter number of queries: ");
        q = input.nextInt();
        for(int i = 0;i < q; i++){
            System.out.println("Enter x and y integers:");
            x=input.nextInt();
            y=input.nextInt();
            try{
                System.out.println(arr[x-1].get(y-1));
            } catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
