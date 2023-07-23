package mandatoryHomeWork.foundation;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if (t.contains(String.valueOf(s.charAt(i)))) {
                    count++;
                }
            }
        }
        return t.charAt(t.length() - 1);
    }
}
