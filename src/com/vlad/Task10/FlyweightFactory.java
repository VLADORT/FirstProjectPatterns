package com.vlad.Task10;

import java.util.ArrayList;
import java.util.List;

public class FlyweightFactory {

   private  String[] breed = {"Chlorobi", "Chlamydiae", "Bacteroidetes"};

    private List<Bacteria> bacteria = new ArrayList<>();

    public FlyweightFactory() {
        for (String s:
                breed) {
            bacteria.add(new Bacteria(s));
        }
    }

    public Bacteria getBacteria(String form, String usage, String lethality ) {
        for (Bacteria bacteria : bacteria) {
            if (!bacteria.isActive()) {
                bacteria.setProperties( form,  usage, lethality);
                return bacteria;
            }
        }
        return null;
    }

}
