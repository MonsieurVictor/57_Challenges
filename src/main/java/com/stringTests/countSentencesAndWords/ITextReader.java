package com.stringTests.countSentencesAndWords;

import java.io.IOException;

/**
 * implements the logic of reading text file
 */

public interface ITextReader {

    void readFileByAPath(String path) throws IOException;

    StringBuffer getTextBuffer(String path) throws IOException;
}
