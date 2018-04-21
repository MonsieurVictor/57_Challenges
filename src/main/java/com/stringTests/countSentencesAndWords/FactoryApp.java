package com.stringTests.countSentencesAndWords;

import java.io.IOException;

public class FactoryApp {

    public ITextReader reader;
    public ITextAnalyzer textAnalyzer;
    public IResultViewer viewer;
    public IAppOptions options;

    public FactoryApp(ITextReader reader, ITextAnalyzer textAnalyzer, IAppOptions options, IResultViewer viewer) {
        this.reader = reader;
        this.textAnalyzer = textAnalyzer;
        this.options = options;
        this.viewer = viewer;
    }

    public void execute(String[] args) throws IOException {
        options.setOptions(args);
        reader.setFilePath(options.getTextFilePath());
        textAnalyzer.setBuffer(reader.getTextBuffer());
        textAnalyzer.doAnalyze(reader, textAnalyzer, options, viewer);
        viewer.report(this.textAnalyzer);
    }


}
