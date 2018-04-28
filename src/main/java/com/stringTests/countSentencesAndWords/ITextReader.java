package com.stringTests.countSentencesAndWords;

import java.io.IOException;

public interface ITextReader {

    public void readFileWithAPath(String path) throws IOException;

    public StringBuffer getTextBuffer(String path) throws IOException;
}
