@groovy.transform.ToString(includeNames=true, excludes=["email"])
class Roommate {

    String firstName
    String last
    String email
}

Roommate roommate = new Roommate(firstName:"mario", last:"sousa")
println roommate
