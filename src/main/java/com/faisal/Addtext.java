package com.faisal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by borisgrunwald on 04/11/2016.
 */
public class Addtext extends HttpServlet{

    private static Logger logger = Logger.getLogger(Addtext.class.getName());

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        logger.log(Level.INFO,request.getParameter("comments"));

        try {

            File file = new File("/Users/borisgrunwald/Google Drev/java/Technology1_startup_projectt/src/main/java/com/faisal/comments.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            logger.log(Level.INFO, file.getAbsoluteFile().toString());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.append(request.getParameter("comments"));
            bw.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
