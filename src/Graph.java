import java.util.ArrayList;
import java.util.Arrays;

public class Graph {
    private ArrayList<Vertex> vertices;

    public Graph(){
        vertices = new ArrayList<Vertex>();
    }

    public void addVertex(Vertex v){
        vertices.add(v);
    }

    public void newEdge(Vertex from, Vertex to, double dist){
        if (!(vertices.contains(from) && vertices.contains(to))){
            System.out.println("Vertex not found!");
            return;
        }
        Edge newEdge = new Edge(from, to, dist);
    }

    public void prims(){
        int[] distance = new int[vertices.size()];
        int[] prev = new int[vertices.size()];
        MinHeap<Pair> Q = new MinHeap<>();
        Arrays.fill(distance, Integer.MAX_VALUE);
        Arrays.fill(prev, -1);

        //The setup for the algorithm
        if(vertices.size() > 0){
            distance[0] = 0;
        }
        for(int i = 0; i < vertices.size(); i++){
            Q.Insert(new Pair(distance[i], i));
        }

        //The algorithm
        while(!Q.isEmpty()){
            Pair minVertexPair = Q.extractMin();
            for(int i = 0; i < vertices.size(); i++){
                if(vertices.get(minVertexPair.index)){

                }
            }
        }
    }

    public void printGraph(){
        Vertex currentVertex;
        for (int i = 0; i < vertices.size(); i++){
            currentVertex = vertices.get(i);
            System.out.println("Edges from Vertex: " + currentVertex.getName());

            for(int j = 0; j < currentVertex.getOutEdges().size(); j++){
                Edge currentEdge = currentVertex.getOutEdges().get(j);
                System.out.println("To " + currentEdge.getToVertex().getName() + " weight " + currentEdge.getWeight());
            }
            System.out.println("");
        }
    }
}


class Vertex implements Comparable<Vertex>{
    private String Name;
    private ArrayList<Edge> outEdges;
    private Integer distance = Integer.MAX_VALUE;
    //Vertex prev = null;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ArrayList<Edge> getOutEdges() {
        return outEdges;
    }

    public void setOutEdges(ArrayList<Edge> outEdges) {
        this.outEdges = outEdges;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Vertex(String id){
        this.Name = id;
        outEdges = new ArrayList<>();
    }

    public void addOutEdge(Edge outEdge){
        outEdges.add(outEdge);
    }


    @Override
    public int compareTo(Vertex o) {
        if (this.distance < o.distance){
            return -1;
        }
        if (this.distance > o.distance){
            return 1;
        }
        return 0;
    }
}

class Edge{
    private Vertex fromVertex;
    private Vertex toVertex;
    private double weight;

    public Vertex getFromVertex() {
        return fromVertex;
    }

    public void setFromVertex(Vertex fromVertex) {
        this.fromVertex = fromVertex;
    }

    public Vertex getToVertex() {
        return toVertex;
    }

    public void setToVertex(Vertex toVertex) {
        this.toVertex = toVertex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Edge(Vertex from, Vertex to, double cost){
        fromVertex = from;
        toVertex = to;
        weight = cost;
    }
}

class Pair implements Comparable<Pair>{
    Integer distance;
    Integer index;

    public Pair(Integer distance, Integer index) {
        this.distance = distance;
        this.index = index;
    }

    @Override
    public int compareTo(Pair o) {
        return this.distance.compareTo(o.distance);
    }
}