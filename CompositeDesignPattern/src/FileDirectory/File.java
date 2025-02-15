package FileDirectory;

public class File implements FileSystem {

    String fileName;

    public File(String name) {
        this.fileName = name;
    }

    public void ls(int level) {
        for(int i=0;i<level;i++) {
            System.out.print("  ");
        }
        System.out.print("File Name : " + fileName);
        System.out.println();
    }
}
