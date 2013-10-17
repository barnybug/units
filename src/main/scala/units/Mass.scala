package units

trait Mass {
  val value: Double

  // mass
  val kg = Value(1.0, BaseUnits.mass, "kg") * value
  val g = kg.rebase(0.001, "g")
  val pounds = kg.rebase(0.45359237, "lb")
  val lb = pounds
  val pound = pounds
  val stones = kg.rebase(6.35029318, "st")
  val stone = stones
  val st = stones
}

