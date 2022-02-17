package Solids;

import Solids.Solid;
import modul.Part;
import modul.Vertex;

import java.util.Arrays;
import java.util.List;

public class Cube extends Solid{
    public Cube(List<Vertex> vertices){
        super(vertices);
        List<Integer> ib = Arrays.asList(0,1,2);
        partBuffer.add(new Part(0,1));

    }
}