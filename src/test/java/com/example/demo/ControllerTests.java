package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class ControllerTests {

	@Test
    public void testHomeController() {
        DemoApplication demoApplication = new DemoApplication();
        String result = demoApplication.home();
        assertEquals(result, "Welcome to my first Spring Boot Application!");
    }
	
	@Test
    public void testAddingTwoNumbersController() {
		AddingTwoNumbersController addingTwoNumbersController = new AddingTwoNumbersController();
        int result = addingTwoNumbersController.getResultOfAddition(5, 4);
        assertEquals(result, 9);
    }
	
	@Test
    public void testAddingTwoNumbersInPostController() {
		AddingTwoNumbersInPostController addingTwoNumbersInPostController = new AddingTwoNumbersInPostController();
		AddingTwoNumbers addingTwoNumbers = new AddingTwoNumbers(12, 10);
        String result = addingTwoNumbersInPostController.twoNumberSubmit(addingTwoNumbers);
        assertEquals(result, "TwoNumberResult");
    }
}
