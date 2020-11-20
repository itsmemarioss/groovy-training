// Java
import java.util.regex.*

Pattern pattern = Pattern.compile("a\\\\b")
println pattern.class

String slashy = /a\b/
String url = $/http://itsmemario.com.br/$

println url

def groovyPattern = ~/a\b/
println groovyPattern.class

def text = "Corinthians is the best team in the world"
def regex = ~/Corinthians/
def finder = text =~ regex
def matcher = text ==~ regex

println finder
println finder.size()
println matcher

finder = "Corinthians" =~ regex
matcher = "Corinthians" ==~ regex

println finder
println finder.size()
println matcher
