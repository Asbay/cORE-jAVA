package atmproject;

import java.util.Scanner;

public class Options extends Account {


    Scanner input = new Scanner(System.in);


    //Checking hesap islemleri
    public void checkingOperations() {

        do{
            System.out.println("Option seciniz !");
            System.out.println("1 : View Balance / Hesap Özeti");
            System.out.println("2: Withdraw / para cekme");
            System.out.println("3: Deposit / para yatirma");
            System.out.println("4. Exit / Islemi sonlandir");

            int option = input.nextInt();

            if (option == 4) {
                break;
            }

            switch(option){
                case 1:
                    System.out.println("Checking hesabinizda kalan bakiye: "+ moneyFormat.format(getCheckingBalance()));
                    break;
                case 2:
                    getCheckingWithdraw();
                    break;
                case 3:
                    getCheckingDeposit();
                    break;
                default:
                    System.out.println("Yanlis secenek!Lutfen 1,2,3 veya 4 ü kullaniniz.");
            }

        }while(true);

    }

    //saving ->vadesiz hesap islemleri
    public void savingOperations (){
        do{
            displayMessage();
            int option = input.nextInt();
            if (option==4){
                break;
            }
            switch (option){
                case 1:
                    System.out.println("Saving hesabinizda kalan bakiye :" + moneyFormat.format(getSavingBalance()));
                    break;
                case 2:
                    getSavingWithdraw();
                    break;
                case 3:
                    getSavingDeposit();
                    break;
                default:
                    System.out.println("yanlis secenek ! lutfen 1,2,3 veya 4'u kullaniniz");
            }

        }while (true);
        getAccountTypes();
    }
    //__________________________________________________________________________________________________________
    //ilgili hesabi seciniz
    public void getAccountTypes(){
        System.out.println("Islem yapmak istediginiz hesabi seciniz");
        System.out.println("1:Checking account");//vadesiz hesap
        System.out.println("2:Saving account");//vadeli hesap
        System.out.println("3:Exint");
        int option = input.nextInt();
        switch (option){
            case 1:
                System.out.println("Checking hesabinizdasiniz");
                checkingOperations();
                break;
            case 2:
                System.out.println("Saving hesabinizdasiniz");
                savingOperations();
            case 3:
                System.out.println("ATM makinamizi kullandiginiz icin tesekkur ederiz");
                boolean flag = false;
                break;
            default:
                System.out.println("yanlis secenek lutfen 1,2 veya 3'u kullaniniz");

        }
    }
    //_______________________________________________________________________________________________________________
    //kisi icin secenekleri goruntule
    public void displayMessage(){
        System.out.println("Opsion seciniz!");
        System.out.println("1:View Balance"); //bakiyenizi goruntuleyiniz
        System.out.println("2:Withdraw");//para cekme
        System.out.println("3:Deposit");//para yatirma
        System.out.println("4:Exit");//islemi sonlandirma
    }
}


