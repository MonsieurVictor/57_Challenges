package com.stringTests.countSentencesAndWords;

public class AnalyzerApp {

    public ITextReader reader;
    public ITextAnalyzer analyzer;
    public IResultViewer viewer;
    public IAppOptions options;

    public AnalyzerApp(ITextReader reader, ITextAnalyzer analyzer, IAppOptions filter, IResultViewer viewer) {
        this.reader = reader;
        this.analyzer = analyzer;
        this.options = filter;
        this.viewer = viewer;
    }

    public void execute() {
        reader.setFilePath(options.getTextFilePath());
        analyzer.setBuffer(reader.getTextBuffer());
        analyzer.doAnalyze();
        viewer.report(this.analyzer);
    }

    public static void main(String[] args) {
        ITextReader reader = new TextReader();
        ITextAnalyzer analyzer = new TextAnalyzer();
        IAppOptions options = new AppOptions(args);
        IResultViewer viewer = new ResultViewer();
        AnalyzerApp app = new AnalyzerApp(reader, analyzer, options, viewer);
        app.execute(args);
    }
}
