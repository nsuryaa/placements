import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            if (!anagramGroups.containsKey(sortedStr)) {
                anagramGroups.put(sortedStr, new ArrayList<>());
            }

            anagramGroups.get(sortedStr).add(str);
        }

        return new ArrayList<>(anagramGroups.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        GroupAnagrams solution = new GroupAnagrams();
        List<List<String>> groupedAnagrams = solution.groupAnagrams(strs);

        for (List<String> group : groupedAnagrams) {
            System.out.println(group);
        }
    }
}

//Without sorting

    // public List<List<String>> groupAnagrams(String[] strs) {
    //     if (strs == null || strs.length == 0) return new ArrayList<>();
    //     Map<String, List<String>> map = new HashMap<>();
    //     for (String s : strs) {
    //         char[] ca = new char[26];
    //         for (char c : s.toCharArray()) ca[c - 'a']++;
    //         String keyStr = String.valueOf(ca);
    //         if (!map.containsKey(keyStr)) map.put(keyStr, new ArrayList<>());
    //         map.get(keyStr).add(s);
    //     }
    //     return new ArrayList<>(map.values());
    // }