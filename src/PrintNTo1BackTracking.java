import java.util.Scanner;

public class PrintNTo1BackTracking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Nto1BackTrack(1,n);

    }

    private static void Nto1BackTrack(int i, int n) {

        if(i>n)
        {
            return;
        }
        Nto1BackTrack(i+1,n);
        System.out.println(i);

    }


}