import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        Graph graph = new Graph();

        Vertex Eskildstrup = new Vertex("Eskildstrup");
        Vertex Haslev = new Vertex("Haslev");
        Vertex Holbæk = new Vertex("Holbæk");
        Vertex Jærgerspris = new Vertex("Jærgerspris");
        Vertex Kalundborg = new Vertex("Kalundborg");
        Vertex Korsør = new Vertex("Korsør");
        Vertex Køge = new Vertex("Køge");
        Vertex Maribo = new Vertex("Maribo");
        Vertex Næstved = new Vertex("Næstved");
        Vertex Ringsted = new Vertex("Ringsted");
        Vertex Slagelse = new Vertex("Slagelse");
        Vertex Nykøbing = new Vertex("Nykøbing F");
        Vertex Roskilde = new Vertex("Roskilde");
        Vertex Nakskov = new Vertex("Nakskov");
        Vertex Sorø = new Vertex("Sorø");
        Vertex Vordingborg = new Vertex("Vordingborg");

        Vertex[] temp = {Eskildstrup, Haslev, Holbæk, Jærgerspris, Kalundborg, Korsør, Køge, Maribo, Næstved, Ringsted, Slagelse, Nykøbing, Roskilde,
        Nakskov, Sorø, Vordingborg};

        for(Vertex a : temp){
            graph.addVertex(a);
        }

        graph.addVertex(Eskildstrup);
        graph.addVertex(Haslev);
        graph.addVertex(Holbæk);
        graph.addVertex(Jærgerspris);
        graph.addVertex(Kalundborg);
        graph.addVertex(Korsør);
        graph.addVertex(Køge);
/*
        A.addOutEdge(new Edge(A, B, 1));
        A.addOutEdge(new Edge(A, C, 5));
        A.addOutEdge(new Edge(A, E, 3));
        A.addOutEdge(new Edge(A, B, 1));
        A.addOutEdge(new Edge(A, B, 1));
        A.addOutEdge(new Edge(A, B, 1));
*/
    }
}
