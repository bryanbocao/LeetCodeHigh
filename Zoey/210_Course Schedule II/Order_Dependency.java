import java.util.*;
//Order和OrderDependency都是照着面经猜测，应该是给好的class。
class Order{
    String order = "";
    public Order(String string){
        this.order = string;
    }
}
class OrderDependency{
    Order cur;
    Order pre;
    public OrderDependency(Order o1, Order o2){
        cur = o1;
        pre = o2;
    }
}
public class Order_Dependency {
    //这个参数可能是数组，这里先摆个容器，反正一个意思。
    public static List<Order> getOrderList(List<OrderDependency> orderDependencies){
        List<Order> result = new ArrayList<>();
        //建两个map,第一个是当前的order指向多少个order,就是先决条件
        Map<Order, ArrayList<Order>> map = new HashMap<>();
        //第二个是当前order被多少个order指,即为入度
        Map<Order, Integer> inMap = new HashMap<>();
        //把出现过的都记录下来
        Set<Order> set = new HashSet<>();
        for (OrderDependency od : orderDependencies){
            Order cur = od.cur;
            Order pre = od.pre;
            set.add(cur);
            set.add(pre);
            //有则加一,无则设1
            if (inMap.containsKey(cur)){
                int indegree = inMap.get(cur);
                inMap.put(cur, indegree+1);
            }
            else {
                inMap.put(cur, 1);
            }
            //这里入度也要把pre加上,因为最后要找线头,就是入度为0的点。
            if (!inMap.containsKey(pre)){
                inMap.put(pre, 0);
            }

            if (map.containsKey(pre)){
                map.get(pre).add(cur);
            }
            else {
                map.put(pre, new ArrayList<>());
                map.get(pre).add(cur);
            }
            //注意这里存的时候,map可以看成出度,出度为0也要存,或者在下面判断跳过null
            if (!map.containsKey(cur)){
                map.put(cur, new ArrayList<Order>());
            }
        }

        Queue<Order> queue = new LinkedList<>();
        int total = set.size();

        for (Order od : inMap.keySet()){
            if (inMap.get(od) == 0){
                queue.offer(od);
            }
        }
        //这里使用了BFS
        while (!queue.isEmpty()){
            Order order = queue.poll();
            result.add(order);
            for (Order odr : map.get(order)){
                //这里查入度,类比剥洋葱,如果剥到了0,说明是最外层。
                inMap.put(odr, inMap.get(odr) - 1);
                if (inMap.get(odr) == 0){
                    queue.offer(odr);
                }
            }
        }
        //这里如果有环的话,肯定是剥不出来的,那么set里面的个数和result里面的个数不一致。
        if (result.size() != total) return new ArrayList<Order>();
        return result;
    }
    //测试用例
    public static void main(String[] args) {
        Order o1 = new Order("A");
        Order o2 = new Order("B");
        Order o3 = new Order("C");
        Order o4 = new Order("D");
        OrderDependency od1 = new OrderDependency(o1, o2);
        OrderDependency od2 = new OrderDependency(o2, o3);
        //成环的情况就是把o4，改成o2，看看输出。
        OrderDependency od3 = new OrderDependency(o3, o4);
        List<OrderDependency> list = new ArrayList<>();
        list.add(od1);
        list.add(od2);
        list.add(od3);

        for (Order o : getOrderList(list)){
            System.out.println(o.order);
        }
    }
}
