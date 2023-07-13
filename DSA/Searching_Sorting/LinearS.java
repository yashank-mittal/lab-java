package DSA.Searching_Sorting;

import java.util.Scanner;

public class LinearS {
    public static void main(String[] args)
    {
        int a[] = {1,2,4,3,5,7};
        System.out.println("Enter searching element : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count =1,flag = 0;
        for(int ele : a)
        {
            if(ele == x)
            {
                System.out.println("Searching element is found in position  :"+count);
                flag = 1;
                break;
            }
            else{
                count++;
            }
        }
        if(flag == 0)
        {
            System.out.println("Searching Element not found");
        }
    }
}
