import groovy.transform.builder.Builder
import groovy.transform.Canonical

@Canonical
@Builder
class Person{
    String firstName
    String lastName
    String email
}

Person p = Person.builder()
    .firstName("Mario")
    .email("mario@itsmemario.com.br")
    .build()

println p
