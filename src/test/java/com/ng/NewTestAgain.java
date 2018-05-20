package com.ng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTestAgain {

	@Test
	public void testAgain1() { 
		Assert.assertEquals(1, 1*1);
	}



	@Test
	public void testAgain2() { 
		Assert.assertEquals(3, 2+1);
	}
	
	@Test
	public void testAgain3() { 
		Assert.assertEquals(4, 2+2);
	}


}

