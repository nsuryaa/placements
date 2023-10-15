package tcs_nqt.Arrays;

public class Problem9
{
    public static void main(String[] args) {
        int n=5;
        int arr[] = {1,2,3,4,5};
        double sum=0;
        for(int i=0;i<n;i++)
        {
            sum += (double) arr[i];
        }
        double average = sum / n;
        System.out.println(average);
    }
}