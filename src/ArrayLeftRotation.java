// https://www.hackerrank.com/challenges/array-left-rotation/problem

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by koustubhgaikwad on 12/10/17.
 */
public class ArrayLeftRotation {

    int n;
    int d;
    int a[];

    private void getInput(){
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        d = in.nextInt();

        if(d > n)
            d = d % n;
        this.a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
    }

    private void printResult(int[] result){
        for(int i =0;i<n;i++){
            System.out.print(result[i] + " ");
        }
    }

    //soln1
    public void copyArrays() {

        getInput();
        int left[] = Arrays.copyOfRange(a, d,n);
        int right[] = Arrays.copyOfRange(a, 0,d);
        int result[] = IntStream.concat(Arrays.stream(left), Arrays.stream(right)).toArray();
        printResult(result);

    }


    //soln2
    //can also be done while taking input
    public void sort(){
        getInput();
        int result[]= new int[n];
        for(int i=0;i<n;i++) {
            int new_position = (i + (n-d))%n;
            result[new_position] = a[i];
        }
        printResult(result);
    }
}
