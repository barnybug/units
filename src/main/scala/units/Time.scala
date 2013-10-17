package units

trait Time {
  val value: Double

  // time
  val seconds = Value(1.0, BaseUnits.time, "s") * value
  val second = seconds
  val s = seconds
  val minutes = seconds.rebase(60, "m")
  val minute = minutes
  val hours = minutes.rebase(60, "h")
  val hour = hours
  val days = hours.rebase(24, "days")
  val day = days
  val weeks = days.rebase(7, "weeks")
  val week = weeks
  val years = days.rebase(365, "years")
  // ignoring leap years
  val year = years
}

