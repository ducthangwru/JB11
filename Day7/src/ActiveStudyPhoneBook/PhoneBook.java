package ActiveStudyPhoneBook;
import java.util.ArrayList;

public class PhoneBook {
    private int numberOfEntries;
    private ArrayList<PhoneEntry> phoneEntry = new ArrayList<>();

    public int getNumberOfEntries() {
        return phoneEntry.size();
    }

    public boolean AddEntry(PhoneEntry PhoneEntry) {
        for(int i = 0; i < PhoneEntry.getSizePhoneNumber(); i++) {
            if (!isDuplicateName(PhoneEntry.getName()) || !isDuplicateNumber(PhoneEntry.getPhoneNumber().get(i)) || getNumberOfEntries() < 100) {
                phoneEntry.add(PhoneEntry);
                numberOfEntries++;
                return true;
            }
        }
        return false;
    }

    public PhoneEntry findEntryByName(String entryName) {
        PhoneEntry findPhoneEntry = new PhoneEntry();

        for(int i = 0; i < getNumberOfEntries(); i++) {
            if(entryName.equals(phoneEntry.get(i).getName())) {
                findPhoneEntry = phoneEntry.get(i);
            }
        }
        return findPhoneEntry;
    }

    public ArrayList<PhoneEntry> findEntryByCharaters(String Charaters) {
        ArrayList<PhoneEntry> findPhoneEntry = new ArrayList<>();

        for(int i = 0; i < getNumberOfEntries(); i++) {
            if(phoneEntry.get(i).getName().startsWith(Charaters)) {
                findPhoneEntry.add(phoneEntry.get(i));
            }
        }
        return findPhoneEntry;
    }
    public boolean deleteEntry(String entryName) {
            for (int i = 0; i < getNumberOfEntries(); i++) {
                if (entryName.equals(phoneEntry.get(i).getName())) {
                    phoneEntry.remove(phoneEntry.get(i));
                    numberOfEntries--;
                    return true;
                }
            }
        return false;
    }

    public boolean deletePhoneNumber(PhoneEntry PhoneEntry, String entryName) {
        for(int i = 0; i < getNumberOfEntries(); i++) {
            if (entryName.equals(phoneEntry.get(i).getName())) {
                for(int j = 0; j < PhoneEntry.getSizePhoneNumber(); j++) {
                    phoneEntry.get(i).getPhoneNumber().remove(j);
                    j--;
                }
            }

            if(phoneEntry.get(i).getSizePhoneNumber() == 0) {
                return true;
            }
        }
        return false;
    }

    public void deleteArrayPhoneNumber(String oldName) {
        for (int i = 0; i < getNumberOfEntries(); i++) {
            if (oldName.equals(phoneEntry.get(i).getName())) {
                deletePhoneNumber(phoneEntry.get(i), oldName);
            }
        }
    }
    public boolean isDuplicateName(String entryName) {
        for(int i = 0; i < getNumberOfEntries(); i++) {
            System.out.println(entryName.equals(phoneEntry.get(i).getName()));
            if(entryName.equals(phoneEntry.get(i).getName())) {
                return true;
            }
        }
        return false;
    }

    public boolean isDuplicateNumber(String entryNumber) {
        for(int i = 0; i < getNumberOfEntries(); i++) {
            if(phoneEntry.get(i).getPhoneNumber().indexOf(entryNumber) != -1) {
                return true;
            }
        }
        return false;
    }

    public boolean modifyEntry(String oldName, String newName) {
        for(int i = 0; i < getNumberOfEntries(); i++) {
            if(oldName.equals(phoneEntry.get(i).getName())) {
                phoneEntry.get(i).setName(newName);
                return true;
            }
        }
        return false;
    }

    public boolean modifyNumber(String oldName, String newPhoneNumber) {
        for (int i = 0; i < getNumberOfEntries(); i++) {
            if (oldName.equals(phoneEntry.get(i).getName())) {
                phoneEntry.get(i).setPhoneNumber(newPhoneNumber);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "numberOfEntries=" + numberOfEntries +
                ", phoneEntry=" + phoneEntry +
                '}';
    }
}
