// https://www.hackerrank.com/challenges/ctci-making-anagrams/problem

import java.util.Scanner;

/**
 * Created by koustubhgaikwad on 12/10/17.
 */
public class Anagram {

    String a ;
    String b;

    private void getInput(){
        Scanner in = new Scanner(System.in);
        a = in.next();
        b = in.next();
    }

    public void solution(){
        getInput();
        System.out.println(numberNeeded(a, b));
        Integer.MAX_VALUE


    }

    public int numberNeeded(String a, String b){
        int count[] = new int[26];
        char achars[] = a.toCharArray();
        char bchars[] = b.toCharArray();

        for(int i=0; i<achars.length; i++){
            count[achars[i] - 97 ]++;
        }

        for(int i=0; i<bchars.length; i++){
            count[bchars[i] - 97 ]--;
        }

        int cnt = 0;
        for(int i =0; i< 26;i++){
            cnt += Math.abs(count[i]);
        }
        return cnt;

    }


}

