package ActiveStudyPhoneBook;
import java.util.Arrays;

public class PhoneBook {
    private int numberOfEntries = 0;
    private PhoneEntry[] phoneEntry = new PhoneEntry[0];

    public PhoneBook() {
        phoneEntry = new PhoneEntry[numberOfEntries];
    }

    public int getNumberOfEntries() {
        return numberOfEntries;
    }

    public boolean AddEntry(PhoneEntry entry) {
        if(isDuplicateName(entry.getName()) || isDuplicateNumber(entry.getPhoneNumber()) || numberOfEntries + 1 < 100) {
                PhoneEntry[] newPhoneEntries = new PhoneEntry[numberOfEntries + 1];
                for (int i=0; i< numberOfEntries ;i++){
                    newPhoneEntries[i]= phoneEntry[i];
                }

            PhoneEntry[] newPhoneEntry = new PhoneEntry[numberOfEntries + 1];
            newPhoneEntry[numberOfEntries] = entry;
            phoneEntry = newPhoneEntry;
            numberOfEntries++;
            return true;
        }
        else
            return false;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "numberOfEntries=" + numberOfEntries +
                ", phoneEntry=" + Arrays.toString(phoneEntry) +
                '}';
    }

    public PhoneEntry findEntryByName(String entryName) {
        PhoneEntry findPhoneEntry = new PhoneEntry();

        for(int i = 0; i < getNumberOfEntries(); i++) {
            if(entryName.equals(phoneEntry[i].getName())) {
                findPhoneEntry = phoneEntry[i];
            }
        }
        return findPhoneEntry;
    }

    public boolean deleteEntry(String entryName) {
        int index = 0;
        if (isDuplicateName(entryName)) {
            PhoneEntry[] newPhoneEntry = new PhoneEntry[numberOfEntries - 1];
            for (int i = 0; i < getNumberOfEntries(); i++) {
                if (entryName.equals(phoneEntry[i].getName())) {
                    index = i;
                }
            }
            for (int i = 0; i < index; i++) {
                newPhoneEntry[i] = phoneEntry[i];
            }
            for (int i = index; i < getNumberOfEntries() - 1; i++) {
                newPhoneEntry[i] = phoneEntry[i + 1];
            }
            numberOfEntries--;
            phoneEntry = newPhoneEntry;
            return true;
        }
        return false;
    }

    public boolean isDuplicateName(String entryName) {
        for(int i = 0; i < getNumberOfEntries(); i++) {
            if(entryName.equals(phoneEntry[i].getName())) {
                return true;
            }
        }
        return false;
    }

    public boolean isDuplicateNumber(String entryNumber) {
        for(int i = 0; i < getNumberOfEntries(); i++) {
            if(entryNumber.equals(phoneEntry[i].getPhoneNumber()))
                return true;
        }

        return false;
    }

    public boolean modifyEntry(String oldName, String newName, String newPhoneNumber) {
        for(int i = 0; i < getNumberOfEntries(); i++) {
            if(oldName.equals(phoneEntry[i].getName())) {
                phoneEntry[i].setName(newName);
                phoneEntry[i].setPhoneNumber(newPhoneNumber);
                return true;
            }
        }
        return false;
    }


}
