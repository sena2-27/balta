

void main() {

    Scanner input = new Scanner(System.in);
    int vize, fina1;
    double ort;

    IO.println("Vize notunuzu giriniz: ");
    vize = input.nextInt();
    IO.println("Final noyunuzu giiriniz: ");
    fina1 = input.nextInt();

    ort = ((vize * 0.4) + (fina1 * 0.6));

    if (ort >= 75){
        IO.println("Barajı geçtiniz.");
    }
     else{
         IO.println("Barajı geçemediniz.");
    }





    
}