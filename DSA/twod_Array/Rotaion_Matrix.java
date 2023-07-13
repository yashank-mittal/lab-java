package DSA.twod_Array;

import java.util.Arrays;

public class Rotaion_Matrix {

    public static void rotation(int a[][])
    {
        //Roation Steps

        //step -1
        //Change colwnms to rows

        int n = a.length;
        int m = a[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<m;j++)
            {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        System.out.println("Step -1 Result : ");
        for(var ma : a)
        {
            System.out.println(Arrays.toString(ma));
        }

        //step - 2 : change col-1 to col-4 and 2 to 3
        for(int i=0;i<n;i++)
        {
            int li = 0;
            int ri = n-1;
            while(li < ri)
            {
                int temp = a[i][li];
                a[i][li] = a[i][ri];
                a[i][ri] = temp;

                li++;
                ri--;
            }
        }
        System.out.println("Step -2 Result : ");
    }
    public static void main(String[] args)
    {
        //2-d Matrix
        int a[][] = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        rotation(a);
        
        for(var m : a)
        {
            System.out.println(Arrays.toString(m));
        }
        
    }
}
