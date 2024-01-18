package com.palgogo.ex950_ex1000.ex981;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TimeMap {

    Map<String, TreeMap<Integer, String>> map;

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
            map.put(key, new TreeMap<>());
        }
        map.get(key).put(timestamp, value);
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) {
            return "";
        }
        TreeMap<Integer, String> treeMap = map.get(key);
        Integer result = treeMap.floorKey(timestamp);
        if (result == null) {
            return "";
        }
        return treeMap.get(result);
    }
}
