package home.lr3.task4;

import java.util.regex.*;

public class Regular {

    private static final String NAME = "Vadim Simes";
    private static final String PHONE = "+380503665599";
    private static final String MAIL = "cat-buster_1@ua.fm";

    public static void main(String[] args) {

        System.out.println(Pattern.matches("^\\+380(50|67|63)[0-9]{7}$", PHONE));
        System.out.println(Pattern.matches("^[a-zA-Z0-9_\\-.]+@[a-zA-Z.]+?\\.[a-zA-Z]{2,6}$", MAIL));
        System.out.println(Pattern.matches("^[A-Z][a-z]+ [A-Z][a-z]+$", NAME));
    }

}

