import groovy.transform.Sortable
import groovy.transform.Canonical

@Canonical
@Sortable(includes=["firstName"])
class Person{
    String firstName
    String lastName
}

def team = [new Person(firstName:"Mario"),new Person(firstName:"John")]

println team.toSorted()
