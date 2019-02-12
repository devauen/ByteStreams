package com.proartz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static String file = "input.txt";

    public static void main(String[] args) {
        FileInputStream in = null;
        FileOutputStream out = null;

        try{
            in = new FileInputStream(file);
            out = new FileOutputStream("output.txt");

            int c;

            while((c = in.read()) != -1) {
                out.write(c);
            }
        }catch(FileNotFoundException e) {
            System.err.format("File: %s not found.", file );
        }catch(IOException e) {
            System.err.println(e.toString());
        } finally {
            if(in != null) {
                try {
                    in.close();
                } catch(IOException e) {
                    System.err.println(e.toString());
                }
            }
            if(out != null) {
                try {
                    out.close();
                } catch(IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
