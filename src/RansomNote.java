import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.HashMap;

public class RansomNote {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }

        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for(int i=0;i<magazine.length;i++){
            Integer cnt = hm.get(magazine[i]);
            if(cnt == null){
                hm.put(magazine[i], 1);
            }
            else{
                hm.put(magazine[i], ++cnt);
            }
        }


        for(int i=0;i<ransom.length;i++){
            Integer cnt = hm.get(ransom[i]);
            if(cnt == null || cnt == 0){
                System.out.println("No");
                return;
            }
            else{
                hm.put(ransom[i], --cnt);
            }
        }
        System.out.println("Yes");

    }
}
