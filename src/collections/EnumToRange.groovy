enum DaysOfWeek{
  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY
}

println DaysOfWeek.values()

//Create a range from an enum
Range days = DaysOfWeek.SUNDAY..DaysOfWeek.SATURDAY
println days.size()
println "from: $days.from"
println "to: $days.to"
assert days.contains(DaysOfWeek.WEDNESDAY)


println DaysOfWeek.SUNDAY.next()
