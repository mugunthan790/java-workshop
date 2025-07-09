package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyUsingBinary {

 public static void main(String[] args){
    try (FileInputStream in = new FileInputStream("download.jpg");
     FileOutputStream out = new FileOutputStream("MyLogo.jpg")) {
    byte[] chunk = new byte[1024];
    int bytesRead;
    while ((bytesRead = in.read(chunk)) != -1) {
        out.write(chunk, 0, bytesRead);
    }
    catch (IOException e){
System.out.println("error in reading or writting the file");
}
}
 

 }   
}
