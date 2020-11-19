//string

//single code is also a string
def c = 's'
println c.class

//string interpolation
println "this is a string interpolation $c"

//multiline string

def longString = '''
    This is a long string with white spaces
    
    and some text at the end
'''

println longString

// dollar slashy avoids you to scape signs
def path = $/C:\groovy/$

//def path = "C:\\groovy" scaped character

println path
