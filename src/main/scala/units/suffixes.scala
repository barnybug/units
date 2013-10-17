package units

import scala.language.postfixOps
import scala.language.implicitConversions

/**
 * Implicit conversions. eg "20 km"
 */
object suffixes {
  class ImplicitValue(value: Double, unit: SI) extends Value(value, unit) with Units

  implicit def double2Unitless(d: Double) = new ImplicitValue(d, BaseUnits.unitless)
}
