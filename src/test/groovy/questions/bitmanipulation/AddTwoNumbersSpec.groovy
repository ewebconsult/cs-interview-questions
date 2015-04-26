package questions.bitmanipulation

import spock.lang.Specification

class AddTwoNumbersSpec extends Specification {

    def "getBinarySum"() {
        given:
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers()

        expect:
        addTwoNumbers.getBinarySumLib(a, b) == c
        addTwoNumbers.getBinarySum(a, b) == c
        addTwoNumbers.getBinarySumBit(a, b) == c

        where:
        a           || b           || c
        null        || null        || null
        "010101101" || null        || "010101101"
        null        || "010101101" || "010101101"
        "010101101" || "101011010" || "1000000111"
    }

}
