package modul;
import transforms.Point3D;

public class Vertex implements Vectorizable{
    private Point3D point;
    public Vertex add(Vertex v){
        Vertex sum=new Vertex();
        return sum;
    }
    public Vertex mul(double scalar){
        Vertex mult=new Vertex();
        return mult;
    }

}
