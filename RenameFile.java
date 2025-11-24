import java.io.*;
public class RenameFile{
public static void main(String args[]){
File oldfile=new File("oldname.txt");
File newfile= new File("newname.txt");
if(oldfile.renameTo(newfile)){
System.out.println("File renamed sucessfully");
}
else{
System.out.println("Failed to rename file");
}}}