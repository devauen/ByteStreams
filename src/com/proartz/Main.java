package com.proartz;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader in = null;
        PrintWriter out = null;

        try{
            in = new BufferedReader(new FileReader("input.txt"));
            out = new PrintWriter(new FileWriter("output.txt"));

            String line;

            while((line = in.readLine()) != null) {
                out.println(line);
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
