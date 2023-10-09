import java.util.Scanner;

public class Print1ToNBackTracking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        BackTrackLinear(n,n);
    }

    private static void BackTrackLinear(int i, int n) {

        if(i<1) {
            return;
        }
        BackTrackLinear(i-1, n);
        System.out.println(i);


    }
}
