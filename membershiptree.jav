class LibraryMember {
    protected String memberId;
    protected int borrowLimit;

    public LibraryMember(String memberId, int borrowLimit) {
        this.memberId = memberId;
        this.borrowLimit = borrowLimit;
    }

    public void displayDetails() {
        System.out.println("Member ID: " + memberId);
        System.out.println("Borrow Limit: " + borrowLimit);
    }
}

class StudentMember extends LibraryMember {
    private String course;

    public StudentMember(String memberId, int borrowLimit,
                         String course) {
        super(memberId, borrowLimit);
        this.course = course;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Course: " + course);
    }
}

class FacultyMember extends LibraryMember {
    private String department;

    public FacultyMember(String memberId, int borrowLimit,
                         String department) {
        super(memberId, borrowLimit);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

class GuestMember extends LibraryMember {
    private int visitDays;

    public GuestMember(String memberId, int borrowLimit,
                       int visitDays) {
        super(memberId, borrowLimit);
        this.visitDays = visitDays;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Visit Days: " + visitDays);
    }
}

public class MembershipTree {
    public static void main(String[] args) {

        StudentMember student = new StudentMember(
                "STU101", 3, "CSE");

        FacultyMember faculty = new FacultyMember(
                "FAC201", 5, "Computer Science");

        GuestMember guest = new GuestMember(
                "GST301", 1, 2);

        System.out.println("Student Details:");
        student.displayDetails();

        System.out.println("\nFaculty Details:");
        faculty.displayDetails();

        System.out.println("\nGuest Details:");
        guest.displayDetails();
    }
}