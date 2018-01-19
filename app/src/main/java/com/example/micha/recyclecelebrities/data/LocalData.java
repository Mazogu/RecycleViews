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
        celeblist.add(new Celebrity("Tom Cruise", "53", "Male",Integer.toString(R.drawable.Tom_Cruise)));
        celeblist.add(new Celebrity("Jim Carrey", "57", "Male",Integer.toString(R.drawable.Jim_Carrey)));
        celeblist.add(new Celebrity("Bill Gates", "63", "Male",Integer.toString(R.drawable.Bill_Gates)));
        celeblist.add(new Celebrity("Jennifer Anniston", "53", "Female",Integer.toString(R.drawable.Jennifer_Aniston)));
        celeblist.add(new Celebrity("Kate Middleton", "30", "Female",Integer.toString(R.drawable.Kate_Middleton)));
        celeblist.add(new Celebrity("Liam Neeson", "65", "Male",Integer.toString(R.drawable.Liam_Neeson)));
        celeblist.add(new Celebrity("Will Smith", "49", "Male",Integer.toString(R.drawable.Will_Smith)));
        celeblist.add(new Celebrity("Dave Chappelle", "47", "Male",Integer.toString(R.drawable.Dave_Chappelle)));
        celeblist.add(new Celebrity("Samuel Jackson", "69", "Male",Integer.toString(R.drawable.Samuel_Jackson)));
        celeblist.add(new Celebrity("Taylor Swift", "28", "Female",Integer.toString(R.drawable.Taylor_Swift)));
        celeblist.add(new Celebrity("Dwane Johnson", "45", "Male",Integer.toString(R.drawable.Dwane_Johnson)));
        celeblist.add(new Celebrity("Denzel Washington", "63", "Male",Integer.toString(R.drawable.Denzel_Washington)));
        celeblist.add(new Celebrity("Steve Carell", "55", "Male",Integer.toString(R.drawable.steve_carell)));

        return celeblist;
    }
}
