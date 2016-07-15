package ActiveStudyPhoneBook;

public class PhoneBook {
    private int numberOfEntries = 1;
    private PhoneEntry[] phoneEntry;

    public PhoneBook() {
        phoneEntry = new PhoneEntry[numberOfEntries];
    }

    public int GetNumberOfEntries() {
        return numberOfEntries;
    }

    public void setNumberOfEntries(int numberOfEntries) {
        this.numberOfEntries = numberOfEntries;
    }


    public boolean AddEntry(PhoneEntry entry) {
        PhoneEntry[] newPhoneEntry = new PhoneEntry[numberOfEntries];
        if(numberOfEntries + 1 < 100) {
            newPhoneEntry[numberOfEntries  - 1] = entry;
            numberOfEntries++;
            setNumberOfEntries(numberOfEntries);
            phoneEntry = newPhoneEntry;
            return true;
        }
        else
            return false;
    }

    public String SeeTheListPhoneEntry() {
        String ToString = "";
        for(int i = 0; i < GetNumberOfEntries(); i++) {
            ToString = ToString + phoneEntry[i].ToString() + "\n";
        }
        return ToString;
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

    public void DeletePhoneEntry(int index) {
        for (int i = index; i < numberOfEntries - 1; i++) {
            phoneEntry[i] = phoneEntry[i + 1];
        }
        numberOfEntries--;
    }

    public void SearchPhoneEntry(int index) {
        phoneEntry[index].ToString();
    }

}
