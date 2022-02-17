package Solids;

import modul.Part;
import modul.Vertex;

import java.util.List;

public abstract class Solid {
    protected List<Vertex> vertexBuffer;

    public List<Vertex> getVertexBuffer() {
        return vertexBuffer;
    }

    public List<Part> getPartBuffer() {
        return partBuffer;
    }

    protected List<Part> partBuffer;

    public Solid(List<Vertex> vertices){
        this.vertexBuffer =vertices;
    }

    @Override
    public String toString(){
        return "";
    }

}
