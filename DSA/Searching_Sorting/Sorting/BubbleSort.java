package DSA.Searching_Sorting.Sorting;

public class BubbleSort {
    public static void main(String[] args)
    {
        int a[] = {20,40,50,100,90,10};

        //Bubble sort
        for(int i=0;i<a.length;i++)
        {   
            System.out.println("No. of Iterations : "+i);
            for(int x : a)
            {
                System.out.print(x+" ");
            }
            System.out.println();

            for(int j=0;j<a.length-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
