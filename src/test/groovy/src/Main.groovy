// AdditionSpec.groovy

import com.syngenta.MathOperation
import com.syngenta.add


class AdditionSpec extends MathOperation {
    def "add method should return the correct sum"() {
        given:
        def addition = new add(3,5)

        when:
        def result = addition.add(3, 5)

        then:
        result == 8
    }
    def "add method should handle negative numbers correctly"() {
        given:
        def addition = new add()

        when:
        def result = addition.add(-2, 7)

        then:
        result == 5
    }
}