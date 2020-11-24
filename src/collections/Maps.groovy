//Map

def map = [:]
println map.getClass().getName()//LinkedHashMap
//map.class does no work since map will look for a key called 'class'

def person = [name: "mario", email:"mario@itsmemario.com.br"]
println person.name

person.twitter = "@itsmemarioss"
println person

def key = "keyName"
def newMap = [(key):"value"]
println newMap

//looping through
for(entry in person){
    println entry
}

for (k in person.keySet()){
    println "$k:${person[k]}"
}
