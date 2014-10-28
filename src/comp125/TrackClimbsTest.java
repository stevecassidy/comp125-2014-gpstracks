package comp125;

import static org.junit.Assert.*;
 
import java.io.IOException; 

import org.junit.Test;

public class TrackClimbsTest {

 
    
    @Test
    public void test_track_climbs() throws IOException, GPSException {
         
        Track bobbin = new Track("data/bobbin-head.csv"); 

        // find climbs over 3km
        ArrayList<Track> climbs = bobbin.findClimbs(3.0);
        
        
        // check that there are three climbs in the result
        assertEquals(3, climbs.size());
        
    }
    
    
    
}
