public class App{
    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.insertAtEnd(1);
        myList.insertAtEnd(2);
        myList.insertAtBeginning(3);
        myList.display(); // Output: 3 1 2
    }
}