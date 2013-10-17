package units

trait Mass {
  val value: Double

  // mass
  val kg = Value(1.0, BaseUnits.mass, "kg") * value
  val g = kg / 1000 suffix "g"
  val pounds = Value(0.45359237, BaseUnits.mass, "lb") * value
  val lb = pounds
  val pound = pounds
  val stones = Value(6.35029318, BaseUnits.mass, "st") * value
  val stone = stones
  val st = stones
}

