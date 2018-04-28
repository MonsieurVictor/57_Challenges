package com.stringTests.countSentencesAndWords;

import java.util.List;

public interface ITextAnalyzer {

    void setBuffer(StringBuffer buffer);

    void setIgnoreList(List<String> list);

    void doAnalyze(IAppOptions options);

    List<String> getTotalWords();
}
