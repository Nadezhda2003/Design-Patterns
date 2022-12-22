package Visitors;

import Components.FileComponent;
import Components.Folder;
import Interfaces.IArchiveVisitor;

import java.io.Console;

public class RarArchiveVisitor implements IArchiveVisitor {
    public void Archive(FileComponent fileComponent)
    {
        System.out.println("Rar..");
        System.out.println(fileComponent.Name);
    }

    public void Archive(Folder folder)
    {
        System.out.println("Rar..");
        System.out.println(folder.Name);
    }
}
