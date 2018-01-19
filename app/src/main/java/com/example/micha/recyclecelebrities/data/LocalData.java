package com.example.micha.recyclecelebrities.data;

import com.example.micha.recyclecelebrities.R;
import com.example.micha.recyclecelebrities.model.Celebrity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by micha on 1/18/2018.
 */

public class LocalData {
    public static List<Celebrity> getCelebrity(){
        List<Celebrity> celeblist = new ArrayList<>();
        celeblist.add(new Celebrity("Tom Cruise", "53", "Male",Integer.toString(R.drawable.tom_cruise)));
        celeblist.add(new Celebrity("Jim Carrey", "57", "Male",Integer.toString(R.drawable.jim_carrey)));
        celeblist.add(new Celebrity("Bill Gates", "63", "Male",Integer.toString(R.drawable.bill_gates)));
        celeblist.add(new Celebrity("Jennifer Anniston", "53", "Female",Integer.toString(R.drawable.jennifer_aniston)));
        celeblist.add(new Celebrity("Kate Middleton", "30", "Female",Integer.toString(R.drawable.kate_middleton)));
        celeblist.add(new Celebrity("Liam Neeson", "65", "Male",Integer.toString(R.drawable.liam_neeson)));
        celeblist.add(new Celebrity("Will Smith", "49", "Male",Integer.toString(R.drawable.will_smith)));
        celeblist.add(new Celebrity("Dave Chappelle", "47", "Male",Integer.toString(R.drawable.dave_chappelle)));
        celeblist.add(new Celebrity("Samuel Jackson", "69", "Male",Integer.toString(R.drawable.samuel_jackson)));
        celeblist.add(new Celebrity("Taylor Swift", "28", "Female",Integer.toString(R.drawable.taylor_swift)));
        celeblist.add(new Celebrity("Dwane Johnson", "45", "Male",Integer.toString(R.drawable.dwane_johnson)));
        celeblist.add(new Celebrity("Denzel Washington", "63", "Male",Integer.toString(R.drawable.denzel_washington)));
        celeblist.add(new Celebrity("Steve Carell", "55", "Male",Integer.toString(R.drawable.steve_carell)));

        return celeblist;
    }
}
