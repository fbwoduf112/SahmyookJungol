package q501;

import java.io.*;
import java.util.*;

public class Over{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        Test1 test = new Test1();
        Test1 test1 = new Test1(st.nextToken(), st.nextToken());
    }

}

class Test1{
    String School = "Jejuelementary";
    String grade = "6";


    public Test1(String School, String grade){
        this.School = School;
        this.grade = grade;
        System.out.println(grade + " grade in " + School + " School");
    }
    public Test1(){
        System.out.println(grade + " grade in " + School + " School");
    }
}