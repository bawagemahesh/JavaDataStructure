package Volkswagen;


enum Animals {
    DOG("woof"),
    CAT("mmao"),
    FISH("burble");
    String sound;

    Animals(String s) {
        sound = s;
    }
}

public class TestEnum {
    static Animals s;

    public static void main(String[] args) {
System.out.println(s.DOG.sound +" "+s.FISH.sound);    }
}
