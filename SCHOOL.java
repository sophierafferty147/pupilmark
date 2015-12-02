

import javax.swing.JOptionPane;
import java.io.*;
public class SCHOOL
{
    // array of PUPIL objects
    private PUPIL pupilList[]; 
    // number of pupils to be called
    int noOfPupils;
    FILEREADCSV pupilmark;

    public SCHOOL()
    {
        pupilmark = new FILEREADCSV();
    }

    // top level algorithm
    public void processpupils() throws IOException
    { 
        setupPupilList();
        countpupilmark();
    }

    private void setupPupilList() throws IOException
    { 
        // first user pupil
        System.out.println("School: Pupil mark update");
        System.out.println("** Preparing to read data file");
        // read file, fetch data as String array containing the rows
        String[] dataRows = pupilmark.readCSVtable ();
        // calculate the number of member rows, skip headings
        noOfPupils = dataRows.length - 1;
        // update user with number of rows with pupil details
        System.out.println ("** " + noOfPupils + " rows read.\n\n");
        pupilList = new PUPIL[noOfPupils];
        for (int i = 0; i < noOfPupils; i++)
        {
            pupilList[i] = new PUPIL();
            pupilList[i].readPupilDetails(dataRows[i+1]);
        }
    }
    
    public void countpupilmark()
    {
        //placeholder
    }
}