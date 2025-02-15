package FileDirectory;

public class Main {

    public static void main (String args[]) {

        Directory dir = new Directory("Coding Workspace");
        Directory subDir1 = new Directory("LLD");
        Directory subDir2 = new Directory("DSA");
        Directory subDir3 = new Directory("DecoratorPattern");

        subDir1.add(subDir3);
        subDir1.add(new Directory("ObserverPattern"));
        subDir2.add(new Directory("Linked List"));
        subDir2.add(new Directory("Graphs"));

        File fs1 = new File("FileDirectory");
        File fs2 = new File("Tic Tac Toe");
        File fs3 = new File("Djisktra Algorithm");
        File fs4 = new File("Bellman Ford");

        subDir1.add(fs1);
        subDir1.add(fs2);
        subDir2.add(fs3);
        subDir2.add(fs4);
        subDir3.add(fs1);

        dir.add(subDir1);
        dir.add(subDir2);

        System.out.println("Listing contents of the directory -> ");
        dir.ls(0);
    }
}
