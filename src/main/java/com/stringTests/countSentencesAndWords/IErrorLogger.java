package com.stringTests.countSentencesAndWords;

import java.io.IOException;

public interface IErrorLogger {
    public void errorOpen(IOException e);

    public void errorReadFlags(Exception e);
}
