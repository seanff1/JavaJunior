package section6;

import java.util.ArrayList;
import java.util.Collections;

public class Lists {

    public static void main(String[] args) {

        ArrayList<String> places = new ArrayList<>();
        places.add("China");
        places.add("Amsterdam");
        places.add("Berling");

        int listSize = places.size();
        int amsertdamLocation = places.indexOf("Amsterdam");

        //1) Print list size
        System.out.println(listSize);

        //2) Iterate through list
        for(String s: places)
        {
            System.out.println(s);
        }

        //3) Getter for specfic item in list
        System.out.println(places.get(amsertdamLocation));

        //4) Sort list
        Collections.sort(places);
        System.out.println(places);
    }
}
