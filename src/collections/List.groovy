List nums = [1,2,3,4,5]
println nums

nums.push(99)
nums.putAt(0, 77)
nums[0] = 78

//adding elements
nums + 7
nums << 66

//removing elements
nums.pop()
println nums

def newList = nums - 2 //remove all 2 from list
println newList

println nums.getAt(0..2)

nums = [] //empty list
nums.clear()

//for in with collections
for(x in newList) println x

nums << 1
nums << [3,4]
println nums
assert [1,3,4] == nums.flatten()

newList.unique()

def numbers = [1,2,3,3,3,3,4] as Set
println numbers