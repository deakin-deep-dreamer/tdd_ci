package first;

import org.junit.Assert;
import org.junit.Test;

public class AddTest {

	@Test
	public void testAddValidAB() {
		System.out.println("testAddValidAB...");
		Assert.assertEquals(MathUtil.add(1, 2), 3);
	}
	
	@Test
	public void testAddInvalidAValidB() {
		Assert.assertNotNull(MathUtil.add(Integer.parseInt(null), 1));
	}
}
