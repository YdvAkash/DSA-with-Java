public class linearSearchString {
    public static void main(String[] args) {
        String name = "Akash";
        char Target = 's';
        System.out.println(Search(name,Target));
    }
    static int Search(String name , char Target){
        if(name.length()==0){
            return -1;
        }
        for(int i=0; i<name.length();i++){
            if(Target == name.charAt(i)){
                return i;
            }
        }
        return -1;
    }
}
