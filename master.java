 class master {
    public static void main(String[] args) {
        String fullName = "Rafał Gad";
        int studentCode = 51294;
        System.out.println(fullName + " " + studentCode);

        int a = 5;
        int b = 4;
        int suma = a + b;
        System.out.println( a + " + " + b + " = " + suma );

        int[] tablica = {1,5,4,2};
        
        int x = 0;
        for (int i = 0; i < tablica.length; i++) { 
            x += tablica[i];
        }
        int srednia = x/tablica.length;
        System.out.println("srednia wynosi: " + srednia);

        int number = 14;
        if (number % 2 == 0) {
            System.out.println("parzysta");
        } else {
            System.out.println("nieparzysta");
        }
        
    }
}
 