package q501;

import java.util.*;
import java.io.*;

public class Q555{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String result = "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ' ') result+=str.charAt(i);
        }
        System.out.print(result);
    }
}