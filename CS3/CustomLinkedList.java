


 class IntNode {
   private int dataVal;         // Node data
   private IntNode nextNodePtr; // Reference to the next node

   public IntNode() {
      dataVal = 0;
      nextNodePtr = null;
   }

   // Constructor
   public IntNode(int dataInit) {
      this.dataVal = dataInit;
      this.nextNodePtr = null;
   }

   // Constructor
   public IntNode(int dataInit, IntNode nextLoc) {
      this.dataVal = dataInit;
      this.nextNodePtr = nextLoc;
   }

   /* Insert node after this node.
    Before: this -- next
    After:  this -- node -- next
    */
   public void insertAfter(IntNode nodeLoc) {
      IntNode tmpNext;

      tmpNext = this.nextNodePtr;
      this.nextNodePtr = nodeLoc;
      nodeLoc.nextNodePtr = tmpNext;
      return;
   }

   // Get location pointed by nextNodePtr
   public IntNode getNext() {
      return this.nextNodePtr;
   }

   public void printNodeData() {
      System.out.println(this.dataVal);
      return;
   }
}


 

public class CustomLinkedList {
   public static void main (String[] args) {
      IntNode headObj;  // Create intNode objects
      IntNode nodeObj1;
      IntNode nodeObj2;
      IntNode nodeObj3;
      IntNode currObj;

      // Front of nodes list
      headObj = new IntNode(-1); 
      
      // Insert more nodes
      nodeObj1 = new IntNode(555);
      headObj.insertAfter(nodeObj1);

      nodeObj2 = new IntNode(999);
      nodeObj1.insertAfter(nodeObj2);

      nodeObj3 = new IntNode(777);
      nodeObj1.insertAfter(nodeObj3);

      // Print linked list
      currObj = headObj;
      while (currObj != null) {
         currObj.printNodeData();
         currObj = currObj.getNext();
      }

      return;
   }
}


