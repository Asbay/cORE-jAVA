package maceraoyunu;

import java.util.Scanner;

public class ToolStore extends NormalLoc{

    public ToolStore(Player p1, String name) {
        super(name);
    }

    @Override
    boolean onLocation() {
        System.out.println("yapmak istediginiz islemi seciniz :"+ "\n1) SILAH ALIMI"+ "\n2) Zirh alimi"  );
        Scanner input = new Scanner(System.in);
        int secenek = input.nextInt();
        if(secenek != 1 || secenek != 2){
            System.out.println("Gecersiz islem girdiniz . Silah icin 1 veya Zirh icin 2 giriniz");
        }else if(secenek ==1){
            System.out.println("silah");
        }else {
            System.out.println("zirh");
        }
        return true;
    }

}
