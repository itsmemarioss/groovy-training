// Exceptions

def foo(){ // no need to declare exceptions on method signature
    throw new Exception("exception message");
}

List log = []

try{
    foo()
}catch(Exception e){ // you can use multi catch exceptions
    log << e.message
}finally {
    log << 'finally'
}

println log
