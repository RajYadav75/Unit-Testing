package in.raj;

public class StringUtils {
    public Integer stringToInt(String str) {
        if (str == null || str.trim().length() == 0) {
            throw new IllegalArgumentException("Input is null or empty");
        }
        return Integer.parseInt(str);
    }

}
