package ru.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileManipulation {

    public void write(String textToWrite, String fileDir, String fileName) throws IOException {
        File fileForWriteIn = new File(fileDir, fileName);
        if (!fileForWriteIn.exists()) {
            fileForWriteIn.createNewFile();
            fillFileWithText(textToWrite, fileForWriteIn);
        } else {
            fillFileWithText(textToWrite, fileForWriteIn);
        }
    }

    public void fillFileWithText(String textToWrite, File file) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
            bw.append(textToWrite);
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



