units
=====

Some fun with scala implicits (or abuse):

    sbt console

    scala> import units.suffixes._, units.constants._

    # How far is a lightyear?
    scala> c * year
    res1: units.Value = 9454254955488000.000000 m

    # How fast is the speed of light in mph?
    scala> c in mph
    res2: String = 670616629.384395 miles/h

    # How many weeks would it take to travel an astronomical unit going at 60 mph?
    scala> au / (60 mph) in weeks
    res3: String = 553308.376625 weeks

    # What is 10 stone in kg?
    scala> 10.stone in kg
    res4: String = 63.502932 kg


