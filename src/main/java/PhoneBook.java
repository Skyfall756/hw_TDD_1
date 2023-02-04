import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PhoneBook {

    Map<String, String> phoneBook = new HashMap<>();

    public int add (String name, String phoneNumber) {
        phoneBook.put(name, phoneNumber);
        return phoneBook.size();
    }

    public String findByNumber(String phoneNumber) {
        Optional<String> res = phoneBook.entrySet().stream()
                .filter(entry -> phoneNumber.equals(entry.getValue()))
                .map(Map.Entry::getKey)
                .findFirst();
        if (res.isPresent()) return res.get();
    return null;
    }

    public String findByName () {
        return null;
    }
}
