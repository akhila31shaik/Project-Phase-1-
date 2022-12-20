package org.cisco.projectphase1.services;
import java.io.File;
import org.cisco.projectphase1.files.Directory;
public class DirectoryService {
    private static Directory fileDirectory = new Directory();

    public static void PrintFiles() {

        fileDirectory.addFiles();

        for (File file : DirectoryService.getFileDirectory().getFiles())
        {
            System.out.println(file.getName());
        }
    }
    public static Directory getFileDirectory() {
        return fileDirectory;
    }

    public static void setFileDirectory(Directory fileDirectory) {
        DirectoryService.fileDirectory = fileDirectory;
    }

}
