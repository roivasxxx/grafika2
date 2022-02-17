import raster.RasterDepthBuffer;
import raster.Visibility;

public class App {
    public static void main(String[] args) {
        new App();
        RasterDepthBuffer rDB = new RasterDepthBuffer(1000, 1000);
        rDB.setPixel(10,10,0.5);
        rDB.setPixel(10,10,0.7);
        System.out.println(rDB.getPixel(10,10));
        rDB.setPixel(15,15,0.3);
        System.out.println(rDB.getPixel(100,100));

        Visibility vis = new Visibility();
        vis.drawVisiblePixel(20,20,0.5, 0xff);
        System.out.println(vis.getColorOfVisiblePixel(20,20));
        vis.drawVisiblePixel(20,20,0.7, 0xffff);
        System.out.println(vis.getColorOfVisiblePixel(20,20));
    }
}
