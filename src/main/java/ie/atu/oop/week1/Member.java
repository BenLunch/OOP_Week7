package ie.atu.oop.week1;

public class Member {
    private String memberId;
    private String name;
    private int age;

    public Member(String memberId, String name, int age) {
        if(age <= 0)
        {
            throw new IllegalArgumentException("Invalid age. Please try again.");
        }
        this.memberId = memberId;
        this.name = name;
        this.age = age;
    }

    public String getMemberId() {return memberId;}
    public String getName() {return name;}
    public int getAge() {return age;}

    @Override
    public String toString() {return "Member ID: " + memberId + " - " + "Name: " + name + " - " + "Age: " + age;}
}

