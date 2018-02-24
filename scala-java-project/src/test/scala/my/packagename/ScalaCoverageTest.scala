package my.packagename

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert

class ScalaCoverageTest extends AssertionsForJUnit {

  @Test
  def testJava {
    Assert.assertTrue(JavaCoverage.myMethod());
  }

  @Test
  def testScala {
    Assert.assertTrue(ScalaCoverage.myMethod);
  }
}