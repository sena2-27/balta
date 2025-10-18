

void main() {

    Scanner input = new Scanner(System.in);
    String sifre, isim;

    IO.println("Adınızı giriniz: ");
    isim = input.nextLine();
    IO.println("Bir şifre belirleyiniz: ");
    sifre = input.nextLine();

    int karsilastirma;
    karsilastirma = (isim.compareToIgnoreCase(sifre));

    if ((karsilastirma == -6) || (karsilastirma < -6)) {
        IO.println("Şifreniz isminizi içeremez, lütfen daha güçlü bir şifre oluşturun.");
    }
      else{
         IO.println("Şifeniz oluşturulabilir.");
    }



}