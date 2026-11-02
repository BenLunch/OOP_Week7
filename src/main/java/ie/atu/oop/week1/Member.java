package ie.atu.oop.week1;

public class Member {
    private final String memberId;
    private final String name;
    private final int age;


    public Member(String memberId, String name, int age)
    {
        this.memberId = memberId;
        this.name = name;
        this.age = age;
    }

    public String getMemberId()
    {
        return memberId;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public void displayDetails(){
        System.out.println("Member ID: " + memberId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
