public abstract class Person implements Display {
    protected String id;
    protected String name;
    protected String email;
    protected String phoneNumber;

    public Person(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public String getId() { return id; }
    public String getName() { return name; }
}