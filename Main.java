public class Main {
    public static void main(String[] args) {
        String firstName = "Saja";
        String lastName = "AlBinAli";
        int age = 24;
        int amount = 100;
        boolean married = false;
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age );
        System.out.println(amount);
        System.out.println("is married:" +married);

        double amount2 = 30;
        String deposit = "Deposit";
        String withdraw = "Withdraw";
        System.out.println(" the amount is: " + amount2 + " KD ");
        System.out.println("Would you like to " + deposit + " or " + withdraw + " the amount?");

        int amount3 = 5;
        int sum = amount3+amount3;
        System.out.println(amount3 + " plus " + amount3 + " makes " + sum);

        String nameFull = "John doe";
        String firstName2 = nameFull.split("")[0].toUpperCase();
        String lastName2 = nameFull.split(" ")[1];
        int lastNameLength = lastName.length();
        System.out.println("My name is " + firstName + " and my last name length is " + lastNameLength);

        boolean startsWithD = lastName.startsWith("d");
        System.out.println(startsWithD);


    }
}
