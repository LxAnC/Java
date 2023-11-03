public class Excersise1 {
    // 定义链表节点
    static class Node {
    int data;
    Excersise1.Node next;
    Node(int data) {
        this.data = data;
    }
}
    public static void main(String[] args) {
        int n = 500; // 总人数
        int m = 3;   // 数到m退出
        // 创建循环链表，表示500个人
        Node head = new Node(1);
        Node current = head;
        for (int i = 2; i <= n; i++) {
            current.next = new Node(i);
            current = current.next;
        }
        current.next = head; // 链表首尾相接形成循环
        // 开始数数并退出
        while (current.next != current) {
            // 数到m的前一个节点
            for (int i = 1; i < m - 1; i++) {
                current = current.next;
            }
            // 移除第m个节点
            current.next = current.next.next;
            current = current.next;
        }
        System.out.println("最后剩下的人是原来的第 " + current.data + " 个人。");
    }


}