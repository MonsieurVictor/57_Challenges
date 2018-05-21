package com.stringTests.countSentencesAndWords;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * parses command line arguments and sets the following flags to true:
 *   -a: if all kind of info must be outputted
 *   -s: if only statistics must be outputted
 *   -f: if only frequency must be outputted
 *   -w: if file with words to ignore is specified
 *  and the following variables:
 *   - filePath (mandatory): the path to file with text to analyze
 *   - ignoreListFilePath (optional, if the "w" flag is true): the path to file with words to ignore
 */

public class AppOptions implements IAppOptions {

    private final String STATS_FLAG = "-s";
    private final String FREQ_FLAG = "-f";
    private final String IGNORE_FLAG = "-w";
    private final String ALL_FLAG = "-a"; // почему так лучше а не чтоб по умолчанию без флага обе настройки включались?

    private String filePath;
    private String ignoreListFilePath;

    private boolean isStatsEnabled = false;
    private boolean isFreqEnabled = false;
    private boolean isIgnoreEnabled = false;

    private String[] commandArgs;

    public boolean isFreqEnabled() {
        return this.isFreqEnabled;
    }

    public boolean isStatsEnabled() {
        return this.isStatsEnabled;
    }

    public boolean isIgnoreListEnabled() {
        return this.isIgnoreEnabled;
    }

    public String getFilePath() {
        return this.filePath;
    }

    public String getIgnoreListFilePath() {
        return this.ignoreListFilePath;
    }

    private boolean isOptionSpecified(String option, String[] args) {
        return Stream.of(args).anyMatch(arg -> arg.equals(option));
    }

    private AppOptions verifyCommandFormat() throws Exception {
        if (this.commandArgs.length == 0) {
            throw new Exception("Not specified file path as a first argument");
        }
        return this;
    }

    private AppOptions setFilePath() {
        this.filePath = this.commandArgs[0];
        return this;
    }

    private AppOptions setStats() {
        this.isStatsEnabled = isOptionSpecified(this.STATS_FLAG, this.commandArgs);
        return this;
    }

    private AppOptions setAllOptions() {
        if(isOptionSpecified(this.ALL_FLAG, this.commandArgs)) {
            isStatsEnabled = true;
            isFreqEnabled = true;
        }
        return this;
    }

    private AppOptions setFrequency() {
        this.isFreqEnabled = isOptionSpecified(this.FREQ_FLAG, this.commandArgs);
        return this;
    }

    private AppOptions setIgnoreList() {
        int idxOfIgnoreOption = Arrays.asList(this.commandArgs).indexOf(this.IGNORE_FLAG);
        if (idxOfIgnoreOption != -1) {
            this.isIgnoreEnabled = true;
            this.ignoreListFilePath = this.commandArgs[idxOfIgnoreOption + 1];
        }
        return this;
    }

    /**
     * most full command format: <filePath> -s -f -w <ignoreListFilePath>
     * @param args
     * @return
     */
    public void parseOptions(String[] args) throws Exception {
        this.commandArgs = args;
        this
            .verifyCommandFormat()
            .setFilePath()
            .setStats()
            .setFrequency()
            .setAllOptions()
            .setIgnoreList();
    }

}
