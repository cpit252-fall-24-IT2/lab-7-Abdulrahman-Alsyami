package sa.edu.kau.fcit.cpit252;

import java.util.Map;
import java.util.HashMap;

public class ImageElementsFactory {

    private Map<String, ImageElement> flyweights = new HashMap<String, ImageElement>();

    public ImageElement getFlyweight(String name) {
        if (flyweights.containsKey(name)) {
            return flyweights.get(name);
        }
        ImageElement imageElement = new ImageElement(name);
        flyweights.put(name, imageElement);
        return imageElement;
    }

    public int numberOfFlyweights() {
        return flyweights.size();
    }

}
