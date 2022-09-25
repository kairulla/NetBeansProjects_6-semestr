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

public class WatchSimple {

    private int hour;
    private int minute;
    private int seconds;
    
    public WatchSimple() {
        this.hour = 0;
        this.minute = 0;
        this.seconds = 0;
    }    
    
    public WatchSimple(int hour, int minute, int seconds) {        
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
    }
    
    public void setHour(int hour) {
        this.hour = hour;
    }
    
    public int getHour() {
        return this.hour;
    }
    
    public void setMinute(int minute) {
        this.minute = minute;
    }
    
    public int getMinute() {
        return this.minute;
    }
    
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    
    public int getSeconds() {
        return this.seconds;
    }
        
    @Override
    public String toString() {
        return "Watch{" + "hour=" + hour + ", minute=" + minute + ", seconds=" + seconds + '}';
    }
    
}
