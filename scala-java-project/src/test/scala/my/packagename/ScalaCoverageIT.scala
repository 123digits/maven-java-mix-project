package my.packagename

import org.scalatest.junit.AssertionsForJUnit
import org.junit.Test
import org.junit.Assert

class ScalaCoverageIT extends AssertionsForJUnit {

  @Test
  def test {
    Assert.assertTrue(JavaCoverage.myMethod());
  }

  @Test
  def testScala {
    Assert.assertTrue(ScalaCoverage.myMethod);
  }
}