import java.util.Scanner;

public class PrintLinearlyFrom1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                int n = sc.nextInt();
                PrintNumbers(1,n);

    }

    private static void PrintNumbers(int i, int n) {

    if(i<=n)
    {
        System.out.println(i);
        PrintNumbers(i+1,n);
    }
    }
}
