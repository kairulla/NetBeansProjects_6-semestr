/*
* Разработка классов и интерфейсов:
* 1) Сделать собственный класс1 с полями, конструкторами, сеттерами/геттерами, методом toString
* 2) Сделать копию класса1 под другим именем класс2. Добавить в класс2 дополнительные методы класса
* 3) Сделать копию класса1 под именем класс3. Создать для класса3 интерфейс, подключить этот интерфейс в класс3. 
*    Добавить в класс3 дополнительные методы класса, часть из них не реализовать в классе3, сделав его абстрактным
* 4) Сделать новый класс4 как наследник класса3. Реализовать все абстрактные методы, 
*    переопределить некоторые родительские методы от класса3
*    Для каждого пункта сделать все необходимые демонстрации работы с классами
 */
package kz.kre.watch;

import java.util.Arrays;
//import java.util.Date;
import java.util.Calendar;

public class Launcher {

    public static void main(String[] args) {
//        WatchSimple watch = new WatchSimple();
//        System.out.println(watch.getHour());
//        System.out.println(watch.getMinute());
//        System.out.println(watch.getSeconds());
//        System.out.println();
//
//        watch.setHour(11);
//        watch.setMinute(22);
//        watch.setSeconds(33);
//
//        System.out.println(watch.getHour());
//        System.out.println(watch.getMinute());
//        System.out.println(watch.getSeconds());
//        System.out.println(watch);
//
//        MyDate currentDate = new MyDate();
//        System.out.println(currentDate);
//
//        Calendar c = Calendar.getInstance();
//        c.setTime(currentDate);
//        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
////        getDayWeekName(dayOfWeek);
//
//        public String getDayWeekName(int a) {
//            String[] d = new String[] {"Воскресенье", "Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота"};
//            return d[a];            
//        }
        MyDate mydate = new MyDate(19, 1, 1975);
        System.out.println(mydate.getZodiac());

    }

}
