package atmproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {

    private int accountNumber;
    private int pinNumber;

    private double checkingBalance;   //vadesiz hesap bakiyesi
    private double savingBalance;    //vadeli hesap bakiyesi

    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");

    Scanner input =new Scanner(System.in);

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getPinNumber() {
        return pinNumber;
    }

    public void setPinNumber(int pinNumber) {
        this.pinNumber = pinNumber;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public void setCheckingBalance(double checkingBalance) {
        this.checkingBalance = checkingBalance;
    }

    public double getSavingBalance() {
        return savingBalance;
    }

    public void setSavingBalance(double savingBalance) {
        this.savingBalance = savingBalance;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    //para cekme  => paraCekmeIslemindenSonraKalanMiktar  amount : miktar
    private double calculateCheckingBalanceAfterWithdraw(double amount){

        checkingBalance = checkingBalance - amount;
        return checkingBalance;

    }

    private double calculateCheckingBalanceAfterDeposit(double amount){

        checkingBalance = checkingBalance + amount;
        return checkingBalance;

    }
    // para cekme saving hesabindan  para cekildikten sonra kalan bakiye
    private double calculateSavingBalanceAfterWithdraw(double amount){

        savingBalance = savingBalance - amount;
        return savingBalance;

    }

    //para yatirma: saving hesabina para yatir ve kalan bakiyeyi return et
    private double calculateSavingBalanceAfterDeposit(double amount){
        savingBalance = savingBalance + amount ;
        return savingBalance ;
    }

    //Müşteri ile para çekmek için etkileşime geçelim. checking account
    public void  getCheckingWithdraw(){

        System.out.println("Checking hesabinizda bulunan bakiye: "+ moneyFormat.format(checkingBalance));
        System.out.println("Cekmek istediginiz bakiyeyi giriniz...");
        double amount = input.nextDouble();

        if(amount<=0){
            System.out.println("Sifir veya eksi rakamlar gecersizdir...");
            getCheckingWithdraw();   //recursive method

        }else if (amount <= checkingBalance){
            calculateCheckingBalanceAfterWithdraw(amount);
            System.out.println("Checking hesabinizda bulunan bakiye: "+ moneyFormat.format(checkingBalance));
        }else {
            System.out.println("yetersiz bakiye");
        }
    }


    //para yatirma checking musteri ile para yatirmak icin etkilesime gecelim
    public void getCheckingDeposit(){
        System.out.println("Checking hesabinizda bulunan bakiye: "+ moneyFormat.format(checkingBalance));
        System.out.println("yatirmak istediginiz miktari giriniz");
        double amount = input.nextDouble();

        if(amount <= 0){
            System.out.println(" Sifir veya eski rakamlar gecersizdir...");
            getCheckingDeposit();
        }else {
            calculateCheckingBalanceAfterDeposit(amount);
            System.out.println();
            displayCurrentAmount(checkingBalance);
        }
    }

    //Müşteri ile para çekmek için etkileşime geçelim. saving hesap
    public void  getSavingWithdraw() {

        displayCurrentAmount(savingBalance);
        System.out.println("Cekmek istediginiz miktari giriniz...");
        double amount = input.nextDouble();

        if(amount <= 0){
            System.out.println("Sifir veya eksi rakamlar gecersizdir...");
            getSavingWithdraw();
        }else if(amount <= savingBalance){
            calculateSavingBalanceAfterWithdraw(amount);
            System.out.println();
            displayCurrentAmount(savingBalance);
        }else{
            System.out.println("Yetersiz Bakiye");
        }
    }

    //para yatirma (saving balance)müsteri ile para yatirmak icin etkilesime gecelim

    public void getSavingDeposit(){

        displayCurrentAmount(savingBalance);
        System.out.println("Yatirmak istediginiz miktari giriniz");
        double amount =  input.nextDouble();

        if(amount <= 0 ){
            System.out.println("Sifir veya eksi rakamlar gecersizdir!");
            getSavingDeposit();
        }else{
            calculateSavingBalanceAfterDeposit(amount);
            displayCurrentAmount(savingBalance);
        }

    }














    //son bakiyeyi göster
    public void displayCurrentAmount(double balance){
        System.out.println("Hesabinizda bulunan bakiye: "+ moneyFormat.format(balance));
    }
}
