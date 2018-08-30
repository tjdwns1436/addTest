package com.mytest.cal;

import static org.junit.Assert.*;

import org.junit.Test;

public class addTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
				adder add = new adder();
				assertEquals(17, add.addition(10, 7));
				//assert, true와 false만 있다.
	}

}
