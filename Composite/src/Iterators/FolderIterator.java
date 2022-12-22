package Iterators;

import Components.Folder;
import Interfaces.IFileComponent;
import Interfaces.IFileIterator;
import jdk.jshell.spi.ExecutionControl;

import java.util.List;

public class FolderIterator implements IFileIterator {
    protected List<IFileComponent> files;
    protected int currentIndex;
    public FolderIterator(Folder folder)
    {
        files = folder.Components;
        currentIndex = 0;
    }

    public boolean HasNext()
    {
        return currentIndex < files.size() - 1;
    }

    public IFileComponent Next()
    {
        return files.get(currentIndex++);
    }

    public void Reset() throws ExecutionControl.NotImplementedException {
        throw new ExecutionControl.NotImplementedException("Not Implemented Exception.");
    }
}
