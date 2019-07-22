package com.tech.appa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest2 {

	@Test
	public void sum() {
		System.out.println("SUM 2");
		int a = 10;
		int b = 20;
		Assert.assertEquals(30, a+b);
	}
	
	@Test
	public void sub() {
		System.out.println("SUB 2");
		int a = 10;
		int b = 20;
		Assert.assertEquals(10, b-a);
	}
	
	@Test
	public void div() {
		System.out.println("DIV 2");
		int a = 10;
		int b = 20;
		Assert.assertEquals(2, b/a);
	}
	
	@Test
	public void multi() {
		System.out.println("MULTI 2");
		int a = 10;
		int b = 20;
		Assert.assertEquals(200, a*b);
	}
}

