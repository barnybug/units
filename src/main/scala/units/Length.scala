package units

trait Length {
  val value: Double

  // length
  val metres = Value(1.0, BaseUnits.length, "m") * value
  val metre = metres
  val m = metres
  val km = metres * 1000 suffix "km"
  val foot = Value(0.3048, BaseUnits.length, "ft") * value
  val feet = foot
  val ft = foot
  val miles = Value(1609.344, BaseUnits.length, "miles") * value
  val mile = miles
  val lightyear = m * 9.4605284e15 suffix "light years"
  val au = m * 149597870700.0 suffix "au"
}

