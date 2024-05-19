package proj2;

import static org.junit.Assert.*;

import org.junit.Test;
import proj2.projectt2;

public class projectt2Test {
	projectt2 cal = new projectt2();

	@Test
	public void testsum() {
		assertEquals(10,cal.sum(5,5));
		
	}
	@Test
	public void testdiff() {
		assertEquals(0,cal.diff(5,5));
		
	}

}
