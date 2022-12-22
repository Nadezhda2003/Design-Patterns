package Components;

import Interfaces.IArchiveVisitor;
import Interfaces.IFileComponent;

import java.io.Console;

public class FileComponent implements IFileComponent {
    public String Name;

    public FileComponent(String name)
    {
        Name = name;
    }

    public void Display()
    {
        System.out.println(String.format("File name %s", Name));
    }

    public void AcceptArchiving(IArchiveVisitor visitor)
    {
        visitor.Archive(this);
    }
}
