def c = {}
println c.class //Closure

def sayHello = { name -> println "Hello $name" }

sayHello("mario")

["mario", "mauricio", "marcelo"].each(sayHello)

//closures are objects 
def timesTen(num, closure){
    closure(num*10)
}

timesTen(100, {println it})
//if closure is the last parameter we can pass it outside the ()
timesTen(100) {
    println it
}

3.times {
    println it
}
