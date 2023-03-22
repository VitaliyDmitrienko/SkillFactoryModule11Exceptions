import static java.lang.System.err;

public class MyException extends Exception {

    MyException (String message) {
        super(message);
//        System.out.println (message.getStackTrace());
    }

}
