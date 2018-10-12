
package day4_06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyFile 
{
    private static void copyFile(File source, File dest) throws IOException 
    {
        InputStream input = null;
        OutputStream output = null;
        try 
        {
            input = new FileInputStream(source);
            output = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = input.read(buffer)) > 0) 
            {
                output.write(buffer, 0, length);
            }
        } finally 
        {
            input.close();
            output.close();
        }
    }    

    public static void main(String[] args) 
    {
        try 
        {
            File file1 = new File("A:");
            File file2 = new File("B:");            
            copyFile(file1, file2);
        } catch (IOException io) 
        {
            System.out.println(io.getMessage());
        }     

    }
}

