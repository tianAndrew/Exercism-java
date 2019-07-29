import java.util.HashMap;
import java.util.Map;

class ResistorColor {
    HashMap<String,Integer> map = new HashMap<>();
    ResistorColor(){
        map.put("black",0);
        map.put("brown",1);
        map.put("red",2);
        map.put("orange",3);
        map.put("yellow",4);
        map.put("green",5);
        map.put("blue",6);
        map.put("violet",7);
        map.put("grey",8);
        map.put("white",9);

    }
    int colorCode(String color) {
        return map.get(color);
    }

    String[] colors() {
        String[] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        return colors;
    }

}
