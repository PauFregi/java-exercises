
public class LookAndSay {
    public static String lookAndSay(int n, String start) {
        for(int i = 0; i < n; i++){
            start = lookAndSay(start);
        }
        return start;
    }

    private static String lookAndSay(String start) {
        StringBuilder result = new StringBuilder();
        char repeat = start.charAt(0);
        int count = 1;
        start = start.substring(1);

        for (char current : start.toCharArray()) {
            if (current != repeat) {
                result.append(count);
                result.append(repeat);
                count = 1;
                repeat = current;
            } else {
                count++;
            }
        }
        result.append(count);
        result.append(repeat);

        return result.toString();
    }
}
