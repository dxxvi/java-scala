package home

import org.scalatest.Matchers
import org.scalatest.junit.JUnitSuiteLike
import _root_.org.junit.{Rule, Test}
import _root_.org.junit.rules.TemporaryFolder

class MyScalaTest extends JUnitSuiteLike with Matchers {
    val _temporaryFolder = new TemporaryFolder

    @Rule def temporaryFolder = _temporaryFolder

    @Test def test1(): Unit = {
        println(s"Hello World! ${temporaryFolder.getRoot.getAbsolutePath}")
    }
}
