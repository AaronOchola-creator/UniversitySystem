public class AdminStaff extends Person {
    public AdminStaff(String id, String name, String email) {
        super(id, name, email);
    }

    @Override
    public void displayDetails() {
        System.out.println("Admin Staff: " + name + " (" + id + ")");
    }
}