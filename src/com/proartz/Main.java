package com.proartz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static String file = "input.txt";

    public static void main(String[] args) throws IOException{
        FileInputStream in = null;
        FileOutputStream out = null;

        try{
            in = new FileInputStream(file);
            out = new FileOutputStream("output.txt");

            int c;

            while((c = in.read()) != -1) {
                out.write(c);
            }
        }finally {
            if(in != null) {
                in.close();
            }
            if(out != null) {
                out.close();
            }
        }
    }
}
