/*For this class the folder we need to understand what goes into it
* for say file and some subFolders can be found in a Folder
* So we need an array list for each file or subfolder
* we need a constructor and set/get
* we need to insert some index into list
*
* Now because we know that in the instruction we need to be able to delete a folder
* we need to be able to remove it arraylist remove can help
*
* finally print out
* */

import java.util.ArrayList;

public class Folder {
    private String name;
    private ArrayList<File> files = new ArrayList<>();
    private ArrayList<Folder> subfolders = new ArrayList<>();

    public Folder(String name) {
        setName(name);
    }

    //Accessor and mutators of name
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    //Using ArrayList files/folder we need to add details into it
    public void addFile(File f) {
        files.add(f);
    }

    public void addFolder(Folder f) {
        subfolders.add(f);
    }

    //Using Array list we can use remove to find the exact name of the folder and remove it if there
    public void deleteFolder(String folderName) {
        subfolders.removeIf(f -> f.name.equals(folderName));
    }

    //print
    public void print() {
        System.out.println("\t"+ name);

        for (File f : files) {
            System.out.print("\t\t"); //give is some space
            f.print();
        }

        for (Folder f : subfolders) {
            System.out.print("\t"); //give is some space
            f.print();
        }
    }
}
