import java.util.Comparator;

public class StringLengthComparator {
    public static void main(String[] args) {

        Comparator<String> lengthComparator = (str1, str2) -> Integer.compare(str1.length(), str2.length());

        String string1 = "cherry";
        String string2 = "banana";

        int result = lengthComparator.compare(string1, string2);

        if (result < 0) {
            System.out.println(string1 + " is shorter than " + string2);
        } else if (result > 0) {
            System.out.println(string1 + " is longer than " + string2);
        } else {
            System.out.println(string1 + " is the same length as " + string2);
        }
    }
}
