package server;

import java.io.File;
import java.util.ArrayList;

public class FileStorage {
    private int maxSpace;
    private ArrayList<String> files;


    public FileStorage() {
        this.maxSpace = 10;
        this.files = new ArrayList<>();
    }

    public void addFile(String file) {

        if ((files.size() + 1) < this.maxSpace && !files.contains(file) && checkFilename(file)) {
            files.add(file);
            System.out.println("The file " + file + " added successfully");
        } else {
            System.out.println("Cannot add the file " + file);
        }
    }

    public boolean checkFilename(String file) {
        for (int i = 0; i <=this.maxSpace; i++) {
            if (file.equals("file" + i)) {
                return true;
            }
        }
        return false;
    }

    public void getFile(String filename) {
        boolean found = false;
        for (String file : files) {
            if (file.equals(filename)) {
                System.out.println("The file " +filename + " was sent");
                found = true;
            }
        }
        if (!found) {
            System.out.println("The file " + filename + " not found");
        }
    }

    public void deleteFile(String filename) {
        boolean found = false;
        int index = 0;
        while(!found && index < files.size()) {
            if (files.get(index).equals(filename)) {
                files.remove(index);
                System.out.println("The file " + filename + " was deleted");
                found = true;
            }
            index++;
        }
        if (!found) {
            System.out.println("The file " + filename + " not found");
        }
    }



}
