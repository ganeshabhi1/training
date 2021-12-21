package com.sonata.junit;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class junitExample {
	addi b1 = new addi();
	int x = b1.add(10,20);
	@Test
	public void ga() {
		assertEquals(x,30);
	}
	int k = b1.add(20, 30);
	@Test
	public void g() {
		assertEquals(k,50);
	}
	
			
			
			
}
