package jUnitTestingPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addTwoStrings {

	@Test
	void test() {
		jUnitFunction junitstring = new jUnitFunction();
		String result = junitstring.addstrings("capstone", "project");
		assertEquals ("capstoneproject", result);
	}

}
