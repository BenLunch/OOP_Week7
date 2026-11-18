package ie.atu.oop.week1;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Member> members = new ArrayList<>();
        int choice = 0;

        while(choice!=5) {
            System.out.println("--------------------------------------------------");
            System.out.println("Welcome to the Membership Management System.");
            System.out.println("Please enter a number to choose one of the following options.");
            System.out.println("1: Add Member");
            System.out.println("2: Display All Members");
            System.out.println("3: Search By Member ID");
            System.out.println("4: Remove Member");
            System.out.println("5. Exit");
            System.out.println("Your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            boolean found = false;

            switch (choice) {
                case 1:
                    System.out.println("Please enter a member ID: ");
                    String memberId = sc.nextLine();
                    System.out.println("Please enter a member name: ");
                    String name = sc.nextLine();
                    System.out.println("Please enter a member age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    members.add(new Member(memberId, name, age));
                    break;
                case 2:
                    if (members.isEmpty()) {
                        System.out.println("There are no members currently.");
                    }
                    else {
                        for (Member member : members) {
                            System.out.println(member);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Please enter a member ID: ");
                    String searchId  = sc.nextLine();
                    for(Member member : members)
                    {
                        if(member.getMemberId().equals(searchId))
                        {
                            System.out.println(member);
                            found = true;
                        }
                        if (!found)
                        {
                            System.out.println("Member not found.");
                        }
                    }

                    break;
                case 4:
                    System.out.println("Please enter a member ID: ");
                    String removeId = sc.nextLine();
                    for(Member member : members){
                        if(member.getMemberId().equals(removeId))
                        {
                            members.remove(member);
                            System.out.println("Member successfully removed.");
                            found = true;
                            break;
                        }
                        if(!found)
                        {
                            System.out.println("Member not found.");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Goodbye");
                    break;
                default:
                    System.out.println("Invalid option. Please try again: ");
            }
        }
    }
}