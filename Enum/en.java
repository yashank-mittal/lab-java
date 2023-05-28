package Enum;

enum Result
{
    PASS,FAIL,NR;
    int marks;
    void setMarks(int marks)
    {
        this.marks = marks;
    }
    public int getMarks()
    {
        return marks;
    }
}

public class en {
    public static void main(String[] args)
    {
        Result.PASS.setMarks(50);
        int Resut = Result.PASS.getMarks();
        System.out.println(Resut);
        int marks = Result.FAIL.getMarks();
        System.out.println(marks);
        Result.NR.setMarks(45);
        int m3 = Result.NR.getMarks();
        System.out.println(m3);
    }
}
