public class Main {
    public static void main(String[] args) throws Exception{
        List list = new List(1);
        list.add(2);
        list.add(3);
        list.addAtPosition(10,0);
        list.printList();
    }
}
