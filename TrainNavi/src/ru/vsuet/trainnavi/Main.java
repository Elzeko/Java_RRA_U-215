package ru.vsuet.trainnavi;

import ru.vsuet.trainnavi.dommain.Way;

public class Main {
    public static  void main(String[] args){
        Way way = new Way();
        way.setName("way1");
        System.out.println(way.getName());

        Way spoint = new Way();
        spoint.setNames("Lublino");
        System.out.println(spoint.getNames());

        Way fpoint = new Way();
        fpoint.setNamef("Poberezhe");
        System.out.println(fpoint.getNamef());

        Way ipoint = new Way();
        ipoint.setNamei("Aptechnaya");
        System.out.println(ipoint.getNamei());
    }
}
