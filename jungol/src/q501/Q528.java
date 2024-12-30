package q501;

import java.util.*;
import java.io.*;
public class Q528{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        if(a < 0) {
            System.out.println(a);
            System.out.print("minus");
    }
    else System.out.println(a);
    }
}