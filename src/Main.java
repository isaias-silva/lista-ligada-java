import com.node.Node;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {1, 4, 0, 10, 20, 50, 70, 11};
        List<Node> nodes = new ArrayList<>();

        for (int number : numbers) {
            Node<Integer> node = new Node<>(number);
            if (!nodes.isEmpty()) {
                Node nodeLast = nodes.get(nodes.size() - 1);
                node.setProxNode(nodeLast);

            }
            nodes.add(node);
        }


        boolean secondNotfound = false;
        int count = nodes.size()-1;

        while (!secondNotfound) {
            Node<Integer> nodeInit = nodes.get(count);
            Node<Integer> nodeLast = nodeInit.getProxNode();

            System.out.printf("nó atual --- %d\n", nodeInit.getContent());
            if(nodeLast==null){
                System.out.println("sem próximo nó");
                secondNotfound=true;
                return;
            }

            System.out.printf("próximo nó --- %d\n",nodeLast.getContent());

            count -= 1;
        }


    }
}