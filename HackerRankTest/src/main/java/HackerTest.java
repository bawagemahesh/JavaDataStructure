class A {

    public void print() {
        System.out.println("Print A");
    }
}

class B extends A {
    public void print() {
        System.out.println("Print A");
    }
}

class C extends A {
    public void print() {
        System.out.println("Print A");
    }

}

public  class HackerTest {
    public static void main(String[] args) {

        B b = new B();
        C c = new C();
        //b=c;

    }

}


