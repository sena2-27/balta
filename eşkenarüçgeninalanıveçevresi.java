void main() {

    Scanner input = new Scanner(System.in);
    int yukseklik, kenaruz;

    System.out.println("Kenar uzunluğu giriniz: ");
    kenaruz = input.nextInt();
    System.out.println("Yüksekliği giriniz: ");
    yukseklik = input.nextInt();

    int cevre = kenaruz * 3;
    int alan = (yukseklik * kenaruz) /2;

    System.out.println("Eşkenar üçgenin çevresi: " + cevre);
    System.out.println("Eşkenar üçgenin alanı: " + alan);







}