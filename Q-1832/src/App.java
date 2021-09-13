public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(check("thequickbrownfoxjumpsoverthelazydog")); 
    }

    static boolean check(String sentence){
        if(sentence.length() == 0)
            return false;
        for(int i=1; i<=26; i++){
            if(sentence.indexOf((char)i+96)<0)
                return false;
        }
        return true;
    }
}
