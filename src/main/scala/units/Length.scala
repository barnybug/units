package units

trait Length {
  val value: Double

  // length
  val metres = Value(1.0, BaseUnits.length, "m") * value
  val metre = metres
  val m = metres
  val km = metres.rebase(1000, "km")
  val foot = metres.rebase(0.3048, "ft")
  val feet = foot
  val ft = foot
  val miles = metres.rebase(1609.344, "miles")
  val mile = miles
  val lightyear = metres.rebase(9.4605284e15, "light years")
  val au = metres.rebase(149597870700.0, "au")
}

