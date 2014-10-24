package comp125;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;  

public class TrackLogTest {

	@Test
	public void testCreateTrackLogDir() throws IOException {
		// test that we can make a tracklog from a directory full of
		// csv files
		final String directory = "data";
		TrackLog tl = new TrackLog(directory);
		
		// this is rather a weak test but since we can't rely on
		// the order of values a fuller test would be more complex
		// so we'll rely on later tests of sort to verify that
		// all required elements are being read in ok
		assertEquals(22, tl.size());
		
	}

	@Test
	public void testCreateEmptyTrackLog() {
		TrackLog tl = new TrackLog();
		
		assertEquals(0, tl.size());
		
	}
	
	@Test
	public void testToString() {
		fail("Test not yet implemented");
	}

	@Test
	public void testSortDistance() {
		fail("Test not yet implemented");
	}

	@Test
	public void testSortTimestamp() {
		fail("Test not yet implemented");
	}

}
