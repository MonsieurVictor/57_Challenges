package com.stringTests.countSentencesAndWords;

/**
 * implements the logic of parsing command line arguments
 */

public interface IAppOptions {

    void parseOptions(String[] args) throws Exception;

    String getFilePath();

    String getIgnoreListFilePath();

    boolean isIgnoreListEnabled();

    boolean isFreqEnabled();

    boolean isStatsEnabled();

}
