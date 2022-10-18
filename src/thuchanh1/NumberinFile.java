package thuchanh1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class NumberinFile {
    public static void main(String[] args) {
       add("filenumber.txt");
    }

    public static void add(String path){
        File file = null;
        FileInputStream fis = null;
        InputStreamReader isr = null;
        BufferedReader br = null;
        try {
            file = new File(path);
            fis = new FileInputStream(file);
            isr = new InputStreamReader(fis);
            br = new BufferedReader(isr);
            String line = "";
            int number = 0;

            System.out.println("cac so trong file la");
            while ((line= br.readLine())!=null) {
                System.out.println(line);
                number += Integer.parseInt(line);
            }
            System.out.printf("Tong cac so trong file la: "+number);
        } catch (Exception ex1){
            ex1.printStackTrace();
        }finally {
            try {
                if (br!=null){
                    br.close();
                }
                if (isr!=null){
                    isr.close();
                }
                if (fis!=null){
                    fis.close();
                }
            } catch (Exception ex2){
                ex2.printStackTrace();
            }
        }
    }
}
