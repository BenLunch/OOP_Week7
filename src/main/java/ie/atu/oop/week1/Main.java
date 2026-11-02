package ie.atu.oop.week1;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        List<Member> members = new ArrayList<>();

        System.out.println("Enter Member ID: ");
        String memberId = input.nextLine();
        System.out.println("Enter Name: ");
        String name = input.nextLine();
        System.out.println("Enter Age: ");
        int age = Integer.parseInt(input.nextLine());

        displayDetails();
    }

}