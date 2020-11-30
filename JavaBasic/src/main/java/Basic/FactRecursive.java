class Factorial {
    public static void main(String[] args) {
        System.out.println(getFacto(5));
        System.out.println(getFactorial(5));
    }

    static int getFacto(int i ){
        if (i == 0)
            return 1;
        return i*getFacto(i-1);
    }

    static int getFactorial(int j){
        int a=1;
        while (j != 0){
            a= j *a;
            j--;
        }

        return  a;
    }
}
