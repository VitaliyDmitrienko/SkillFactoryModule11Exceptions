import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryCatchResourses {

    public static void main(String[] args) throws MyException {
        input();
    }

//    public String input() throws MyException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
//        String s = null;
//        try {
//            s = reader.readLine();
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        } finally {
//
//            try {
//                System.out.println(e.getMessage());
//            }
//        }
//
//        if (s.equals("")) {
//            throw new MyException("String can not be empty!");
//            reader.close();
//        } catch (IOException e) {
//
//        }
//
//        return s;
//    }


    public static String input() throws MyException {
        String s = null;
        try (BufferedReader reader = new BufferedReader ( new InputStreamReader ( System.in ) )) {
            s = reader.readLine ();
        } catch (IOException e) {
            System.out.println ( e.getMessage () );
            System.out.println (e.getStackTrace ());

        }
        if (s.equals ( "" )) {
            throw new MyException ( "String can not be empty!" );
        }
        return s;
    }
}
