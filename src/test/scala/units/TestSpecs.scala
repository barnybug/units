package units

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

import units.constants._
import units.suffixes._

class TestSpecs extends FunSuite with ShouldMatchers {
  test("c * year") {
    (c * year in m).toString should equal("9454254955488000.000000 m")
  }

  test("c in mph") {
    (c in mph).toString should equal("670616629.384395 miles/h")
  }

  test("au / (60 mph) in weeks") {
    (au / (60 mph) in weeks).toString should equal("553308.376625 weeks")
  }

  test("10.stone in kg") {
    (10.stone in kg).toString should equal("63.502932 kg")
  }
}
