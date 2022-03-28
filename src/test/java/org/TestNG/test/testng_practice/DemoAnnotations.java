package org.TestNG.test.testng_practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoAnnotations {
	

@Test
public void test() {
	System.out.println("test executed");
	}

@BeforeClass
public void beforeclasssetup() {
	System.out.println("Before class");
}
@BeforeMethod
public void beforemethodsetup() {
	System.out.println("Before method");
}

@AfterMethod
public void aftermethodsetup() {
	System.out.println("After method");
}

@AfterClass
public void afterclasssetup() {
	System.out.println("After class");
}

}
