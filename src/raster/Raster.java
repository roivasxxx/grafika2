package raster;

//ctrl alt l - code format
//public class RasterBuffer implements Raster<Integer>
public interface Raster<T> {
    void setPixel(int x, int y, T depth);

    T getPixel(int x, int y);

    int getWidth();


}
