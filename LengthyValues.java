
    import java.util.HashMap;

    public class LengthyValues {
//creating map with adding values
        public static void main(String[] args) {
            HashMap<String, String> map = new HashMap<>();
            map.put("a", "aaa");
            map.put("b", "bbbb");
            map.put("c", "cake");
            System.out.println(mapAB4(map));

        }

        public static HashMap<String, String> mapAB4(HashMap<String, String> map) {
            if (map.containsKey("a") && map.containsKey("b")) {
                String aVal = map.get("a");
                String bVal = map.get("b");

                if (aVal.length() == bVal.length()) {
                    map.put("a", "");
                    map.put("b", "");
                } else if (aVal.length() > bVal.length()) {
                    map.put("c", aVal);
                } else {
                    map.put("c", bVal);
                }
            }
            return map;
        }
    }


