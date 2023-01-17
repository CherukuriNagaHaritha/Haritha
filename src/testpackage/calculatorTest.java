package testpackage;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
public class calculatorTest {

	@Test
	public void testAdd() {
		Calculator1 obj=new Calculator1();
		int expected=30;
		int actual=obj.add(10, 20);
		Assertions.assertEquals(expected, actual);
	}

	@Test
	public void testMultiply() {
		Calculator1 obj=new Calculator1();
		int expected=20;
		int actual=obj.multiply(10, 2);
		Assertions.assertEquals(expected, actual);

	}

	@Test
	public void testSubtract() {
		Calculator1 obj=new Calculator1();
		int expected=15;
		int actual=obj.subtract(25, 10);
		Assertions.assertEquals(expected, actual);

		
	}

	@Test
	public void testDivide() {
		Calculator1 obj=new Calculator1();
		float expected=4;
		float actual=obj.divide(20, 5);
		Assertions.assertEquals(expected, actual);

	}

}
