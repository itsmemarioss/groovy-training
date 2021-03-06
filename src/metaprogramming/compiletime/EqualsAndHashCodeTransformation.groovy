@groovy.transform.EqualsAndHashCode(excludes = ["breed"])
class Animal {

    String name
    String breed
}

Animal a1 = new Animal(name:"dog", breed:"dalmatian")
Animal a2 = new Animal(name:"cat")

assert a1 == a2
