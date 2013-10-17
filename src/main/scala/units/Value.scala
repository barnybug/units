package units

case class Value(value: Double, unit: SI, suffix: String = "", base: Double = 1.0) {
  def +(b: Value) = copy(value + b.value)

  def -(b: Value) = copy(value - b.value)

  def *(b: Value) = copy(value * b.value, unit + b.unit, suffix + b.suffix, base * b.base)

  def /(b: Value) = copy(value / b.value, unit - b.unit, suffix + "/" + b.suffix, base / b.base)

  def +(b: Double) = copy(value + b)

  def -(b: Double) = copy(value - b)

  def *(b: Double) = copy(value * b)

  def /(b: Double) = copy(value / b)

  def in(b: Value) = copy(value / b.value * base / b.base, suffix = b.suffix, base = b.base)

  override def toString = "%f %s".format(value, suffix)

  def rebase(base: Double, s: String) = copy(unit = unit, suffix = s, base = this.base * base)
}
