package com.ichebadu;

import java.io.File;
import java.io.IOException;

public classOfStore Main {

    public static void main(String[] args) {
	// write your code here

        // JAVA FILE METHODS
        // canRead()
        // canWrite();
        // createNewFile()
        // Delete()
        // Exists()
        // getName()
        // getAbsolutePath();
        // List = returns the array of files in the directory;
        // mkdir() => use to create directory

        // File Operations
        // create a file
        // get the information a=of the File
        // Write to a File
        // Read from a File

        FileOperation fileOperation = new FileOperation();
       fileOperation.operation();
       fileOperation.writeToFile();
       fileOperation.readFromFile();


    }
}
