package ActiveStudyPhoneBook;

import java.util.ArrayList;

public class PhoneEntry {
    private String Name;
    private ArrayList<String> phoneNumber =  new ArrayList<>();

    public PhoneEntry() {
    }


    public int getSizePhoneNumber() {
        return phoneNumber.size();
    }

    public ArrayList<String> getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.phoneNumber.add(PhoneNumber);
    }

    @Override
    public String toString() {
        return "PhoneEntry{" +
                "Name='" + Name + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
