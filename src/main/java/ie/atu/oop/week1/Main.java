package ie.atu.oop.week1;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Member> members = new ArrayList<>();
        System.out.println("Please enter a memberId: ");
        String memberId = sc.nextLine();
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();
        System.out.println("Please enter your age: ");
        int age = sc.nextInt();
        members.add(new Member (memberId, name, age));

        for(Member member : members)
        {
            System.out.println(member);
        }
    }
}