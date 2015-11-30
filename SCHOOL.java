

import javax.swing.JOptionPane;
import java.io.*;
public class SCHOOL
{
    // array of PUPIL objects
    private PUPIL pupilList[]; 
    // number of pupils to be called
    int noOfPupils;
    FILEREADCSV pupilFile;

    public SCHOOL()
    {
        pupilFile = new FILEREADCSV();
    }

    // top level algorithm
    public void processpupils() throws IOException
    { 
        setupPupilList();
        countpupilmark();
    }

    private void setupPupilList() throws IOException
    { 
        // first user member
        System.out.println("School: Pupil mark update");
        System.out.println("** Preparing to read data file");
        // read file, fetch data as String array containing the rows
        String[] dataRows = pupilmark.readCSVtable();
        // calculate the number of member rows, skip headings
        noOfPupils = dataRows.length - 1;
        // update user with number of rows with membership details
        System.out.println ("** " + noOfPupils + " rows read.\n\n");
    }
    
    public void countpupilmark()
    {
        //placeholder
    }
}