@groovy.transform.ToString(includeNames=true, excludes=["email"])
class Person {

    String firstName
    String last
    String email
}

Person p = new Person(firstName:"mario", last:"sousa")
println p
