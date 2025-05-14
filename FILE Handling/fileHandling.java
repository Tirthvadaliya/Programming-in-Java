import java.io.*; //java.io to use reader, writer class for files

public class fileHandling 
{

    public static void main(String[] args) throws IOException 
    { //the read() method may throw IOException

        FileInputStream fileIn = null; //initially fileReader points to null
        FileOutputStream fileOut = null;

        try {
            fileIn = new FileInputStream("sample.txt");
            fileOut = new FileOutputStream("SampleCopy.txt"); //create another file to copy the sample file

            int c;
            while ((c = fileIn.read()) != -1) 
            {
                fileOut.write((char) c); //write all character one by one from sample.txt
            }
            System.out.println("Writing of SampleCopy.txt is complete");
            } 
        catch (FileNotFoundException e) 
        { //when file not exists, it throws exception
            System.out.println("Invalid file-name");
        } 
        finally 
        { //always checks whether fileIn and fileOut are null or not, if not close the file

            if (fileIn != null) {
                fileIn.close();
            }

            if (fileOut != null) {
                fileOut.close();
            }
        }
    }
}
