package DSA.twod_Array;

public class Prefix_Sum {
    public static void main(String[] args)
    {
        int a[][] = {
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1}
        };
        //(0,2)(3,3)
        int r1 = 0;
        int r2 = 3;
        int c1 = 2;
        int c2 = 3;

        int sum = 0;
        for(int i=r1;i<=r2;i++)
        {
            for(int j=c1;j<=c2;j++)
            {
                sum+=a[i][j];
            }
        }

        System.out.println("Sum of prefix values are : "+sum);
    }
}
