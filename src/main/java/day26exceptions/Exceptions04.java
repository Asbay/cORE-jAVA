package day26exceptions;



public class Exceptions04 {

    public static void main(String[] args) {

       int age=250;
        try {
            printAge(age);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        }

    }

      // yas"i ekrana yazdiran bir kod yaziniz
    public static void printAge(int age){
        if(age<0 || age>200){
            throw new IllegalArgumentException("Yas negatif olamaz veya 200 den büyük olamaz");
        }
        System.out.println(age);

    }
}
