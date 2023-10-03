package com.java.tree;

public class Main {
    public static void main(String[] args) {
        int r = 0;
        r = (int) (r +( Math.pow(2, 1)));
        Node<Character> a = new Node<>('A');
        Node<Character> b = new Node<>('B');
        Node<Character> c = new Node<>('C');
        Node<Character> d = new Node<>('D');
        Node<Character> e = new Node<>('E');
        Node<Character> f = new Node<>('F');
        Node<Character> g = new Node<>('G');
        Node<Character> h = new Node<>('H');
        Node<Character> i = new Node<>('I');
        Node<Character> j = new Node<>('J');
        Node<Character> k = new Node<>('K');
        Node<Character> l = new Node<>('L');

        a.setLeftChild(b);
        a.setRightChild(c);
        b.setLeftChild(d);
        b.setRightChild(e);
        d.setLeftChild(f);
        d.setRightChild(g);
        e.setLeftChild(h);
        e.setRightChild(i);
        g.setLeftChild(j);
        g.setRightChild(k);
        h.setRightChild(l);

        Node<String> alice = new Node<>("Alice");
        Node<String> bob = new Node<>("Bob");
        Node<String> charles = new Node<>("Charles");
        Node<String> dora = new Node<>("Dora");
        Node<String> elsa = new Node<>("Elsa");
        Node<String> fiona = new Node<>("Fiona");
        Node<String> greg = new Node<>("Greg");
        Node<String> harry = new Node<>("Harry");

        System.out.println("**********************************");
        //BreathFirst.breathFirst(a);
        alice.setLeftChild(bob);
        alice.setRightChild(charles);
        bob.setLeftChild(dora);
        bob.setRightChild(elsa);
        dora.setLeftChild(fiona);
        dora.setRightChild(harry);
        elsa.setLeftChild(greg);

        //BreathFirst.breathFirstWithPair(alice);

        DeptFirst.inOrderStack(alice);
        System.out.println("\n**********************************");
        DeptFirst.inOrderRecurrsion(alice);
    }


}
