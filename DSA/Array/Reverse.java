package DSA.Array;



public class Reverse {
    public static void main(String[] args)
    {
        int a[] = {1,2,4,5};
        int n = a.length;
        for(int i=0;i<n/2;i++)
        {
            int temp = a[i];
            a[i] = a[n-i-1];
            a[n-i-1] = temp;
        }
        for(int j=0;j<n;j++)
        {
            System.out.println(a[j]);
        }
    }
}
