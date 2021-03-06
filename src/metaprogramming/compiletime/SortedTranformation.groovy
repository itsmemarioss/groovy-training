import groovy.transform.Sortable
import groovy.transform.Canonical

@Canonical
@Sortable(includes=["firstName"])
class Employee{
    String firstName
    String lastName
}

def team = [new Employee(firstName:"Mario"),new Employee(firstName:"John")]

println team.toSorted()
