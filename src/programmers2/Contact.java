package programmers2;

import java.util.HashSet;

class Contact {
    public boolean solution(String[] phone_book) {
        HashSet<String> set = new HashSet<>();
        for (String x : phone_book) {
            set.add(x);
        }
        for (String x : phone_book) {
            for (int i = 0; i < x.length(); i++) {
                if (set.contains(x.substring(0, i))) return false;
            }
        }
        return true;
    }
}
