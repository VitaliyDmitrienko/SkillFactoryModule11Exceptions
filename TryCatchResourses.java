// Module 11. Exceptions. Exercise 11.7.3. "TryCatchResourses"

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class TryCatchResourses {

    public static void main(String[] args) {
        try {
            input();
        } catch (MyException e) {
            System.out.println (e.getMessage ());
            System.out.println ( Arrays.toString ( e.getStackTrace () ) );
        }
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
