package fawzi.linggo.app;

import java.io.BufferedReader;
import java.io.FileReader;

public class ReadApp {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("TES.md"))){
            while (true){
                String line = reader.readLine();
                if (line == null){
                    break;
                }
                System.out.println(line);
            }
        }catch (Throwable throwable){
            System.out.println("eror membaca file" + throwable.getMessage());
        }
    }
}
