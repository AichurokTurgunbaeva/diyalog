package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            diyalog();

    }

    static void diyalog() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Салам, атын ким?");
        String a = scanner.nextLine();
        System.out.println(a+ " - абдан сонун ат экен. Кандайсыз?");
        String b = scanner.nextLine();
        System.out.println("Бугун кайсы кун?");
        String c = scanner.nextLine();
        System.out.println("Чон рахмат, ийгиликтуу кун каалаймын!");
    }
}
