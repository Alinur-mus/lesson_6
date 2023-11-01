// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

//        6 Lesson
//        1 Тапсырма
//       int x = 16;
//       int y = 10;
//
//       if( x==16) {
//           System.out.println("x is 16");
//       }
//       if( y != 11){
//           System.out.println("y is not 11");
//       }
//        1 Есеп
//int a = 19;
//if( a>=18){
//    System.out.println("Автокөлік жүргізушісі куәлігін алуға өтініш бере алады");
//}
//// 2 есеп
//        int baqa = 4;
//if(baqa>2){
//    System.out.println("Келесі cыныпқа өтуге болады");
//}
//// 2 Тапсырма
//int x = 16;
//int y = 10;
//if(x>y){
//    System.out.println(x+" is bigger than "+y);
//}else
//    System.out.println(y+" is bigger than "+x);
////3 есеп
//        int san_1 = 54;
//        int san_2 = 16;
//        if(san_1<san_2){
//            System.out.println(san_1+" киши "+san_2);
//        }else
//            System.out.println(san_2+" киши "+san_1);
//3 Тапсырма
        int number = 1;

        if (number == 1) {
            System.out.println("One");
        } else if (number == 2) {
            System.out.println("Two");
        } else if (number == 3) {
            System.out.println("Three");
        } else if (number == 4) {
            System.out.println("Four");
        } else {
            System.out.println("Invalid number!");
        }
//4 Есеп
        int kurs = 3;

        if (kurs == 1) {
            System.out.println("Логика \n" + "Алгебра \n" + "Статистика \n" + "Социология\n" + "Введение в специальность \n" + "Основы менеджмента \n" + "Основы маркетинга \n");
        } else if (kurs == 2) {
            System.out.println("Основы теории коммуникаций \n" + "Управление интегрированными коммуникациями \n" + "Медиапланирование \n" + "Социология массовых коммуникаций \n" + "Психология массовых коммуникаций \n" + "Управление коммуникационными проектами \n");
        } else if (kurs == 3) {
            System.out.println("Интеллектуальный анализ данных \n" + "Обработка и анализ данных \n" + "Прикладная и сетевая аналитика \n" + "Прикладной статистический анализ\n" + "Прикладной статистический анализ \n");
        } else if (kurs == 4) {
            System.out.println("Проектная и исследовательская работа");
        } else {
            System.out.println("Try again");
        }
//4 Тапсырма
        char arip = 'A';
        int number1 = 25;

        if (arip == 'A' || arip == 'a') {
            System.out.println("Charaacter A ");
        }
        if (arip == 'A' && number1 == 26) {
            System.out.println("Character A and number 25");
        } else {
            System.out.println("number is not 25");
        }
//5 есеп
        char bukva1 = 'n';
        char bukva2 = 'm';
        char simvol1 = '+';
        char simvol2 = '-';
        char simvol3 = '*';
        char simvol4 = '/';
        if (simvol1 =='+'){
            System.out.println(bukva1+bukva2);
        }
        if (simvol2=='-'){
            System.out.println(bukva1-bukva2);
        }
        if (simvol3=='*'){
            System.out.println(bukva1*bukva2);
        }
        if (simvol4=='/' && bukva2>0){
            System.out.println(bukva1/bukva2);
        }else {
            System.out.println("Санды нолге болуге болмайды");
        }
//5 Тапсырма
        int marks = 65;
        if(marks<50){
            System.out.println("fail");
        }else if(marks>=50 && marks<60){
            System.out.println("D grade");
        } else if (marks>=60 && marks<70) {
            System.out.println("C grade");
        } else if (marks>=70 && marks<80) {
            System.out.println("B grade");
        } else if (marks>=80 && marks<100) {
            System.out.println("A grade");
        }else {
            System.out.println("Invalid!");
        }
//6 Есеп
        int prothent = 68;
        if (prothent<=85 && prothent>=100){
            System.out.println("Mark 5");
        } else if (prothent<=70 && prothent>=84) {
            System.out.println("Mark 4");
        } else if (prothent<=50 && prothent>=69) {
            System.out.println("Maerk 3");
        }else if (prothent<=0 && prothent>=49){
            System.out.println("Mark 2");
        }else{
            System.out.println("Invalid");
        }
//6 task
        char group = 'A';
        double studentAvePoint = 70.5;
        if (group=='A'){
            if (studentAvePoint<50){
                System.out.println("group average less than 50");
            } else if (studentAvePoint>50 && studentAvePoint<=75) {
                System.out.println("group average between 50 and 75");
            } else if (studentAvePoint>75 && studentAvePoint<=100) {
                System.out.println("group average between 75 and 100");
            }else{
                System.out.println("invalid average number");
            }
        }else{
            System.out.println("Try again");
        }
//есеп 7
        char i = 'I';
        char e = 'E';
        char f = 'F';
        int i1 = 15;
        int i2 = 25;
        int i3 = 34;
        int e1 = 31;
        int e2 = 21;
        int e3 = 16;
        int f1 = 14;
        int f2 = 16;
        int f3 = 14;
        if (i=='I'){
            if (i1==15 && i2==25 && i3==34){
                System.out.println("1I тобында: "+i1+"\n"+"2I тобында: "+i2+"\n"+"3I тобында: "+i3);

            }
            if(i2==25){
                System.out.println("2I тобында: "+i2);
            }
            if (i3==34) {
                System.out.println("3I тобында: "+i3);


            }

        }
        if (e=='E') {
            if(e1==31){
                System.out.println("1E тобында: "+e1);
            }
            if (e2==21) {
                System.out.println("2E тобында: "+e2);
            }
            if(e3==16){
                System.out.println("3E тобында: "+e3);
            }
        }
        if (f=='F') {
            if (f1==14){
                System.out.println("1F тобында: "+f1);
            }
            if (f2==16) {
                System.out.println("2F тобында: "+f2);
            }
            if (f3==14) {
                System.out.println("3F тобында: "+f3);
            }
        }
        else{
            System.out.println("Try again");
        }


    }}

