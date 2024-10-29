/*
  Encode and Decode based on level
  <Encode>
  input--> String: abc, Level: 1
  output--> bcd

  <Decode>
  input--> String: bcd, Level: 1
  output--> abc
 */
public class EncodeDecode {
    public static String encode(String s, int l){
        char[] arr = s.toCharArray();
        char[] letters = new char[26];
        int j = 0;
        for(char i='a';i<='z';i++){
            letters[j++]=i;
        }
        for(int i=0;i<arr.length;i++){
            char c = arr[i];
            arr[i] = letters[((c-97)+l)%26];
        }
        return new String(arr);
    }
    public static String decode(String s, int l){
        char[] arr = s.toCharArray();
        char[] letters = new char[26];
        int j = 0;
        for(char i='a';i<='z';i++){
            letters[j++]=i;
        }
        for(int i=0;i<arr.length;i++){
            char c = arr[i];
            int exp =((c-97)-l)%26;
            arr[i] = letters[exp>=0?exp:26+exp];
        }
        return new String(arr);
    }



    public static void main(String[] args) {
        System.err.println(decode("jkl",9));
    }
}
