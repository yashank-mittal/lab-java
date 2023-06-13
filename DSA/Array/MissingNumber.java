package DSA.Array;

public class MissingNumber {
    public static void main(String[] args)
    {
        int a[] = {1,3,4,2,6,7};
        int m = a.length;
        int n = m+1;
        int sum = 0;
        // Sum of all Natural Numbers
        int sumOfNatural = (n*(n+1))/2;
        
        // Sum of all arrays
        for(int s : a)
        {
            sum+=s;
        }
        
        //Missing Number 
        int missingNo = sumOfNatural -sum;
        System.out.println("Missing No is : "+missingNo);
    }
}
