void main() {

    Scanner input = new Scanner(System.in);
    double a,b;

    System.out.println("1. sayıyı giriniz: ");
    a = input.nextInt();
    System.out.println("2. sayıyı giriniz: ");
    b = input.nextInt();

    double tsonuc = a + b;
    double csonuc = a - b;
    double casonuc = a * b;
    double bsonuc = a / b;
    System.out.println("Toplama sonucu: " + tsonuc);
    System.out.println("Çıkarma sonucu: "+ csonuc);
    System.out.println("Çarpma sonuu: "+ casonuc);
    System.out.println("Bölme sonucu: "+ bsonuc);


}
