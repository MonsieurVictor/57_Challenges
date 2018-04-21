package com.stringTests.countSentencesAndWords;

import java.io.IOException;

public interface ITextReader {

    public void setFilePath(String path);

    public StringBuffer getTextBuffer() throws IOException;
}
