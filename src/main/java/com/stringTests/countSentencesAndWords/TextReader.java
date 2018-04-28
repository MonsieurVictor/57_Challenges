package com.stringTests.countSentencesAndWords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextReader implements ITextReader {

    private StringBuffer buffer;

    private String filePath;

    public void readFileWithAPath(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        this.buffer = new StringBuffer();
        while (reader.ready()) {
            this.buffer.append(reader.readLine());
        }
    }

    public StringBuffer getTextBuffer(String path) throws IOException {
        readFileWithAPath(path);
        return this.buffer;
    }
}
