package TechGig;

public class Sample {
    public static void display(int a, double b){
        System.out.println(a+b);
    }
   /* public double display(int r, double s){
        return r+s;
    }*/

    public static void main(String[] args) {
        Sample sample = new Sample();
        Sample.display(3, 5.4);

    }
}
