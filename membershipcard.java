class MembershipCard {
    private String memberName;

    static {
        System.out.println("Library system initialized");
    }

    public MembershipCard(String memberName) {
        this.memberName = memberName;
        System.out.println("Membership card issued: " + memberName);
    }
}

public class Main {
    public static void main(String[] args) {

        String[] names = {
            "Ananya", "Rohan", "Priya", "Arjun", "Sneha"
        };

        for (String name : names) {
            MembershipCard card = new MembershipCard(name);
        }
    }
}