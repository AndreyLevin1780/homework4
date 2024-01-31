//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Задание N1");
        int age = 17;
        if (age>=18) {
        System.out.println("Если возраст человека равен " + age + " лет, то он совершеннолетний!");
        }
        else {
        System.out.println("Если возраст человека равен " + age + " лет, то ему необходимо дождаться совершеннолетия!");
        }

        System.out.println("");
        System.out.println("Задание N2");
        int curTemperature = 3;
        if (curTemperature <=5) {
            System.out.println("На улице " + curTemperature + "'C, нужно надеть шапку.");
        }
        else {
            System.out.println("На улице " + curTemperature + "'C, можно идти без шапки.");
        }

        System.out.println("");
        System.out.println("Задание N3");

        int curSpeed = 50;
        if (curSpeed >60) {
            System.out.println("Если скорость " + curSpeed + " км/ч, то придется заплатить штраф.");
        }
        else {
            System.out.println("Если скорость " + curSpeed + " км/ч, то можно ездить спокойно.");
        }

        System.out.println("");
        System.out.println("Задание N4");

        int currentAge=100;
        int minKindergartenAge = 2;
        int maxKindergartenAge = 6;
        int minSchoolAge = 7;
        int maxSchoolAge = 17;
        int minUniversityAge = 18;
        int maxUniversityAge = 24;
        int workingAge = 25;
        boolean isKindergartenAge = currentAge >= minKindergartenAge && currentAge <= maxKindergartenAge;
        if (isKindergartenAge) {
        System.out.println("Если возраст человека равен " + currentAge + ", то ему нужно ходить в детский сад.");
        }
        boolean isSchoolAge = currentAge >= minSchoolAge && currentAge <= maxSchoolAge;
        if (isSchoolAge) {
        System.out.println("Если возраст человека равен " + currentAge + ", то ему нужно ходить в школу.");
        }
        boolean isUniversityAge = currentAge >= minUniversityAge && currentAge <= maxUniversityAge;
        if (isUniversityAge) {
        System.out.println("Если возраст человека равен " + currentAge + ", то ему нужно ходить в университет.");
        }
        boolean isWorkingAge = currentAge >= workingAge;
        if (isWorkingAge) {
        System.out.println("Если возраст человека равен " + currentAge + ", то ему пора ходить на работу.");
        }

        System.out.println("");
        System.out.println("Задание N5");

        int childAge = 15;
        int restrictAge = 5;
        int adultAccompaniedAge = 14;
        boolean isRestrictAge = childAge < restrictAge;
        boolean isAdultAccompaniedAge = childAge >= restrictAge && childAge < adultAccompaniedAge;

        if (isRestrictAge) {
        System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе.");
        }
        else
        if (isAdultAccompaniedAge) {
        System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе только в сопровождении взрослого.");
        }
        else {
        System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

        System.out.println("");
        System.out.println("Задание N6");

        int totalTrainCarriageCapacity = 106;
        int numberOfSeats = 60;
        int numberOfOccupiedPlaces = 59;
        boolean IsSeatAvailable = numberOfOccupiedPlaces < numberOfSeats;
        boolean IsStandingAvailable = numberOfOccupiedPlaces >= numberOfSeats && numberOfOccupiedPlaces < totalTrainCarriageCapacity;

        if (IsSeatAvailable) {
        System.out.println("В вагоне есть свободные сидячие места.");
        }
        else
        if (IsStandingAvailable) {
        System.out.println("В вагоне есть только места для поездки стоя.");
        }
        else {
        System.out.println("В вагоне нет свободных мест.");
        }

        System.out.println("");
        System.out.println("Задание N7");

        int one = 2;
        int two = 5;
        int three = 10;
        boolean numberOneMax = one > two && one > three;
        boolean numberTwoMax = two > one && two > three;
        boolean numberThreeMax = three > one && three > two;

        if (numberOneMax) {
        System.out.println("Первое число больше.");
        }
        else {
        if (numberTwoMax) {
        System.out.println("Второе число больше.");
            }
        else {
        if (numberThreeMax) {
        System.out.println("Третье число больше.");
            }
        }
        }

    }
}