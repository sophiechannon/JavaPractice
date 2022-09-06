public class LongestName {
    public static void longestName(String[] names) {
        String longest = "";
        for (String name : names) {
            if (longest.length() < name.length()) {
                longest = name;
            }
        }
        System.out.println(longest);
    };

    public static void main(String[] args) {
        String[] strArray = new String[]{"Sophie", "Persephone", "Joe","Katie"};
        longestName(strArray);
    }
}
