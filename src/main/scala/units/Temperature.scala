package units

trait Temperature {
  val value: Double

  val kelvin = Value(1.0, BaseUnits.temperature, "K") * value
  def C = kelvin * (value + 273.15)
  def F = kelvin * ((value - 32) / 1.8 + 273.15)
}
