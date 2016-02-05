package com.dmtihor.homework2;

import java.io.*;

/**
 * Created by Adm on 2/5/2016.
 */
public class UtilityIO {
    public static void write(String fileName, String text) {
        File file = new File(fileName);
        try (PrintWriter out = new PrintWriter(file.getAbsoluteFile())) {
            if (!file.exists()) {
                file.createNewFile();
            }
            out.print(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String read(String fileName) throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException(file.getName());
        }
        try (BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()))) {
            String s;
            while ((s = in.readLine()) != null) {
                sb.append(s);
                sb.append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
}
