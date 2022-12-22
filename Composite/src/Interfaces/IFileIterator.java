package Interfaces;

import jdk.jshell.spi.ExecutionControl;

public interface IFileIterator {
    boolean HasNext();
    IFileComponent Next();
    void Reset() throws ExecutionControl.NotImplementedException;
}
