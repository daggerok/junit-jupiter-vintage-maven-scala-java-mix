package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(BlockJUnit4ClassRunner.class)
public class JavaJunit4Tests {

	@Test
	public void contextLoads() {
		final int result = Scalculator.add(1, 3);
		assertEquals("1 + 3 should equal 4", 4, result);
	}
}
