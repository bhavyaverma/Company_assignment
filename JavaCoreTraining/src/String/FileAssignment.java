package String;
import java.io.*;



/**
 * Created by bhavyaverma on 2/1/17.
 */
public class FileAssignment {

    static void createFile() throws Exception {

        File dir = new File("/Users/bhavyaverma/desktop/FFolder");

        if (!dir.exists()) {
            dir.mkdir();
        }

        File f1 = new File(dir, "file1.txt");
        f1.createNewFile();
    }

    public static void  writeFile(String fileName) throws Exception
    {

            File f1 = new File("/Users/bhavyaverma/desktop/FFolder/file1.txt");

            PrintWriter pw = new PrintWriter(f1);
            pw.println("Hello");
            pw.println("U r writing");




                pw.flush();

                pw.close();




    }

    public static void readFile(String fileName) throws Exception
    {
       File f1 = new File("/Users/bhavyaverma/desktop/FFolder/file1.txt");

       FileReader fr = new FileReader(f1);
       BufferedReader br = new BufferedReader(fr);
       String s;
       while ((s = br.readLine())!= null)
       {
           System.out.println(s);
       }

       fr.close();

       br.close();



    }

    public static void copyFile() throws IOException
    {
        File file2 = new File("/Users/bhavyaverma/desktop/FFolder/copyfile.txt");
        FileReader fr = new FileReader("/Users/bhavyaverma/desktop/FFolder/file1.txt");
        BufferedReader br = new BufferedReader(fr);
        FileWriter fw = new FileWriter(file2);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        int copy = br.read();
        while (copy!=-1)
        {
            pw.write((char)copy);
            copy = br.read();

        }
        pw.flush();
        fw.flush();
        pw.close();
        fw.close();
    }

    public static void main(String[] args) throws Exception {
        createFile();
        writeFile("file1.txt");
        readFile("file1.txt");
        copyFile();




    }
}
