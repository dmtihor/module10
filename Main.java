package com.dmtihor.homework2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        List<Flower> flowers = new ArrayList<>();
        flowers.add(new Tulip("red"));
        flowers.add(new Aster("blue"));
        flowers.add(new Aster("white"));
        flowers.add(new Chamomile("white"));
        flowers.add(new Rose("red"));
        flowers.add(new Rose("white"));
        flowers.add(new Tulip("yellow"));

        Collections.sort(flowers);

        int x = 5;

        String s1 = flowers.toString();
        System.out.println(s1);
        String s2 = (Cesar.crypt(s1, x));
        System.out.println(s2);
        UtilityIO.write("Cesar", s2);
        String s3 = (Cesar.crypt(UtilityIO.read("Cesar"), -x));
        System.out.println(s3);
    }
}
