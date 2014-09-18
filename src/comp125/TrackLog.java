package comp125;

import java.io.File;
import java.io.FileNotFoundException;

public class TrackLog { 
    
	private Track[] tracks;
    private int ntracks;
    final int MAX_TRACKS = 20;
    
    
    /* Constructor to make a TrackLog from a directory of csv files */
    public TrackLog(String directory) throws FileNotFoundException  {
        super(); 

        tracks = new Track[MAX_TRACKS];
        ntracks = 0;
        
        File path = new File(directory);
        File[] fullList = path.listFiles();

        /*
         * for each file in the directory, if the name ends with csv
         * we try to read it into a Track object and store that in
         * our tracks array
         */
        for(int i=0; i<fullList.length; i++) {
            if (fullList[i].toString().endsWith("csv")) {
            	try {
	                Track tr = new Track(fullList[i].toString());
	                add(tr);
            	} catch (GPSException e) {
            		// badly formed track file, just ignore
            	}
            }
        }

    }

    public int size() {

    }
    
    public void add(Track tr) {

    }

    public Track get(int index) {

    }

    public String toString() {
    	
    }
    
 
    public void sortDistance() {
        
    }
    

    public void sortTimestamp() {
        
    }
    
    public static void main(String args[]) {
        
    }
    
}
