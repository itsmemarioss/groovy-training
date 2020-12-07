//groovy truth

def list = [1,2,3]
def emptyList = []

def isTrue(obj){
    if(obj) println "true"
    else  println "false"
}

isTrue(list)
isTrue(emptyList) //false
emptyList << 1
isTrue(emptyList) //true

//map
assert [1:'one']
assert ![:]
isTrue ([1:'one'])

//string
assert 'a'
assert !''

//number
assert 1
assert 3.5
assert -3
assert !0

//objects
assert new Object()
assert !null
