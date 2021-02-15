//shorthand version of EqualsAndHashCode, ToString and TupleConstructor
@groovy.transform.Canonical
class Person {

    String firstName
    String last
    String email
}

Person p1 = new Person(firstName:"mario", last:"sousa")
Person p2 = new Person(firstName:"mario", last:"sousa")

println p1
println p2

assert p1 == p2
