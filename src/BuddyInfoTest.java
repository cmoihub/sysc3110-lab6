import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.*;

public class BuddyInfoTest extends TestCase {
	public BuddyInfo bi,buddyInfo = null;
	@Before
	public void setUp() throws Exception {
		bi = new BuddyInfo("Dizaster","Ottawa",7777777,23);
		bi.setGreeting("www");
		buddyInfo = bi;
	}
	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void testEligibility()
	{
		assertTrue(bi.over18());
	}
	@Test
	public void testGreeting()
	{
		assertEquals("www",bi.getGreeting());
	}
	@Test
	public void testCopy()
	{
		assertTrue(bi.equals(buddyInfo));
	}

	public static void main(String[] args) {
		junit.textui.TestRunner.run(BuddyInfoTest.class);
	}
}
