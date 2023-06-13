package DSA.Array;

public class Duplicates {
    public static void main(String[] args)
    {
        int a[] = {1,2,4,7,5,6};
        int n = a.length;
        boolean flag = true;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i] == a[j])
                {
                    System.out.println("Duplicate value is : "+a[j]);
                    flag = false;
                    break;
                }
            }
        }
        
        if(flag == true)
        {
            System.out.println("No duplicate values are found");
        }
    }
}
