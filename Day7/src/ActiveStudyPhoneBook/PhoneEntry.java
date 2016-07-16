package ActiveStudyPhoneBook;

public class PhoneEntry {
    private String Name;
    private String PhoneNumber;

    public PhoneEntry() {
    }

    public PhoneEntry(String Name, String PhoneNumber) {
        this.Name = Name;
        this.PhoneNumber = PhoneNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.PhoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "PhoneEntry{" +
                "Name='" + Name + '\'' +
                ", PhoneNumber='" + PhoneNumber + '\'' +
                '}';
    }
}
