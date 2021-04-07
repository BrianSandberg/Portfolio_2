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


        Eskildstrup.addOutEdge(new Edge(Eskildstrup, Maribo, 28));
        Eskildstrup.addOutEdge(new Edge(Eskildstrup, Nykøbing, 13));
        Eskildstrup.addOutEdge(new Edge(Eskildstrup, Vordingborg, 24));
        Haslev.addOutEdge(new Edge(Haslev, Korsør, 60));
        Haslev.addOutEdge(new Edge(Haslev, Køge, 24));
        Haslev.addOutEdge(new Edge(Haslev, Næstved, 25));
        Haslev.addOutEdge(new Edge(Haslev, Ringsted, 19));
        Haslev.addOutEdge(new Edge(Haslev, Roskilde, 47));
        Haslev.addOutEdge(new Edge(Haslev, Slagelse, 38));
        Haslev.addOutEdge(new Edge(Haslev, Sorø, 34));
        Haslev.addOutEdge(new Edge(Haslev, Vordingborg, 40));
        Holbæk.addOutEdge(new Edge(Holbæk, Jærgerspris, 34));
        Holbæk.addOutEdge(new Edge(Holbæk, Kalundborg, 44));
        Holbæk.addOutEdge(new Edge(Holbæk, Korsør, 66));
        Holbæk.addOutEdge(new Edge(Holbæk, Ringsted, 36));
        Holbæk.addOutEdge(new Edge(Holbæk, Roskilde, 32));
        Holbæk.addOutEdge(new Edge(Holbæk, Slagelse, 46));
        Holbæk.addOutEdge(new Edge(Holbæk, Sorø, 34));
        Jærgerspris.addOutEdge(new Edge(Jærgerspris, Korsør, 95));
        Jærgerspris.addOutEdge(new Edge(Jærgerspris, Køge, 58));
        Jærgerspris.addOutEdge(new Edge(Jærgerspris, Ringsted, 56));
        Jærgerspris.addOutEdge(new Edge(Jærgerspris, Roskilde, 33));
        Jærgerspris.addOutEdge(new Edge(Jærgerspris, Slagelse, 74));
        Jærgerspris.addOutEdge(new Edge(Jærgerspris, Sorø, 63));
        Kalundborg.addOutEdge(new Edge(Kalundborg, Ringsted, 62));
        Kalundborg.addOutEdge(new Edge(Kalundborg, Roskilde,70));
        Kalundborg.addOutEdge(new Edge(Kalundborg, Slagelse, 39));
        Kalundborg.addOutEdge(new Edge(Kalundborg, Sorø, 51));
        Korsør.addOutEdge(new Edge(Korsør, Næstved, 45));
        Korsør.addOutEdge(new Edge(Korsør, Slagelse, 20));
        Køge.addOutEdge(new Edge(Køge, Næstved, 45));
        Køge.addOutEdge(new Edge(Køge, Ringsted, 28));
        Køge.addOutEdge(new Edge(Køge, Roskilde, 25));
        Køge.addOutEdge(new Edge(Køge, Vordingborg, 60));
        Maribo.addOutEdge(new Edge(Maribo, Nakskov, 27));
        Maribo.addOutEdge(new Edge(Maribo, Nykøbing,  26));
        Næstved.addOutEdge(new Edge(Næstved, Roskilde, 57));
        Næstved.addOutEdge(new Edge(Næstved, Ringsted, 26));
        Næstved.addOutEdge(new Edge(Næstved, Slagelse, 37));
        Næstved.addOutEdge(new Edge(Næstved, Sorø, 32));
        Næstved.addOutEdge(new Edge(Næstved, Vordingborg, 28));
        Ringsted.addOutEdge(new Edge(Ringsted, Roskilde, 31));
        Ringsted.addOutEdge(new Edge(Ringsted, Sorø, 15));
        Ringsted.addOutEdge(new Edge(Ringsted, Vordingborg, 58));
        Slagelse.addOutEdge(new Edge(Slagelse, Sorø, 14));

        //graph.printGraph();

        graph.prims();
    }


}
