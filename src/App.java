import raster.RasterDepthBuffer;

public class App {
    public static void main(String[] args) {
        new App();
        RasterDepthBuffer depthBuffer= new RasterDepthBuffer(600,600);
        depthBuffer.setPixel(20,20,0.5);
    }
}
