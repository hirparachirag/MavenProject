package com.testing;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testing3 {
	SoftAssert softAssert = new SoftAssert();
	
  @Test(priority=1)
  public void homeTest() {
	  System.out.println("I am in home test");
	  System.out.println("Before Assertion");
	  Assert.assertTrue(4>3, "Verifying Element");
	  System.out.println("After Assertion");
	  Assert.assertEquals("abc", "abc");
  }


  @Test(priority=2, dependsOnMethods={"homeTest"}, groups = "smoke") //test will run only if mentioned test run passes
	//groups function in TestNG is important because it helps run grouped tests in different class all together
  
  	 public void mainTest() {
	  
	  System.out.println("I am in main test");
	  System.out.println("Before Assertion");
	  softAssert.assertTrue(2>3, "Verifying Element");
	  //Here we used soft assert to run the test but it will show it has passed
	  System.out.println("After Assertion");
	  
	  //To collect the failed tests we use below method:
	  softAssert.assertAll();
  }
  
  @Test(priority=2, dependsOnMethods={"mainTest"}, groups = {"smoke", "xyz"})
  public void endTest() {
	  System.out.println("I am in main test");
	  System.out.println("Before Assertion");
	  softAssert.assertTrue(2>3, "Verifying Element");
	  System.out.println("After Assertion");
	  softAssert.assertEquals("abc", "abc1");
	  System.out.println("After Second assertion");
	  softAssert.assertAll(); // This statement runs the test but mark it as failed
  
  }





}
