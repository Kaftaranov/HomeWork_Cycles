public class Main {
    public static void main(String[] args) {
        //Задание №1
        short i = 1;
        while (i <= 10) {
    System.out.print(i+" ");
    i+=1;
        }
System.out.println();
for (i = 10; i >= 1; i--) {
    System.out.print(i+" ");
}
System.out.println();
System.out.println("------------------------------------");

        //Задание №2
//Пятница - 3 число.

    for (short Friday = 6; Friday <=31; Friday +=7) {
        if (Friday <= 31) {System.out.println("Today is Friday, "+Friday+"-th. Please prepare the report."); }
        }
        System.out.println("---------------------------------------");

        //Задание №3
    int CurrentYear = 2122;
        System.out.print("Last years of Halley Comet were: ");
    for (int CometYear = 0; CometYear <= CurrentYear + 100; CometYear += 79) {
        if (CometYear >= CurrentYear - 200 && CometYear < CurrentYear) {System.out.print(CometYear+"; ");}
        if (CometYear > CurrentYear) {System.out.println(); System.out.println("Next Halley Comet year is "+CometYear+".");}
    }
    }
}