package com.stringTests.countSentencesAndWords;

public class AppOptions implements IAppOptions{


    private String filePath;
    public String ignoreListPath;
    public boolean isStatsEnabled = true;
    public boolean isFreqEnabled = true;
    public boolean isIgnoreEnabled = false;

    public boolean setOptions(String[] args) {
        if (args.length == 1) {
            filePath = args[0];
            return true;
        }
        else if (args.length == 2) {
            filePath = args[0];

            if (args[1].equals("s")) {
                isFreqEnabled = false;
                return true;
            }
            if (args[1].equals("f")) {
                isStatsEnabled = false;
                return true;
            }
        }
        else if (args.length == 3) {
            if (args[1].equals("w")) {
                filePath = args[0];
                isIgnoreEnabled = true;
                isFreqEnabled = false;
                isStatsEnabled = false;
                ignoreListPath = args[1];
                return true;
            }
        }
        System.out.println("Illegal start parameters!");
        return false;
    }

    public String getTextFilePath() {
        return filePath;
    }

    public String getIgnoreListPath() {
        return ignoreListPath;
    }
}
