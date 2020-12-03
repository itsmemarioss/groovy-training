/*
 scopes - owner, delegate, this
 
 this - correspond to the enclosing class where the closure is defined
 
 owner - correspond to the enclosing object where the clousure is defined, 
         which may be either a class or a closure
         
 delegate - correspond to a third party object where methods calls or properties are resolved 
            whenever the receiver of the message is not defined
*/
class ScopeDemo{

    def outerClosure = {
    
        println this.class.name
        println owner.class.name
        println delegate.class.name
        
        def nestedClosure = {
            println this.class.name
            println owner.class.name
            println delegate.class.name
        }
        
        nestedClosure()
    }
}

def demo = new ScopeDemo()
demo.outerClosure()


//---------- Delegates -----------------//

def writer = {
    append 'Mario'
    append 'lives in Lisbon'
}
StringBuffer sb = new StringBuffer()
writer.delegate = sb

def append(String s) { println "appending $s" }

writer() //uses append() from script

writer.resolveStrategy = Closure.DELEGATE_FIRST

writer()  //uses append() from StringBuffer
