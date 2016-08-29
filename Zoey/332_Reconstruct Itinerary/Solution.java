public class Solution {

    private HashMap<String,PriorityQueue<String>> flights;
    private LinkedList<String> path;

    public List<String> findItinerary(String[][] tickets) {
        flights = new HashMap<String,PriorityQueue<String>>();
        path = new LinkedList<>();
        for(String[] ticket:tickets){
            flights.putIfAbsent(ticket[0],new PriorityQueue<>());
            flights.get(ticket[0]).add(ticket[1]);
        }
        DFS("JFK");
        return path;
    }

    public void DFS(String departure){
        PriorityQueue<String> arrivals = flights.get(departure);
        while(arrivals!=null && !arrivals.isEmpty())
            DFS(arrivals.poll());
        path.addFirst(departure);
    }
}