package day18arraylistspassbyvalue;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    public static void main(String[] args) {

        //Bir Integer ArrayList"teki 7 haric tüm elemanlari iki arttiriniz.
        List<Integer> ages = new ArrayList<>();
        ages.add(12);
        ages.add(7);
        ages.add(21);
        ages.add(78);
        ages.add(9);

        for(Integer w: ages){

            if(w==7){
                continue;
            }
            // w= w+2; List ler bu sekilde update edilemezler yani degistirilemezler.
            ages.set(ages.indexOf(w), w+2);

        }
        System.out.println(ages);


        //Example 2: size verilen arraylistteki 8 ve 8 den onceki tum elemanlari iki katina cikariniz
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(7);
        nums.add(21);
        nums.add(8);
        nums.add(9);

        for(Integer w : nums){

            nums.set(nums.indexOf(w), w*2);
            if(w==8){
                break;
            }
        }
        System.out.println(nums);

    }
}
