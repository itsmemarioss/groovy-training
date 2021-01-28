
Expando e = new Expando()
e.name = "mario"
e.writeCode = { -> "$name writes code"}

//e.writeCode()

class Developer {
}

Developer mario = new Developer()
mario.metaClass //expando
mario.metaClass.name = "mario"
mario.metaClass.writeCode = { -> "$name writes code"}

println mario.writeCode()

String.metaClass.shout = {-> toUpperCase()}

println "Hello there".shout()
