import java.io.*;
import java.util.*;

public class ValidUsername {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String regex = "^[a-zA-Z]//w{7,29}$";
        Pattern pattern = Pattern.compile(regex);
        short numberOfNames = scanner.nextLine();
        String name = scanner.nextLine();
        boolean nameIsValid = checkNameValidation(pattern, name);
        if (nameIsValid)
    }

//    The username consists of 8 to 30 characters inclusive. If the username consists of less than 8 or greater than 30 characters, then it is an invalid username.
//    The username can only contain alphanumeric characters and underscores (_). Alphanumeric characters describe the character set consisting of lowercase characters , uppercase characters , and digits .
//    The first character of the username must be an alphabetic character, i.e., either lowercase character  or uppercase character .
    public static boolean checkNameValidation(Pattern pattern, String name) {
        Matcher matcher = pattern.matcher(name);
        boolean matchFound = matcher.find():
        if(matchFound)
            return true;
        else
            return false;
    }
}
