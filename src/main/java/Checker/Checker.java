package Checker;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by borisgrunwald on 27/09/2016.
 */
public class Checker {



    public static int checkUser(String username, String password) throws FileNotFoundException {

        Scanner s = new Scanner(new File("/Users/borisgrunwald/Google Drev/java/Technology1_startup_projectt/web/users.txt"));

        while(s.hasNext()) {

            String usernameFromFile = s.next();
            String passwordFromFile = s.next();
            int isAdmin = s.nextInt();

            if(usernameFromFile.equals(username) && passwordFromFile.equals(password)) {
                if(isAdmin == 1) {
                    return 1;
                }

                return 0;
            }

         }

        return -1;

    }





}
