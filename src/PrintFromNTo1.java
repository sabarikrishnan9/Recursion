import java.util.Scanner;

public class PrintFromNTo1
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        PrintNto1(N);
    }

    private static void PrintNto1(int N) {

        if(N >= 1){
            System.out.println(N);
            PrintNto1(--N);
        }

    }


}
