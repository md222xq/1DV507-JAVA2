package ak223wd_assign1;

import java.io.File;
import java.nio.file.Files;
import java.util.Scanner;

public class PrintJavaMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Give a directory : ");
        String path = sc.nextLine();
        sc.close();
        try{
            printAllJavaFiles(new File(path));
        } catch (Exception e){
            System.err.printf("ERROR DIRECTORY \"%s\" DOES NOT EXIST !", path);
        }


    }


    private static void printAllJavaFiles(File directory) {
        File file = directory;
        File[] files =  file.listFiles();
        String nameJ;

        for(File f : files){

            try{

                if(f.isDirectory()){
                    printAllJavaFiles(f);
                } else if(f.getName().endsWith(".java")){
                    int lines = Files.readAllLines(f.toPath()).size();
                    nameJ = f.getName();
                    System.out.println("Java File Name : "+ nameJ +", "+ "lines : "+lines);

                }
            }
            catch (Exception e){
                e.printStackTrace();
            }

        }

    }

}