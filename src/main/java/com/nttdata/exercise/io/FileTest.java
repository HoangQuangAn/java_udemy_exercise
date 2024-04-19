package com.nttdata.exercise.io;

import java.io.IOException;
import java.io.OutputStream;

public class FileTest {
    public static void main(String[] args) {
        FileOutputStream fs= new FileOutputStream("D:\\testout.txt");
    }
}

class FileOutputStream extends OutputStream{

    public FileOutputStream(String s) {
    }

    @Override
    public void write(int b) throws IOException {

    }
}
