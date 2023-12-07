package com.java8.completableFuture;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {
        Optional GOT = Optional.of("Game of Thrones");
        String[] str = new String[10];

        Optional strOpt = Optional.ofNullable(str[9]);

        System.out.println(strOpt.isPresent());
        System.out.println(GOT.isPresent());
    }
}
