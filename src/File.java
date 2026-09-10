/*In this class we will just
* create an acknowledgment to a file
* constructor and set/get is need
* print is also needed no override
* */

public class File {
    private String name;

    public File(String name) {
        setName(name);
    }

    //Accessor and mutators of name
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    //Print
    public void print() {
        System.out.println("\t" + name);
    }
}
