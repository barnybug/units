package units

trait Energy {
  val value: Double

  // energy
  val joules = Value(1.0, SI(0, -2, 2, 1), "J") * value
  val joule = joules
  val J = joules
  val kcal = (J * 4.190).suffix("kcal")
}

