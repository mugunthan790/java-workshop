public class FileHandiling {
    public static void main(String[] args) {
        if (file.isDirectory()) {
            System.out.println("The path is a directory.");
             file[] files = file.listFiles();
            if (files != null) {
                System.out.println("Files in the directory:");
                for (File f : files) {
                    System.out.println(f.getName());
                }
            } else {
                System.out.println("The directory is empty.");
    }
}