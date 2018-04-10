package com.stringTests.maximumOccuringCharacter;

import java.util.List;

public class Storage {

    private class KeyValuePair {

    }


    /**
     * for string "ssss dddd a b"
     * letter = s;  count = 4,
     * letter = d; count = 4;
     * letter = a, count = 1;
     * letter = b; count = 1;
     */
    private List<KeyValuePair> storage;

    public Storage(String str) {
        this.storage = null; // transformation logic from the MaximumOccurringCharacter class
    }

    public List<Integer> getRatings() {
        // iterate through the storage and collect all counts
        return null; // => {4, 1}
    }

    /**
     * getByRating(4) => [s, d]
     * getByRating(1) => [a, b]
     * getByRating(2) => exception
     *
     * @param rating
     * @return
     */
    public char[] getByRating(int rating) {
        return null;
    }
}
