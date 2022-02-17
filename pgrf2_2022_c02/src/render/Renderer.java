package render;

import modul.Part;
import modul.Scene;
import Solids.Solid;

public class Renderer {

    void render(modul.Solid s ){


    }

    void renderSolid(Solid solid){
        for(Part p:solid.getPartBuffer()){

        }
    }
    void renderScene(Scene scene){
        for(modul.Solid s: scene.getSolids()){
                render(s);
        }
    }
}
