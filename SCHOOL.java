
import javax.swing.JOptionPane;
import java.io.*;
public class SCHOOL
{
    // array of PUPIL objects
    private PUPIL pupilList[]; 
    // number of pupils to be called
    int noOfPupils;
    FILEREADCSV pupilmark;
    FILEWRITECSV resultFile;
    private int topmark;
    private int maxDataPosition;
    public SCHOOL()
    {
        pupilmark = new FILEREADCSV();
        resultFile = new FILEWRITECSV();
    }

    // top level algorithm
    public void processpupils() throws IOException
    { 
        setupPupilList();
        findmaxData();
    }

    private void setupPupilList() throws IOException
    { 
        // first user pupil
        System.out.println("School: Pupil mark update");
        System.out.println("** Preparing to read data file");
        // read file, fetch data as String array containing the rows
        String[] dataRows = pupilmark.readCSVtable ();
        // calculate the number of member rows, skip headings
        noOfPupils = dataRows.length;
        // update user with number of rows with pupil details
        System.out.println ("** " + noOfPupils + " rows read.\n\n");
        pupilList = new PUPIL[noOfPupils];
        for (int i = 0; i < noOfPupils; i++)
        {
            pupilList[i] = new PUPIL();
            pupilList[i].readPupilDetails(dataRows[i]);
        }
    }

    public void findmaxData() throws IOException
    {
       int maxDataposition = 0;
       String fileContent = "";
        for (int i = 1; i < noOfPupils; i++)
        {
            if (pupilList[i].getpupilmark() > pupilList [maxDataPosition].getpupilmark())
        {
            maxDataPosition = i;
        }
      }
      if (maxDataPosition>1)
      {
          fileContent = fileContent.concat("\n");
        }
      fileContent = fileContent.concat(pupilList[maxDataPosition].writeDetails());
      
      System.out.print("Top Mark is:" + maxDataPosition);
      pupilList[maxDataPosition].displaydetails();
      System.out.println();
      
      System.out.println("** Preparing to write data file.");
      resultFile.writeCSVtable(fileContent);
      System.out.println("** File written and closed.");
     }
    }