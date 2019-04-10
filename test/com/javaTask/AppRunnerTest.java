package com.javaTask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppRunnerTest {

	@Test
	void testAppRunner() {
		assertEquals(" 9999\n    9\n_____\n89991", AppRunner.doMultAndPrint(9999, 9));
	}

}
