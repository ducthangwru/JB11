package ActiveStudyPhoneBook;

public class PhoneBook {
    private int numberOfEntries = 1;
    private PhoneEntry[] phoneEntry = new PhoneEntry[100];

    public PhoneBook() {
    }

    public void setNumberOfEntries(int numberOfEntries) {
        this.numberOfEntries = numberOfEntries;
    }

    public void ImportPhoneEntry(int count, int Number, String name, String phoneNumber) {
            phoneEntry[count] = new PhoneEntry(Number, name, phoneNumber);
    }

    public void SeeTheListPhoneEntry() {
        for(int i = 0; i < numberOfEntries; i++) {
            System.out.println("Mã liên hệ: " + phoneEntry[i].getNumber());
            System.out.println("Tên: " + phoneEntry[i].getName());
            System.out.println("Số điện thoại: " + phoneEntry[i].getPhoneNumber());
            System.out.println("---------------------");
        }
    }

    public boolean AddEntry(int Number, String name, String phoneNumber) {
        boolean check = false;
        if(numberOfEntries + 1 < 100) {
            numberOfEntries++;
            phoneEntry[numberOfEntries - 1] = new PhoneEntry(Number, name, phoneNumber);
            check = true;
        }
        return check;
    }

    public void EditPhoneEntry(int index, String name, String phoneNumber) {
        phoneEntry[index].setName(name);
        phoneEntry[index].setPhoneNumber(phoneNumber);
    }

    public boolean CheckPhoneEntry(int Number) {
        boolean check = false;
        for(int i = 0; i < numberOfEntries; i++) {
            if(phoneEntry[i].getNumber() == Number) {
                check = true;
            }
        }
        return check;
    }

    public int check(int Number) {
        int index = -1;
        for(int i = 0; i < numberOfEntries; i++) {
            if(phoneEntry[i].getNumber() == Number) {
                index = i;
            }
        }
        return index;
    }

    public void DeletePhoneEntry(int index, int Number) {
        for (int i = index; i < numberOfEntries - 1; i++) {
            phoneEntry[i] = phoneEntry[i + 1];
        }
        numberOfEntries--;
    }

    public void SearchPhoneEntry(int index, int Number) {
        System.out.println("------TÌM THẤY LIÊN HỆ--------");
        System.out.println("Mã liên hệ: " + phoneEntry[index].getNumber());
        System.out.println("Tên: " + phoneEntry[index].getName());
        System.out.println("Số điện thoại: " + phoneEntry[index].getPhoneNumber());
        System.out.println("------------------------------");
    }
}
