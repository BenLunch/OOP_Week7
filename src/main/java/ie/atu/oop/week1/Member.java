package ie.atu.oop.week1;

public class Member {
    private final String memberId;
    private final String name;
    private final int age;


    private Member(String memberId, String name, int age)
    {
        if(memberId == null || memberId.isBlank())
        {
            throw new IllegalArgumentException("Member ID cannot be null or blank");
        }
        if(name == null || name.isBlank())
        {
            throw new IllegalArgumentException("Member name cannot be null or blank");
        }
        if(age < 0 || age > 110){
            throw new IllegalArgumentException("Member age must be between 0 and 100");
        }
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
