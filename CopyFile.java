import java.io.*;
public class CopyFile{
public static void main(String args[]){
String sourcefile="input.txt";
String destfile="output.txt";
try{
FileInputStream fis= new FileInputStream(sourcefile);
FileOutputStream fos=new FileOutputStream(destfile);
int ch;
while((ch=fis.read())!=-1){
fos.write(ch);
}
fis.close();
fos.close();
System.out.println("File copied sucessfully");
}
catch(IOException e){
System.out.println("error occured:"+e.getMessage());
}}}