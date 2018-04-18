package com.stringTests.countSentencesAndWords;

/**
 * implements the logic of parsing command line arguments
 */
public interface IAppOptions {

    public String getIgnoreListPath();

    public boolean setOptions(String[] args);

    public String getTextFilePath();
}
