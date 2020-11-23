package day32_LocalDate_WrapperClass;

/*
Password validation
    1. 8 character at least
    2. there must be a digit            (isUpper   isLowercase)
    3. there must be a letter (at least one upper case & one lower case)
    4. there must be special character
 */

public class PasswordValidation {
    public static void main(String[] args) {
        String password = "Hello12 ";

        int digits = 0;
        int specialChar = 0;
        int isUpper =0;
        int isLower = 0;
        int count =0;

        for(char each: password.toCharArray()) {
            if (Character.isDigit(each)) {
                digits ++;
                count++;
            } else if (Character.isLetter(each)) {
                count++;
                if (Character.isUpperCase(each)) {
                    isUpper ++;
                }
                if (Character.isLowerCase(each)) {
                    isLower ++;
                }
                count++;
            } else {
                specialChar ++;
                count++;
            }
        }

        if(count>=8 && isUpper>0 && isLower>0 && digits>0 && specialChar>0){
            System.out.println("Strong password");
        }else{
            System.err.println("Not a strong password!");
        }

    }
}
