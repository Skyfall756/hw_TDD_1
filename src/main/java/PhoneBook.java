import java.util.*;
import java.util.stream.Collectors;

public class PhoneBook {

    private Map<String, String> phoneBook = new HashMap<>();

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

    public String findByName (String name) {
        if(phoneBook.containsKey(name)) return phoneBook.get(name);
        return null;
    }

    public List<String> printAllNames () {
        List<String> names = phoneBook.keySet().stream().sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        return names;
    }
}
