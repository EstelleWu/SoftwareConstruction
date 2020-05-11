package com.company;

import java.util.ArrayList;
import java.util.List;

public class Branch extends Offshoot {

    List<Offshoot> kids;
//    String name;

    public Branch(String tree) {
        super(tree);
        kids = new ArrayList<>();
    }

    public void grow(Offshoot kid) {
        kids.add(kid);
    }

    @Override
    public void changeColor() {
        for(Offshoot kid: kids){
            kid.changeColor();
        }
    }
}
