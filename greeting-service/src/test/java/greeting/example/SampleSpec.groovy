package greeting.example

@MicronautTest
class SampleSpec extends Specification {

    private String response = null
     
    @Inject
    GreetingClient greetingClient

    void "sample test case"() {
        given:
        System.out.println("Given")

        when:
        System.out.println("When")
        response = greetingClient.greet("John").getContent()

        then:
        System.out.println("Then")
        assertEquals("Hola, John!", response)
    }
    
}
