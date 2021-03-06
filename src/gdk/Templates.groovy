import groovy.text.*

def engine = new SimpleTemplateEngine()

/*
    $variable
    ${groovycode} evaluate and return
    <%= groovycode %>  evaluate and return
    <% groovycode %>  evaluate script
*/

String text = '''
Hi my name is $name and I'm from $country

Check my repositories:
<%
    repositories.each {it -> println "\t$it"}
%>
'''

Map bindings = [
        name: "mario",
        country: "brazil",
        repositories: ["groovy","java"]
]

println engine.createTemplate( text ).make( bindings )


