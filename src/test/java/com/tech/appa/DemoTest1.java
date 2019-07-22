package com.tech.appa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest1 {

	@Test
	public void sum() {
		System.out.println("SUM 1");
		int a = 10;
		int b = 20;
		Assert.assertEquals(30, a+b);
	}
	
	@Test
	public void sub() {
		System.out.println("SUB 1");
		int a = 10;
		int b = 20;
		Assert.assertEquals(10, b-a);
	}
	
	@Test
	public void div() {
		System.out.println("DIV 1");
		int a = 10;
		int b = 20;
		Assert.assertEquals(2, b/a);
	}
	
	@Test
	public void multi() {
		System.out.println("MULTI 1");
		int a = 10;
		int b = 20;
		Assert.assertEquals(200, a*b);
	}
}

