package raster;

import java.util.List;

public class RasterDepthBuffer implements Raster<Double>{
    private double[]array;
    private int width;
    //private List<Double> list;
    public RasterDepthBuffer(int height,int width){
        this.width=width;
        this.array=new double[height*width];
    }
    @Override
    public void setPixel(int x, int y, Double depth) {
        //array[x][y]=depth.doubleValue();
        int index = x+y*getWidth();
        array[index]=depth.doubleValue();
    }

    @Override
    public Double getPixel(int x, int y) {
        int index = x+y*getWidth();
        return new Double(array[index]);
    }

    @Override
    public int getWidth() {
        return this.width;
    }

}
