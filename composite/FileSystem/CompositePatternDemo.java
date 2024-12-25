package composite.FileSystem;

public class CompositePatternDemo {
    public static void main(String[] args) {
        // Leaf objects
        File file1 = new File("File1.txt");
        File file2 = new File("File2.txt");
        File file3 = new File("File3.txt");

        // Composite objects
        Directory dir1 = new Directory("Directory1");
        Directory dir2 = new Directory("Directory2");

        // Building the tree structure
        dir1.addComponent(file1);
        dir1.addComponent(file2);

        dir2.addComponent(file3);
        dir2.addComponent(dir1);

        // Display the structure
        dir2.showDetails();
    }
}
