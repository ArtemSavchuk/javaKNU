package hw9;

import java.util.ArrayList;
import java.util.List;

class File {
    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Directory {
    private String name;
    private List<File> files;

    public Directory(String name) {
        this.name = name;
        this.files = new ArrayList<>();
    }

    public void create(File file) {
        files.add(file);
    }

    public void displayContents() {
        System.out.println("Contents of directory " + name + ":");
        for (File file : files) {
            System.out.println(file.getName());
        }
    }

    public void rename(String oldName, String newName) {
        for (File file : files) {
            if (file.getName().equals(oldName)) {
                file = new File(newName);
                break;
            }
        }
    }

    public void delete(String name) {
        files.removeIf(file -> file.getName().equals(name));
    }
}

class TextFile extends File {
    private String content;

    public TextFile(String name, String content) {
        super(name);
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void displayContent() {
        System.out.println("Content of file " + getName() + ":");
        System.out.println(content);
    }

    public void append(String additionalContent) {
        content += additionalContent;
    }
}

public class task5_12 {
    public static void main(String[] args) {
        Directory directory = new Directory("MyFiles");

        
        TextFile textFile = new TextFile("example.txt", "This is the file content.");

        
        directory.create(textFile);

        
        directory.displayContents();

        
        textFile.displayContent();

        
        textFile.append(" Now with additional content.");

        
        textFile.displayContent();

        
        directory.rename("example.txt", "new_file.txt");

        
        directory.displayContents();

        
        directory.delete("new_file.txt");

        
        directory.displayContents();
    }
}