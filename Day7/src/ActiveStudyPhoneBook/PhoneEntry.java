package ActiveStudyPhoneBook;

public class PhoneEntry {
    private String Name;
    private String PhoneNumber;
    private int Number;

    public PhoneEntry() {
    }

    public PhoneEntry(int Number, String Name, String PhoneNumber) {
        this.Number = Number;
        this.Name = Name;
        this.PhoneNumber = PhoneNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public int getNumber() {
        return Number;
    }

    public String ToString() {
        return getNumber() + "\t\t" + getName() + "\t\t" + getPhoneNumber();
    }

}
