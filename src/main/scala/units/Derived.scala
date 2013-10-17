package units

trait Derived extends Length with Time {
  // speed
  val c = (m / s).rebase(299792458, "c")
  val mph = miles / hour
}
