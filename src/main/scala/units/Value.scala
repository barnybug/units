package units

case class Value(value: Double, unit: SI, suffix: String = "") {
  def +(b: Value) = copy(value + b.value)

  def -(b: Value) = copy(value - b.value)

  def *(b: Value) = copy(value * b.value, unit + b.unit, suffix + b.suffix)

  def /(b: Value) = copy(value / b.value, unit - b.unit, suffix + "/" + b.suffix)

  def +(b: Double) = copy(value + b)

  def -(b: Double) = copy(value - b)

  def *(b: Double) = copy(value * b, unit, suffix)

  def /(b: Double) = copy(value / b, unit, suffix)

  def in(b: Value) = "%f %s".format(value / b.value, b.suffix)

  override def toString = "%f %s".format(value, unit)

  def suffix(s: String) = copy(suffix = s)
}
