package day32maps;

public class Students {

    public String name;
    public String email;
    public int age;
    public boolean success;

    public Students(String name, String email, int age, boolean success) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.success = success;
    }
/*
Note: toString() method'u object'leri console'da detayları ile görebilmek için class'ların içinde oluşturulur.
      toString() method'unu oluşturmadan object'i console'a yazdırırsanız Java o object'in adresini yazdırır.
 */
    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", success=" + success +
                '}';
    }
}
