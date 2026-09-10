/*Main objective is to recreate the structure in the instructions
* here we print everything out and give the full structure of what's shown in the instruction
*
* */

public class Main {
    public static void main(String[] args) {

        //Tree view package name it php_demo1, and in it is source file, include path, remote files
        //but for this case we are only tampering with source
        Folder php_demo1 = new Folder("php_demo1");
        Folder source = new Folder("Source Files");
        php_demo1.addFolder(source);  //this means we will add source folder into our php_demo1(package)


        // In that source folder we have .phalcon, app,cache,and public these are considered subFolders(folders in folders)
        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");

        //So now that those objects have been created I need to add them into ArrayList Folder containing source
        //which is why source . addFolder is needed
        source.addFolder(phalcon);
        source.addFolder(app);
        source.addFolder(cache);
        source.addFolder(publicFolder);

        // Now what's missing as shown in the instruction is the app folder contents and public contents
        //Since app folder holds only folders "subFolders" we need to create folder objects for each one
        //finally insert it into our app by calling our app
        app.addFolder(new Folder("config"));
        app.addFolder(new Folder("controllers"));
        app.addFolder(new Folder("library"));
        app.addFolder(new Folder("migrations"));
        app.addFolder(new Folder("models"));
        app.addFolder(new Folder("views"));

        // Since we also have a publicFolder file created lets also inserted there
        publicFolder.addFile(new File(".htaccess"));
        publicFolder.addFile(new File("htrouter.php"));
        publicFolder.addFile(new File("index.html"));


        System.out.println();
        // This is how it would Look like in resemblance to instruction
        System.out.println("FULL STRUCTURE:");
        php_demo1.print();

        System.out.println();
        // Then I need to delete the folder app
        source.deleteFolder("app");
        System.out.println("\nAfter Deleting folder App: ");
        php_demo1.print();

        System.out.println();
        // Then finally delete public folder
        source.deleteFolder("public");
        System.out.println("\nAfter Deleting folder public: ");
        php_demo1.print();
    }
}
