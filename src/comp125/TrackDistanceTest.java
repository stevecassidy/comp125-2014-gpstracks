package comp125;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class TrackDistanceTest {

   
    
    @Test
    public void test_track_distance() throws IOException, GPSException {
        
        Track tr = new Track("data/small-sample.csv"); 
        Track tr2 = new Track("data/sample.csv"); 
        Track tr3 = new Track("data/ttt.csv"); 

        // distance to yourself should be zero
        assertEquals(0.0, tr.distance(tr), 0.001);

        double s1 = tr2.distance(tr);
        double s2 = tr2.distance(tr3);

        // distance to small-sample should be positive since 
        // small sample is a subset of sample
        assertTrue(s1 > 0);
        
        // distance to ttt should be bigger since there is no overlap
        assertTrue(s2 > s1);
        
        // should the distance measure be symmetric ??
        // ie is a->b the same as b->a? 
        // you decide and add this test if you wish
        // assertEquals(s1, tr.distance(tr2), 0.01);

    }
    
    
    
}
