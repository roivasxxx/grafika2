package raster;

//import javafx.util.Pair;

import java.util.HashMap;
import java.util.List;

public class RasterDepthBuffer implements Raster<Double>{
//    private double[][] array;
//    private HashMap<Integer, Double>; //index pole, hodnota
//    private HashMap<Pair<Integer,Integer>, Double>;
//    private List<Double> list;
    private double[] array;
    private int width, height;

    public RasterDepthBuffer(int width, int height) {
        this.width = width;
        this.height = height;
        this.array = new double[width * height];
    }

    @Override
    public void setPixel(int x, int y, Double value) {
//        array[x][y] = value.doubleValue();
        if (checkOutOfBounds(x,y)) return;
        int idx = x + y*getWidth();
//        list.set(idx, value);
        array[idx] = value.doubleValue();
    }

    private boolean checkOutOfBounds(int x, int y) {
        return false; //TODO
    }

    @Override
    public Double getPixel(int x, int y) {
        //TODO
        return new Double(array[x+y*getWidth()]);
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void clear() {

    }
}
