package units

trait Time {
  val value: Double

  // time
  val seconds = Value(1.0, BaseUnits.time, "s") * value
  val second = seconds
  val s = seconds
  val minutes = seconds * 60 suffix "m"
  val minute = minutes
  val hours = minutes * 60 suffix "h"
  val hour = hours
  val days = (hours * 24).suffix("days")
  val day = days
  val weeks = days * 7 suffix "weeks"
  val week = weeks
  val years = days * 365 suffix "years"
  // ignoring leap years
  val year = years
}

