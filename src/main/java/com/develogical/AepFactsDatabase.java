package com.develogical;

import java.util.HashMap;
import java.util.Map;

public class AepFactsDatabase {

    private final Map<String, MiniBiog> data;

    public AepFactsDatabase() {
        data = new HashMap<String, MiniBiog>();
        data.put("jim", new MiniBiog("Jim is a DPhil candidate at Oxford University, he likes programming in Go and in Lua.", "https://lh3.googleusercontent.com/-k5kuysabs78/AAAAAAAAAAI/AAAAAAAAWdc/jPsR9cFKm88/s200-c-k/photo.jpg"));
        data.put("robert", new MiniBiog("Robert teaches the AEP course, he likes classical music and bicycles.", "http://chatley.com/portrait-smaller.jpg"));
        data.put("eamonn", new MiniBiog("Eamonn is a DPhil candidate at Oxford University. I work on scientific data visualization and bioinformatics", "http://www.cs.ox.ac.uk/files/4256//maguire.eamonn.gif"));
        data.put("nigel", new MiniBiog("Nigel is a student on the AEP course", "http://photos.geni.com/p6/3608/5193/53444836a0c8951c/Copy_of_131_3192_medium.jpg"));
        data.put("colin", new MiniBiog("Colin doesn't do much these days and likes post rock music and cider.", "http://profile.ak.fbcdn.net/hprofile-ak-snc4/203393_585632745_7365858_q.jpg"));
        data.put("deb", new MiniBiog("Deb works as a Front Office developer in Royal Bank of scotland. He likes music, cricket and loves to work with new technologies.", ""));
    }

    public MiniBiog lookup(String name) {
        return data.get(name.toLowerCase());
    }

    public static class MiniBiog {

        private final String text;
        private final String imageUrl;

        public MiniBiog(String text, String imageUrl) {
            this.text = text;
            this.imageUrl = imageUrl;
        }

        public String imageUrl() {
            return imageUrl;
        }

        public String text() {
            return text;
        }
    }
}
