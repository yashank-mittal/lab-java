class Test{
    public int add(int a,int b)
    {
        int res = a+b;
        return res;
    }
    public int add(int a,int b,int c)
    {
        int res = a+b+c;
        return res;
    }
}


public class Method_Overloading {
    public static void main(String[] args)
    {
        Test t = new Test();
        int res =t.add(1, 2);
        int res1 =t.add(1, 2,3);
        System.out.println(res);
        System.out.println(res1);
    }    
}
