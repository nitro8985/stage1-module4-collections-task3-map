package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {

        Map<String, Integer> resultMap = new HashMap<>();

        StringTokenizer st = new StringTokenizer(sentence, " ,.");
        while (st.hasMoreTokens()) {
            String str = st.nextToken().toLowerCase();
            if (!resultMap.containsKey(str)) {
                resultMap.put(str, 1);
            } else {
                resultMap.replace(str, resultMap.get(str) + 1);
            }
        }
        return resultMap;
    }
}
