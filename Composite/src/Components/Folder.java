package Components;

import Interfaces.IArchiveVisitor;
import Interfaces.IFileComponent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Folder implements IFileComponent {
    public List<IFileComponent> Components = new ArrayList<IFileComponent>();
    public String Name;

    public Folder(String name)
    {
        Name = name;
    }

    public void Display()
    {
        System.out.println(Name);
        Components.forEach(component -> component.Display());
    }

    public void AddComponent(IFileComponent fileComponent)
    {
        Components.add(fileComponent);
    }

    public void RemoveComponent(IFileComponent fileComponent)
    {
        Components.remove(fileComponent);
    }

    public void AcceptArchiving(IArchiveVisitor visitor)
    {
        visitor.Archive(this);
    }
}
