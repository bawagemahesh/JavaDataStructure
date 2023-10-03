package com.java.tree;

public class Main {
    public static void main(String[] args) {
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
        Node<String> irena = new Node<>("Irena");

        alice.setLeftChild(bob);
        alice.setRightChild(charles);

        bob.setLeftChild(dora);
        bob.setRightChild(elsa);

        charles.setLeftChild(fiona);
        charles.setRightChild(greg);

        dora.setLeftChild(harry);
        dora.setRightChild(irena);

        //elsa.setLeftChild(greg);

        Node<Integer> one = new Node<>(1);
        Node<Integer> two = new Node<>(2);
        Node<Integer> three = new Node<>(3);
        Node<Integer> four = new Node<>(4);
        Node<Integer> five = new Node<>(5);
        Node<Integer> six = new Node<>(6);
        Node<Integer> seven = new Node<>(7);
        Node<Integer> eight = new Node<>(8);
        Node<Integer> nine = new Node<>(9);
        Node<Integer> ten = new Node<>(10);

        one.setLeftChild(two);
        one.setRightChild(three);

        two.setLeftChild(four);
        two.setRightChild(five);

        three.setLeftChild(six);
        three.setRightChild(seven);

        four.setLeftChild(eight);
        four.setRightChild(nine);

        five.setLeftChild(ten);


        System.out.println("\n************** 1. BreathFirst.breathFirstWithQueue(a); ********************");
        BreathFirst.breathFirstWithQueue(a);
        System.out.println("\n************** 2. BreathFirst.breathFirstWithPair(alice); ********************");
        BreathFirst.breathFirstWithPair(alice);
        System.out.println("\n************** 3. BreathFirst.inOrderStack(alice); ********************");
        DeptFirst.inOrderStack(alice);
        System.out.println("\n*************** 4. DeptFirst.inOrderRecurrsion(alice) *******************");
        DeptFirst.inOrderRecurrsion(alice);
        System.out.println("\n*************** 5. DeptFirst.preOrderStack(alice) *******************");
        DeptFirst.preOrderStack(alice);
        System.out.println("\n*************** 6. DeptFirst.preOrderRecurrsion(alice) *******************");
        DeptFirst.preOrderRecurrsion(alice);
        System.out.println("\n*************** 7. DeptFirst.postOrderStack(alice) *******************");
        DeptFirst.postOrderStack(alice);
        System.out.println("\n*************** 8. DeptFirst.postOrderRecurrsion(alice) *******************");
        DeptFirst.postOrderRecurrsion(alice);

        System.out.println("\n########### 9. Problems.countNodes(alice); ########### ");
        System.out.println("Number of Nodes : "+Problems.countNodes(alice));

        System.out.println("\n########### 10. Problems.maxDepth(alice); ########### ");
        System.out.println("Max Depth of Nodes : "+Problems.maxDepth(alice));

        System.out.println("\n########### 11. Problems.hasPathSum(alice); ########### ");
        System.out.println("Max Depth of Nodes : "+Problems.hasPathSum(one, 15));

        System.out.println("\n########### 12. Before Mirror ########### ");
        BreathFirst.breathFirstWithPair(alice);

        Problems.mirrorNodes(alice);
        System.out.println("\n########### 12. After Mirror ########### ");
        BreathFirst.breathFirstWithPair(alice);

        System.out.println("\n########### 13. Problems.isFull(alice); ########### ");
        System.out.println("Is Full Binary Tree : "+Problems.isFull(alice));

        System.out.println("\n########### 14. Problems.isPerfect(alice); ########### ");
        System.out.println("Is Perfect Binary Tree : "+Problems.isPerfect(alice));


    }



}
