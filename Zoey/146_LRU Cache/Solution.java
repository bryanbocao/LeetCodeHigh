public class LRUCache {

    class DLinkedNode{
        int key;
        int value;
        DLinkedNode prev;
        DLinkedNode next;
    }

    private void addNode(DLinkedNode node){
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    private void removeNode(DLinkedNode node){
        DLinkedNode prev = node.prev;
        DLinkedNode next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    private void moveToHead(DLinkedNode node){
        this.removeNode(node);
        this.addNode(node);
    }

    private DLinkedNode popTail(){
        DLinkedNode res = tail.prev;
        this.removeNode(res);
        return res;
    }

    private HashMap<Integer,DLinkedNode> map = new HashMap<>();
    private int count;
    private DLinkedNode head;
    private DLinkedNode tail;
    private int capacity;

    public LRUCache(int capacity) {
        this.count = 0;
        this.capacity = capacity;
        head = new DLinkedNode();
        tail = new DLinkedNode();
        head.next=tail;
        tail.prev=head;
        head.prev=null;
        tail.next=null;
    }

    public int get(int key) {
        DLinkedNode node = map.get(key);
        if(node==null){
            return -1;
        }
        this.moveToHead(node);
        return node.value;
    }

    public void set(int key, int value) {
        DLinkedNode node = map.get(key);
        if(node==null){
            DLinkedNode newNode = new DLinkedNode();
            newNode.value=value;
            newNode.key=key;
            this.map.put(key,newNode);
            this.addNode(newNode);
            count++;
            if(count>capacity){
                DLinkedNode tail = this.popTail();
                this.map.remove(tail.key);
                count--;
            }
        }else{
            node.value=value;
            this.moveToHead(node);
        }
    }
}