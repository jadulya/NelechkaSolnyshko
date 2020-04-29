package ru.otus;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Abbreviate human = new Abbreviate();
        human.Scan();
        human.Fio();
    }

    static class Abbreviate {
        String name;
        public String Scan (){
            Scanner scanner = new Scanner(System.in);
            this.name = scanner.nextLine();
            return name;
        }
        public void Fio() {
            this.name = name;
            char[] array = name.toCharArray();
            for (int i = 0; i < array.length; i++) {
                if (array[i] == ' ') {
                    System.out.println(array[0] + "." + array[i + 1]);
                    break;
                }
            }
        }
    }
}
