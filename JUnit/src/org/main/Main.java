package org.main;

public class Main {

    public static void main(String[] args) {

        boolean allBeginningWithA = isAllBeginningWithA(args);
        if (allBeginningWithA) {
            System.out.println("hi");
        } else {
            System.out.println("bye");
        }
    }

    public static boolean isAllBeginningWithA(String[] args) {
        for (int i = 0; i < args.length; i++) {
            char c = args[i].charAt(0);
            if (c != 'a' && c != 'A') {
                return false;
            }
        }
        return true;
    }
}
