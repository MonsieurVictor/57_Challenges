package com.stringTests.countSentencesAndWords;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/** is responsible for reading text by a file's path;
 */

public class TextReader implements ITextReader {

    private StringBuilder buffer;

    public void readFileByAPath(String path) throws IOException {

        BufferedReader reader = new BufferedReader(new FileReader(path));
        this.buffer = new StringBuilder();
        while (reader.ready()) {
            this.buffer.append(reader.readLine());
        }
    }

    public StringBuilder getTextBuffer(String path) throws IOException {

        readFileByAPath(path);
        return this.buffer;
    }
}
