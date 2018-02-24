package my.packagename;

import org.junit.Assert;
import org.junit.Test;

public class JavaCoverageIT {

	@Test
	public void test() {
		Assert.assertTrue(JavaCoverage.myMethod());
	}
}
