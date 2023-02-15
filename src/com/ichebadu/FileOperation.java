package com.ichebadu;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public classOfStore FileOperation {

    public void operation(){
       try { File file = new File("/Users/dec/Desktop/Java_Iche/product.txt");
        if(file.createNewFile()){
            System.out.println("File file Information");
            System.out.println("File name : " + file.getName());
            System.out.println("File Absolute Path : " + file.getAbsolutePath());
            System.out.println("File  Writeable : " + file.canWrite());
            System.out.println("File Readable : " + file.canRead());
            System.out.println("File size in bytes : " + file.length());
        }else{
            System.out.println("File file Information");
            System.out.println("File name : " + file.getName());
            System.out.println("File Absolute Path : " + file.getAbsolutePath());
            System.out.println("File  Writeable : " + file.canWrite());
            System.out.println("File Readable : " + file.canRead());
            System.out.println("File size in bytes : " + file.length());
        }
       }catch (IOException ex){
           System.out.println("file already exist");
       }
    }

    public void readFromFile(){
        try {
            File fileReader = new File("/Users/dec/Desktop/Java_Iche/product.txt");
            Scanner readData = new Scanner(fileReader);
            while(readData.hasNextLine()){
                String data = readData.nextLine();
                System.out.println("***************** Print Data From FILE*****************");
                System.out.println(data);
            }
            readData.close();
        }catch (IOException ex) {
            System.out.println("An Error occured 'CANNOT READ FILE' ");
        }
    }
    public void writeToFile() {
        try {
            FileWriter fileWriter = new FileWriter("/Users/dec/Desktop/Java_Iche/product.txt");
            fileWriter.write(" In Java, a \"static\" variable or method is one that belongs to the " +
                    "class rather than an instance of the class. This means that you can access a static " +
                    "variable or method without creating an instance of the class. For example, if you have" +
                    " a class called \"MathUtils\" with a static method called \"add\", you can call MathUtils.add(2, 3) " +
                    "without creating an instance of the MathUtils class." );
            fileWriter.close();
            }catch(IOException ex){
            System.out.println("An Error occurred 'CANNOT WRITE TO FILE'");
            ex.printStackTrace();
        }
    }
}
