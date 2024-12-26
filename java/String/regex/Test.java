package regex;

import java.util.regex.Pattern;
/**
 * <p>This class provides methods for various validations</p>
 * <h3>Methods</h3>
 * <ul>
 * <li> boolean isValidPassword(String password) </li>
 * <li> boolean isValidEmail(String email) </li>
 * <li> boolean isAlpha(String string) </li>
 * <li> boolean isDigit(String string) </li>
 * </ul>
 * @author Chandan Maurya
 * @version 1.0
 */
public class Test {
    /**
     * <p>Password Validation</p>
     * <p> -> at least one capital letter</p>
       <p> -> at least one small letter</p>
       <p> -> at least one special character</p>
       <p> -> at least one number </p>
       <p> -> password length min 6 and max 12 </p>
       <p> Ex:- Abc@1234</p>
     * @param 
     * @return <b>boolean</b>
     */
    public boolean isValidPassword(String password){
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[!@#$%^&*()])(?=.*\\d).{6,12}$";
        return  Pattern.matches(regex,password);
    }

    /**
     * <p> -> Email validation </p>
     * <p> -> Starting should be alphabet, at least one letter</p>
     * <p> -> Next at least one number</p>
     * <p> -> Next '@' </p>
     * <p> -> Next alphabet min 2 character </p>
     * <p> -> Next '.' </p>
     * <p> -> Next alphabet min 2 character and max 3 character </p>
     * <p> Ex:- lookt83@gmail.com </p>
     * @param 
     * @return <b> boolean </b>
     */
    public boolean isValidEmail(String email){
        String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return Pattern.matches(regex,email);
    }


    /**
     * <p> --> Check whether a string is alphabet or not </p>
     * @param string
     * @return <b>boolean</b>
     */

    public boolean isAlpha(String string){
        String regex="[a-zA-Z]+";
        return Pattern.matches(regex,string);
    }

    /**
     * <p> --> Check whether a string is digit or not </p>
     * @param string
     * @return <b>boolean</b>
     */

    public boolean isDigit(String string){
        String regex="\\d+";
        return Pattern.matches(regex,string);
    }

    /**
     * <p> --> Check whether a string is special character or not </p>
     * @param string
     * @return <b>boolean</b>
     */

    public boolean isSpecialChar(String string){
        String regex="[^a-zA-Z0-9 ]*";
        return Pattern.matches(regex,string);
    }

    /**
     * <p> --> Check whether a string is alphanumeric character or not </p>
     * <p> --> It matches alphabets and numeric both present in string
     * @param string
     * @return <b>boolean</b>
     */

    public boolean isAlphaNumeric(String string){
        String regex="^(?=.*[a-zA-Z])(?=.*\\d)[a-zA-Z0-9]+$";
        return Pattern.matches(regex,string);
    }
    
    
}
