//ranges

//java
for(int i = 0;i<=10;i++) print "$i "

//Range is an interface
Range r = 0..10 //0..<10 does not include 10

println r.class

println r.from
println r.to

assert(0..10).contains(0)
assert(0..10).contains(-1) == false 

Date today = new Date()
Date oneWeekAway = today + 7

println today
println oneWeekAway

Range days = today..oneWeekAway
println days

Range letters = 'a'..'z'
println letters.step(1)

//pass a clousure
(1..10).step(1, {print "$it "})
