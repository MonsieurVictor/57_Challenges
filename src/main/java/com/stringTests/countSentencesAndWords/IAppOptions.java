package com.stringTests.countSentencesAndWords;

/**
 * implements the logic of parsing command line arguments
 */
public interface IAppOptions {

    public void setOptions(String[] optionsArgs);

    public String getTextFilePath();
}
