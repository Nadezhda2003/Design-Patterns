package Interfaces;

import Components.FileComponent;
import Components.Folder;

public interface IArchiveVisitor {
    void Archive(FileComponent fileComponent);

    void Archive(Folder folder);
}
