import groovy.xml.MarkupBuilder

MarkupBuilder builder = new MarkupBuilder()
builder.omitNullAttributes = true

//xml
builder.sports {
    sport(id:1){
        name 'Baseball'
    }
    sport(id:2){
        name 'Football'
    }
    sport(id:null){
        name ''
    }    
}

//html
def languages = [
    [id:1, name:"java"],
    [id:2, name:"typescript"],
    [id:3, name:"groovy"]
]

println "html page"
builder.html {
    head {
        title "About me"
    }
    body {
        h1 "Programming languages"
        table {
            tr {
                th "id"
                th "name"
            }
            languages.each { lang ->
                tr {
                    td lang.id
                    td lang.name
                }
            }
        }
    }
}

/*
<html>
  <head>
    <title>About me</title>
  </head>
  <body>
    <h1>Programming languages</h1>
    <table>
      <tr>
        <th>id</th>
        <th>name</th>
      </tr>
      <tr>
        <td>1</td>
        <td>java</td>
      </tr>
      <tr>
        <td>2</td>
        <td>typescript</td>
      </tr>
      <tr>
        <td>3</td>
        <td>groovy</td>
      </tr>
    </table>
  </body>
</html>
*/
