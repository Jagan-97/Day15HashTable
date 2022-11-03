public class HashTableUC3 {
    static void remove(String str,String word) {
        String msg[] = str.split(" ");
        String new_str = "";
        for (String words : msg) {
            if (!words.equals(word)) {
                new_str += words + " ";
            }
        }
        System.out.println(new_str);
    }
    public static void main(String[] args) {
        String str =  "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String word = "avoidable";
        remove(str,word);
    }
}