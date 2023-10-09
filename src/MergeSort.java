
import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {
    public static  void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements to sort");
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        mergesort(arr,0,n-1);

        System.out.println("After Sorting");

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    private static void mergesort(int[] arr, int low, int high) {

        if(low>=high)
            return;
        int mid = (low+high)/2;

        mergesort(arr, low, mid);
        mergesort(arr, mid+1, high);
        merge(arr,low,mid,high);
}

public static void merge(int arr[],int low,int mid,int high){

    ArrayList<Integer> Tarray = new ArrayList<>();

        int left = low;
        int right = mid+1;

        while(left<=mid && right<=high)
        {
            if(arr[left]<arr[right])
            {
                Tarray.add(arr[left]);
                left++;
            }
            else {
                Tarray.add(arr[right]);
                right++;
            }
        }

        while(left<=mid)
        {
            Tarray.add(arr[left]);
            left++;
        }
        while(right<=high)
        {
            Tarray.add(arr[right]);
            right++;
        }

        for(int i=low;i<=high;i++)
        {
            arr[i]=Tarray.get(i-low);
        }

}

}

