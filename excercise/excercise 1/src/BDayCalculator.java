public class BDayCalculator {
    public static void main(String[] args) {
        int heute = 23; // current day
        int monat = 10; // current month
        int omasGeb = 27; // grannys birthday is on 27
        int omasGebMonat = 10; // granny has her birthday in october

        // 2.1
        int daysUntilBirthday = omasGeb - heute;
        System.out.println("Oma hat in " + daysUntilBirthday + " Tagen Geburtstag.");

        // 2.2
        int myBirthDay = 25;
        int myBirthMonth = 10;
        int days = 28;
        int yearMonths = 12;
        int yearDays = days * yearMonths;

        if (myBirthMonth <= monat) {
            if (monat == myBirthMonth & heute == myBirthDay) {
                System.out.println("Mein Geburtstag ist Heute!");
            } else {
                if (myBirthDay < heute) {
                    daysUntilBirthday = (((yearMonths - monat) + myBirthMonth) * days) + myBirthDay;
                    System.out.println("Mein Geburtstag ist in " + daysUntilBirthday + " Tagen.");
                } else {
                    daysUntilBirthday = myBirthDay - heute;
                    if (daysUntilBirthday == 1) {
                        System.out.println("Mein Geburtstag ist Morgen.");
                    } else {
                        System.out.println("Mein Geburtstag ist in " + daysUntilBirthday + " Tagen.");
                    }
                }
            }
        } else {
            daysUntilBirthday = (((myBirthMonth - monat) * days) - heute) + (myBirthDay);
            System.out.println("Mein Geburtstag ist in " + daysUntilBirthday + " Tagen.");
        }

    }
}
