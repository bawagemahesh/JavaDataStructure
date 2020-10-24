package Volkswagen;

public class TP {
    public static void main(String[] args) {
        int iRtr = new TP().testMethod();
        System.out.println("Returned value of i - "+iRtr);
    }

    public void test(int x){
        int odd= x%2;
        //if (odd){ error required boolean provided int
        if (odd==0){
            System.out.println("Odd");
        }else{
            System.out.println("Even");
        }

    }
    public int testMethod()
    {
        int i=0;
        try {
            i=100/0;
            return i;
        }catch (ArithmeticException e){
            i=200/0;
            return i;
        }finally {
            i=300;
        }
    }

}
