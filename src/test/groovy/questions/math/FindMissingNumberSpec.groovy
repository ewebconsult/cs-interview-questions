package questions.math

import test.BaseSpec

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class FindMissingNumberSpec extends BaseSpec {

    def "test findMissing"() {
        expect:
        FindMissingNumber.findMissing(a as int[]) == b
        FindMissingNumber.findMissing2(a as int[]) == b

        where:
        a                               | b
        [1, 2, 0, 4, 5]                 | 3 // 0 is missing integer, keep array length
        [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] | 0
        [1, 2, 3, 4, 5, 6, 7, 8, 0, 10] | 9
    }
}