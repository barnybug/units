package units

trait Derived extends Length with Time {
  // speed
  val c = (m / s * 299792458).suffix("c")
  val mph = miles / hour
}
