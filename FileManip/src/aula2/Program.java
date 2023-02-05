package aula2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) {

        String path = "/home/windcaller/source/filler/in.txt";
        FileReader fr = null;
        BufferedReader br = null;
        StringBuilder sb = new StringBuilder();

        try {
            // br = new BufferedReader(new FileReader(path));
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            sb.append("Error: ");
            sb.append(e.getMessage());
            System.out.println(sb);
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
