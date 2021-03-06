import java.util.ArrayList;

public class Graph {
    private ArrayList<Vertex> vertices;

    public Graph() {
        vertices = new ArrayList<Vertex>();
    }

    public void addVertex(Vertex v) {
        vertices.add(v);
    }

    public void newEdge(Vertex from, Vertex to, Integer dist) {
        if (!(vertices.contains(from) && vertices.contains(to))) {
            System.out.println("Vertex not found!");
            return;
        }
        Edge newEdge = new Edge(from, to, dist);
        Edge reverseEdge = new Edge(to, from, dist);
    }

    public void prims() {

        MinHeap<Vertex> Q = new MinHeap<>();
        int j = 0;


        //The setup for the algorithm
        if (vertices.size() > 0) {
            vertices.get(0).setDistance(0);
        }
        for (int i = 0; i < vertices.size(); i++) {

            Q.Insert(vertices.get(i));

        }

        int MST = 0;
        //The algorithm
        while (!Q.isEmpty()) {

            Vertex minVertex = Q.extractMin();
            for (int i = 0; i < minVertex.getOutEdges().size(); i++) {

                if (minVertex.getOutEdges().get(i).getWeight() < minVertex.getOutEdges().get(i).getToVertex().getDistance()) {
                    minVertex.getOutEdges().get(i).getToVertex().setDistance(minVertex.getOutEdges().get(i).getWeight());
                    minVertex.getOutEdges().get(i).getToVertex().prev = minVertex;
                    int pos = Q.getPosition(minVertex.getOutEdges().get(i).getToVertex());
                    Q.decreasekey(pos);

                }
            }

            //Lappeløsning
            if (minVertex.getDistance() < Integer.MAX_VALUE) {
                MST = MST + minVertex.getDistance();
            }
        }
        System.out.println("MST Distance: " + MST + "km");
        System.out.println("Price is: " + MST * 100000 + "kr");
        for (int i = 0; i < vertices.size(); i++) {
            if (vertices.get(i).prev != null) {
                System.out.println(" Parent " + vertices.get(i).prev.getName() + " to " + vertices.get(i).getName() + " EdgeWeight: " + vertices.get(i).getDistance());
            }
        }
    }

    public void printGraph() {
        Vertex currentVertex;
        for (int i = 0; i < vertices.size(); i++) {
            currentVertex = vertices.get(i);
            System.out.println("Edges from Vertex: " + currentVertex.getName());

            for (int j = 0; j < currentVertex.getOutEdges().size(); j++) {
                Edge currentEdge = currentVertex.getOutEdges().get(j);
                System.out.println("To " + currentEdge.getToVertex().getName() + " weight " + currentEdge.getWeight());
            }
            System.out.println("");
        }
    }
}


class Vertex implements Comparable<Vertex> {
    private String Name;
    private ArrayList<Edge> outEdges;
    private Integer distance = Integer.MAX_VALUE;
    Vertex prev = null;

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

    public Vertex(String id) {
        this.Name = id;
        outEdges = new ArrayList<>();
    }

    public void addOutEdge(Edge outEdge) {
        outEdges.add(outEdge);
    }


    @Override
    public int compareTo(Vertex o) {
        if (this.distance < o.distance) {
            return -1;
        }
        if (this.distance > o.distance) {
            return 1;
        }
        return 0;
    }

    public Vertex getPrev() {
        return prev;
    }

    public void setPrev(Vertex prev) {
        this.prev = prev;
    }
}

class Edge {
    private Vertex fromVertex;
    private Vertex toVertex;
    private Integer weight;

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

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Edge(Vertex from, Vertex to, Integer cost) {
        fromVertex = from;
        toVertex = to;
        weight = cost;
    }
}