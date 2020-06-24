package testProject.controller;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



public class TestApplicationControllerTest {

	TestApplicationController testApplicationController=new TestApplicationController();

		@Test
		void testAddingTwoPositives() {
			assertEquals(2, testApplicationController.add(1, 1), 
					"Add method should return the sum of two numbers");
		}

		@Test
		void testMultiplyingTwoNumbers() {
			assertEquals(10, testApplicationController.multiply(5, 2), 
					"Multiply method should return the product of two numbers");
		}

		@Test
		void testAddingTwoNegatives() {
			assertEquals(-2, testApplicationController.add(-1, -1), 
					"Add method should return the sum of two numbers");
		}

		@Test
		void testAddingAPositiveAndANegative() {
			assertEquals(0, testApplicationController.add(-1, 1), 
					"Add method should return the sum of two numbers");
		}
}
