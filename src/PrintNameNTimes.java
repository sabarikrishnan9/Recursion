import java.util.Scanner;

public class PrintNameNTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of times to print the name");
        int n = sc.nextInt();
        String name = sc.next();

        PrintName(1,name,n);
    }

    public static void  PrintName(int i,String name,int n){
        if(i<=n)
        {
            System.out.println(name);
            PrintName( i+1,name,n);
        }
    }
}
