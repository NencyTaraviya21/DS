public class NodeCount {
    class Node{
        int data;
        Node link;

        public Node(int data){
            this.data= data;
            this.link = null;
        }
    }
    public Node first;

    public void count(){
        Node temp = first;
        int cnt = 1;

        while(temp.link != null){
            temp = temp.link;
            cnt++;
        }
        System.out.println("Total number of nodes present are: "+cnt);
    }
   
        public void addLast(int data){
            Node n2 = new Node(data);

            if(first == null){
                first = n2;
                return;
            }
            else{
                Node temp = first;

                while(temp.link != null){
                    temp = temp.link;
                }
                temp.link = n2;
                
            }
        }

    public static void main(String[] args) {
        NodeCount cn = new NodeCount();
        cn.addLast(0);
        cn.addLast(1);
        cn.addLast(2);
        cn.addLast(3);
        cn.addLast(4);
        cn.addLast(5);

        cn.count();
        
    }
}
