import static org.junit.Assert.*;
import junit.framework.TestCase;
import org.junit.*;

public class AddressBookTest extends TestCase{
	AddressBook addressBook = null;
	BuddyInfo buddyInfo,bi = null;
	@Before
	public void setUp() throws Exception {
		buddyInfo = new BuddyInfo("craig","zion",333,19);
		bi = new BuddyInfo("babak","esfandiari",666666,19);
		addressBook = new AddressBook();
		addressBook.addBuddy(buddyInfo);
	}
	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void testSize() {
		assertEquals(1,addressBook.size());
	}
	@Test
	public void testIfTwoItems()
	{
		addressBook.addBuddy(bi);
		assertEquals(2,addressBook.size());
	}
	public void testIfItemRemoved()
	{
		addressBook.removeBuddy(1);
		assertEquals(1,addressBook.size());
	}
	@Test
	public void testIfEmpty() {
		addressBook.clear();
		assertEquals(0,addressBook.size());
	}
	
	

	public static void main(String[] args) {
		junit.textui.TestRunner.run(AddressBookTest.class);
		
	}
}