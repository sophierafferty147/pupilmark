
public class PUPIL
{
    // list of properties
    private String fName;
    private String sName;
    private int pupilmark;
    private int topmark;
    public PUPIL()
    {
        //constructor
        fName = "";
        sName = "";
        pupilmark = 0;
        topmark = 0;
    }
    // file handling store details from file
    public void readPupilDetails(String dataItems)
    {
        // unpack string of row data into fields
        String[] rowItems = dataItems.split(",");
        // store each data items as instance property 
        fName = rowItems [0];
        sName = rowItems [1];
        pupilmark = Integer.parseInt(rowItems[2]);
    }

    public String writeDetails()
    {
        // join up data into string to output as a row
        // use "," to separate csv colums
        String pupilData = "";
        pupilData = pupilData.concat(fName);
        pupilData = pupilData.concat(",");
        pupilData = pupilData.concat(sName);
        pupilData = pupilData.concat(",");
        pupilData = pupilData.concat(Integer.toString(pupilmark));
        return pupilData;
    }

    public int getpupilmark()
    {
        return pupilmark;
    }

    public void displaydetails()
    {
        System.out.print("Pupil: " + fName + " " + sName);
        System.out.print(" Pupil mark is " + pupilmark);
        System.out.println();
    }

}