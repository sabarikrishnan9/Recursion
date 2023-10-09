import java.util.*;
 class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int count =1;
        print(count);


    }

    static void print(int count){

        System.out.println(count);
        count++;
        print(count);
    }

}