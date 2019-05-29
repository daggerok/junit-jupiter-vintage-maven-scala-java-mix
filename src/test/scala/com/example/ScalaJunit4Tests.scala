package com.example

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.BlockJUnit4ClassRunner

@RunWith(classOf[BlockJUnit4ClassRunner])
class ScalaJunit4Tests {
	@Test def test(): Unit = assertEquals("2 + (-5) should equal -3", -3, Calculator.add(2, -5))
}
