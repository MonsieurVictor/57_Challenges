package com.stringTests.countSentencesAndWords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextReader implements ITextReader {

    private String path = "DBDir/text.txt";

    public void setFilePath(String path){
        path = this.path;
    }

    public StringBuffer getTextBuffer() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        StringBuffer buffer = new StringBuffer();
        while (reader.ready()) {
            buffer.append(reader.readLine());

        }
        return buffer;
    }


}
