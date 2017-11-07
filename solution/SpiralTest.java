import junit.framework.*;
import org.junit.Test;
import java.util.Arrays;
import org.junit.Assert;

public class SpiralTest extends TestCase {

	@Test
	public void testTrue() throws Exception {
		assertEquals(true, true);
	}

	@Test
	public void test3() throws Exception {
		int grid[][] = {
			{0,0,0},
			{1,1,0},
			{1,0,0}
		};
		int result[][] = Spiral.create(3);
		for (int i = 0; i < result.length; i++) {
			Assert.assertArrayEquals(grid[i], result[i]);
		}
	}

	@Test
	public void test5() throws Exception {
		int grid[][] = {
			{1,1,1,1,1},
			{0,0,0,0,1},
			{0,1,1,0,1},
			{0,1,0,0,1},
			{0,1,1,1,1}
		};
		int result[][] = Spiral.create(5);
		for (int i = 0; i < result.length; i++) {
			Assert.assertArrayEquals(grid[i], result[i]);
		}
	}

	@Test
	public void test9() throws Exception {
		int grid[][] = {
			{1,1,1,1,1,1,1,1,1},
			{0,0,0,0,0,0,0,0,1},
			{0,1,1,1,1,1,1,0,1},
			{0,1,0,0,0,0,1,0,1},
			{0,1,0,1,1,0,1,0,1},
			{0,1,0,1,0,0,1,0,1},
			{0,1,0,1,1,1,1,0,1},
			{0,1,0,0,0,0,0,0,1},
			{0,1,1,1,1,1,1,1,1}
		};
		int result[][] = Spiral.create(9);
		for (int i = 0; i < result.length; i++) {
			Assert.assertArrayEquals(grid[i], result[i]);
		}
	}

	@Test
	public void test11() throws Exception {
		int grid[][] = {
			{0,0,0,0,0,0,0,0,0,0,0},
			{1,1,1,1,1,1,1,1,1,1,0},
			{1,0,0,0,0,0,0,0,0,1,0},
			{1,0,1,1,1,1,1,1,0,1,0},
			{1,0,1,0,0,0,0,1,0,1,0},
			{1,0,1,0,1,1,0,1,0,1,0},
			{1,0,1,0,1,0,0,1,0,1,0},
			{1,0,1,0,1,1,1,1,0,1,0},
			{1,0,1,0,0,0,0,0,0,1,0},
			{1,0,1,1,1,1,1,1,1,1,0},
			{1,0,0,0,0,0,0,0,0,0,0}
		};
		int result[][] = Spiral.create(11);
		for (int i = 0; i < result.length; i++) {
			Assert.assertArrayEquals(grid[i], result[i]);
		}
	}
}