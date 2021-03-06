package gdk

//def file = new File("test.txt")
//file.write("first text")
//file.append("more text")
//
//file.readLines().each {println it}

String dir = '../'
new File(dir).eachFileRecurse {
    if(it.isFile()){
        println it.name
    }
}