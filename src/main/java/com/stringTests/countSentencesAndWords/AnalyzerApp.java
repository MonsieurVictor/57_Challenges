package com.stringTests.countSentencesAndWords;

public class AnalyzerApp {

    public ITextReader reader;
    public ITextAnalyzer analyzer;
    public IResultViewer viewer;
    public IAppOptions options;

    public AnalyzerApp(ITextReader reader, ITextAnalyzer analyzer, IAppOptions options, IResultViewer viewer) {
        this.reader = reader;
        this.analyzer = analyzer;
        this.options = options;
        this.viewer = viewer;
    }

    public void execute(String[] args) {
        reader.setFilePath(options.getTextFilePath());
        analyzer.setBuffer(reader.getTextBuffer());
        analyzer.doAnalyze();
        viewer.report(this.analyzer);
    }


}
