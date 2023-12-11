package Basic;
class Test {
    public int value;

    public int hashcode(){
        return 42;
    }
}

class Test2{
    public int value;

    public int hashcode(){
        return (int)(value^5);
    }
}
