package day25exception;

public class E03 {

    public static void main(String[] args) {
        String str="ALI";
        getNumOfChars(str);  //3

        String s= "";
        getNumOfChars(s);  //0

        String t = null;
        getNumOfChars(t);    //NullPointerException
    }

    public static void getNumOfChars(String a){

        try{
            System.out.println(a.length());
        }catch(NullPointerException e){

            System.out.println("lengt() methodunda bir problem olustu==>"+ e.getMessage());

            e.printStackTrace();

            System.err.println("lengt() methodunda bir problem olustu");

        }

    }
}
