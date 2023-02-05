package aula3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {

        String path = "/home/windcaller/source/filler/in.txt";
        StringBuilder sb = new StringBuilder();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            sb.append("Error: ");
            sb.append(e.getMessage());
            System.out.println(sb);
        }
    }
}
