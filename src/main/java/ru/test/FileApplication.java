package ru.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileApplication {
    public static void main(String[] args) throws IOException {
       WriteFileManipulation wfm = new WriteFileManipulation();
       wfm.write("ТЕСТ","C:\\Work", "test.txt");
    }

}
