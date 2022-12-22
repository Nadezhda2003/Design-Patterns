package Visitors;
import Components.FileComponent;
import Components.Folder;
import Interfaces.IArchiveVisitor;

public class ZipArchiveVisitor implements IArchiveVisitor {
    public void Archive(FileComponent fileComponent)
    {
        System.out.println("Zip..");
        System.out.println(fileComponent.Name);
    }

    public void Archive(Folder folder)
    {
        System.out.println("Zip..");
        System.out.println(folder.Name);
    }
}
