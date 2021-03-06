//shorthand version of EqualsAndHashCode, ToString and TupleConstructor
@groovy.transform.Canonical
class Classmate {

    String firstName
    String last
    String email
}

Classmate c1 = new Classmate(firstName:"mario", last:"sousa")
Classmate c2 = new Classmate(firstName:"mario", last:"sousa")

println c1
println c2

assert c1 == c2
