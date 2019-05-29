package com.example.scalacode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ScalculatorTests {
	@Test def test(): Unit = assertEquals(2, Scalculator.add(0, 2), s"0 + 2 should equal 2")
}
