import groovy.json.JsonSlurper

def xml = '''
<sports>
    <sport>
        <name>football</name>
    </sport>
    <sport>
        <name>soccer</name>
    </sport>
</sports>'''

def sports = new XmlSlurper().parseText(xml)
println sports.sport[1].name

def jsonText = """
{   "books":[
        {
            "title":"book title 1"
        },
        {
            "title":"book title 2"
        }
    ]
}
"""

def slurper = new JsonSlurper()
def json = slurper.parseText(jsonText)
println json.books[0].title
