package LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        System.out.println("Current Size of the list is: "+list.getListSize());
        
        list.insertNode("test1");
        list.insertNode("test2");
        list.insertNode("test3");
        list.insertNode("test4");
        list.insertNode("test5");
        list.printNodes();
        
        System.out.println();
        
        System.out.println("Finding item test2 in the Linked list");
        list.findNode("test2");
        System.out.println("Finding item nonExist in the Lineked list");
        list.findNode("nonExist");
        
        System.out.println();
        
        System.out.println("Finding item at location 4");
        list.findNodeAt(4);
        
        System.out.println();
        System.out.println("Finding item at last location ");
        list.findLastNode();
        
        System.out.println();
        
        System.out.println("Current Size of the list is: "+list.getListSize());
        System.out.println("Adding test1st at start of the Node");
        list.insertFirst("test1st");
        list.printNodes();
        
        System.out.println();
        
        System.out.println("Current Size of the list is: "+list.getListSize());
        System.out.println("Adding testNth at 2nd Location");
        list.insertNth("testNth", 2);
        list.printNodes();
        
        System.out.println();
        
        System.out.println("Current Size of the list is: "+list.getListSize());
        System.out.println("Deleting first node");
        list.deleteFirstNode();
        list.printNodes();
        
        System.out.println();
        
        System.out.println("Current Size of the list is: "+list.getListSize());
        System.out.println("Deleting last node");
        list.deleteLastNode();
        list.printNodes();
        
        System.out.println();
        
        System.out.println("Current Size of the list is: "+list.getListSize());
        System.out.println("Deleting node from 4th location");
        list.deleteNthNode(4);
        list.printNodes();
    }
  
  }
