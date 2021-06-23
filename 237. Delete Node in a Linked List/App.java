public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

}

class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
