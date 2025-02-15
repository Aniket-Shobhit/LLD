package FileDirectory;
import java.util.*;

public class Directory implements FileSystem {

    List<FileSystem> fileSystemList;
    String directoryName;

    public Directory(String name) {
        this.directoryName = name;
        this.fileSystemList = new ArrayList<>();
    }

    public void add(FileSystem fileSystem) {
        this.fileSystemList.add(fileSystem);
    }

    public void ls(int level) {
        for(int i=0;i<level;i++) {
            System.out.print("  ");
        }
        System.out.print("Directory Name: " + directoryName);
        System.out.println();
        for(FileSystem fileObj: fileSystemList) {
            fileObj.ls(level+1);
        }
    }
}
