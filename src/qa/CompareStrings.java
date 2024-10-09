package qa;

public class CompareStrings {
    public static void main(String[] args) {
        System.out.println(compareNames("Mostafa Fata", "Fata,   Mostafa"));
    }

    public static boolean compareNames(String name1, String name2) {

        System.out.println(normalizeNames(name1));
        System.out.println(normalizeNames(name2));

        return normalizeNames(name1).equals(normalizeNames(name2));
    }

    public static String normalizeNames(String name) {
        if (name.contains(",")) {
            String[] names = name.toLowerCase().split(",");
            return names[1].trim() + " " + names[0].trim();
        }else {
            return name.toLowerCase().trim();
        }
    }
}


