import groovy.time.TimeCategory

class StringCategory {
    static String shout(String str){
        str.toUpperCase()
    }
}

use(StringCategory){
    println "Hellow, world".shout()
}

use(TimeCategory){
    println 1.minute.from.now
    println 10.hours.ago
}
