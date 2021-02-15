@groovy.transform.EqualsAndHashCode(excludes = ["last"])
class Person {

    String firstName
    String last
    String email
}

Person p1 = new Person(firstName:"mario", last:"sousa")
Person p2 = new Person(firstName:"mario", last:"souza")

assert p1 == p2
