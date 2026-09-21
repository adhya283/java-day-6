class LibraryMember {
    protected String memberId;
    protected int borrowLimit;

    public LibraryMember(String memberId, int borrowLimit) {
        this.memberId = memberId;
        this.borrowLimit = borrowLimit;
    }

    public double calculateFee() {
        return 0.0;
    }
}

class StudentMember extends LibraryMember {
    public StudentMember(String memberId, int borrowLimit) {
        super(memberId, borrowLimit);
    }

    @Override
    public double calculateFee() {
        return 100.0;
    }
}

class FacultyMember extends LibraryMember {
    public FacultyMember(String memberId, int borrowLimit) {
        super(memberId, borrowLimit);
    }

    @Override
    public double calculateFee() {
        return 200.0;
    }
}

class GuestMember extends LibraryMember {
    public GuestMember(String memberId, int borrowLimit) {
        super(memberId, borrowLimit);
    }

    @Override
    public double calculateFee() {
        return 300.0;
    }
}

public class MembershipFee {
    public static void main(String[] args) {

        LibraryMember student = new StudentMember("STU101", 3);
        LibraryMember faculty = new FacultyMember("FAC201", 5);
        LibraryMember guest = new GuestMember("GST301", 1);

        System.out.println("Student Fee: ₹" + student.calculateFee());
        System.out.println("Faculty Fee: ₹" + faculty.calculateFee());
        System.out.println("Guest Fee: ₹" + guest.calculateFee());
    }
}