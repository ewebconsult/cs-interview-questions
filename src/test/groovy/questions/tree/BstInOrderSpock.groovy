package questions.tree

import api.TreeNode
import spock.lang.Specification

/**
 * @author <a href="mailto:jaredsburrows@gmail.com">Jared Burrows</a>
 */
class BstInOrderSpock extends Specification {

    def outContent = new ByteArrayOutputStream()
    def errContent = new ByteArrayOutputStream()
    def tree = new TreeNode<>(8)

//                (8)
//               /   \
//            (2)     (21)
//           /   \     /
//         (1)   (5) (13)
//               /
//             (3)
    def "setup"() {
        System.setOut(new PrintStream(outContent))
        System.setErr(new PrintStream(errContent))

        tree.right = new TreeNode<>(21)
        tree.right.left = new TreeNode<>(13)

        tree.left = new TreeNode<>(2)
        tree.left.left = new TreeNode<>(1)
        tree.left.right = new TreeNode<>(5)
        tree.left.right.left = new TreeNode<>(3)
    }

    def "cleanup"() {
        System.setOut(null)
        System.setErr(null)
    }

    def "constructor"() {
        expect:
        new BstInOrder() != null
    }

    def "printInOrder"() {
        when:
        BstInOrder.printInOrder(tree)

        then:
        outContent.toString().trim() == "1 2 3 5 8 13 21"
    }
}
