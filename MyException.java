// Module 11. Exceptions. Exercise 11.7.3. "TryCatchResourses"

import static java.lang.System.err;

public class MyException extends Exception {

    MyException (String message) {
        super(message);
//        System.out.println (message.getStackTrace());
    }

}
