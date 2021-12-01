//Node Class I created to test all of my tree method implemenations.
package Node;
import java.util.*;

public class NodeClass {

      char val;
      int val2;
      NodeClass left;
      NodeClass right;




      public NodeClass() {

      }
      public NodeClass(NodeClass left, NodeClass right) {
        this.left = null;
        this.right = null;
      }
      public NodeClass(int val) {
        this.val2 = val;
        this.left = null;
        this.right = null;
      }
      public NodeClass(char val){
        this(val, null, null);
      }

      public NodeClass(char val, NodeClass left, NodeClass right) {
        this.val = val;
        this.left = left;
        this.right = right;

      }

		
	
}
