package com.example.micha.recyclecelebrities.data;

import com.example.micha.recyclecelebrities.model.Celebrity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by micha on 1/18/2018.
 */

public class LocalData {
    public static List<Celebrity> getCelebrity(){
        List<Celebrity> celeblist = new ArrayList<>();
        celeblist.add(new Celebrity("Tom Cruise", "53", "Male"));
        celeblist.add(new Celebrity("Jim Carrey", "57", "Male"));
        celeblist.add(new Celebrity("Bill Gates", "63", "Male"));
        celeblist.add(new Celebrity("Jennifer Anniston", "53", "Female"));
        celeblist.add(new Celebrity("Kate Middleton", "30", "Female"));
        celeblist.add(new Celebrity("Liam Neeson", "65", "Male"));
        celeblist.add(new Celebrity("Will Smith", "49", "Male"));
        celeblist.add(new Celebrity("Dave Chappelle", "47", "Male"));
        celeblist.add(new Celebrity("Samuel Jackson", "69", "Male"));
        celeblist.add(new Celebrity("Taylor Swift", "25", "Male"));
        celeblist.add(new Celebrity("Dwane Johnson", "45", "Male"));
        celeblist.add(new Celebrity("Denzel Washington", "63", "Male"));

        return celeblist;
    }
}
