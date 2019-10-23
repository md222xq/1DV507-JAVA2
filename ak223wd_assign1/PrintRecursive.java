package ak223wd_assign1;

public class PrintRecursive {
    public static void main(String[] args){
        String str = "Hello World!";
        print(str,0);
        System.out.println();
        printreverse(str,0);



    }

    private static void print(String str, int pos ) throws IndexOutOfBoundsException {
        if(pos<0 || pos>str.length()){
            throw new IndexOutOfBoundsException("Position has to be within str length!");
        } else if (pos == str.length()){

        } else{
            System.out.print(str.charAt(pos));
            print(str,pos+1);
        }
    }

    private static void printreverse(String str, int pos) throws IndexOutOfBoundsException{
        if(pos<0 || pos>str.length()){
            throw new IndexOutOfBoundsException("Position has to be within str length!");
        } else if(pos == str.length()){

        }
        else{
            System.out.print(str.charAt(str.length()-1-pos));
            printreverse(str,pos+1);
        }
    }
}