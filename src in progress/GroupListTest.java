import static org.junit.Assert.*;

import org.junit.Test;


public class GroupListTest {

	@Test
	public void testAddToList() {
		GroupList.addToList("Continent",new Group(new Info[]{new Name("Europe"),new Population("2"),new Area("1")}, "Continent"));
		GroupList.addToList("Country",new Group(new Info[]{new Name("England"),new Population("2"),new Area("1")}, "Country"));
		GroupList.addToList("City",new Group(new Info[]{new Name("London"),new Population("2"),new Area("1")}, "City"));
	}

	@Test
	public void testGetString() {
		fail("Not yet implemented");
	}

}
