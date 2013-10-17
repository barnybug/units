package units

case class SI(K: Int, s: Int, m: Int, kg: Int) {
  def +(that: SI) = SI(K + that.K, s + that.s, m + that.m, kg + that.kg)

  def -(that: SI) = SI(K - that.K, s - that.s, m - that.m, kg - that.kg)

  val Superscripts = "⁰ⁱ²³⁴⁵⁶⁷⁸⁹"

  def superscript(n: Int): String =
    if (n == 0) ""
    else superscript(n / 10) + Superscripts.charAt(n % 10)

  def pow(sym: String, p: Int) = p match {
    case 0 => ""
    case 1 => sym
    case x if x > 0 => sym + superscript(p)
    case x if x < 0 => sym + "⁻" + superscript(-p)
  }

  override def toString =
    pow("K", K) + pow("m", m) + pow("kg", kg) + pow("s", s)
}
