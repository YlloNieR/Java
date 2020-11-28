public class BDayCalculator {
    public static void main(String[] args) {
        int today = 23; // current day
        int month = 10; // current month
        int grannysBirthdayDay = 27; // grannys birthday is on 27
        int grannysBirthdayMonth = 10; // granny has her birthday in october

        // 2.1
        int daysUntilBirthday = grannysBirthdayDay - today;
        System.out.println("Oma hat in " + daysUntilBirthday + " Tagen Geburtstag.");

        // 2.2
        int myBirthdayDay = 1;
        int myBirthdayMonth = 12;
        int days = 28;
        int yearMonths = 12;

        if (myBirthdayMonth <= month) {
            if (month == myBirthdayMonth & today == myBirthdayDay) {
                System.out.println("Mein Geburtstag ist Heute!");
            } else {
                if (myBirthdayDay < today) {
                    daysUntilBirthday = (((yearMonths - month) + myBirthdayMonth) * days) + myBirthdayDay;
                    System.out.println("Mein Geburtstag ist in " + daysUntilBirthday + " Tagen.");
                } else {
                    daysUntilBirthday = myBirthdayDay - today;
                    if (daysUntilBirthday == 1) {
                        System.out.println("Mein Geburtstag ist Morgen.");
                    } else {
                        System.out.println("Mein Geburtstag ist in " + daysUntilBirthday + " Tagen.");
                    }
                }
            }
        } else {
            daysUntilBirthday = (((myBirthdayMonth - month) * days) - today) + myBirthdayDay;
            System.out.println("Mein Geburtstag ist in " + daysUntilBirthday + " Tagen.");
        }
    }
}
