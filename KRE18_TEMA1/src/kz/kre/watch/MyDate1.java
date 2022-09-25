package kz.kre.watch;

public class MyDate1 {

    int day;
    int month;
    int year;
    String zodiak;

    String[] ZODIAC_SIGNS = new String[]{"Овен", "Телец", "Близнецы", "Рак", "Лев",
        "Дева", "Весы", "Скорпион", "Стрелец", "Козерог", "Водолей", "Рыбы"};

    public MyDate1(int day, int month, int year) {

        this.day = day;
        this.month = month;
        this.year = year;

    }

//    Овен 21.03 — 19.04
//    Телец 20.04 — 20.05
//    Близнецы 21.05 — 20.06
//    Рак 21.06 — 22.07
//    Лев 23.07 — 22.08
//    Дева 23.08 — 22.09
//    Весы 23.09 — 22.10
//    Скорпион 23.10 — 21.11
//    Стрелец 22.11 — 21.12
//    Козерог 22.12 — 19.01
//    Водолей 20.01 — 18.02
//    Рыбы 19.02 — 20.03
    public String getZodiak() {

//        if ((this.day >= 21 && this.month >= 3) || (this.day <= 19 && this.month <= 4)) { //Овен
//            return ZODIAC_SIGNS[0];
//        } else if ((this.day >= 20 && this.month >= 4) || (this.day <= 20 && this.month <= 5)) { //Телец
//            return ZODIAC_SIGNS[1];
//        } else if ((this.day >= 21 && this.month >= 5) && (this.day <= 20 && this.month <= 6)) { //Близнецы
//            return ZODIAC_SIGNS[2];
//        } else if ((this.day >= 21 && this.month >= 6) && (this.day <= 22 && this.month <= 7)) { //Рак
//            return ZODIAC_SIGNS[3];
//        } else if ((this.day >= 23 && this.month >= 7) && (this.day <= 22 && this.month <= 8)) { //Лев
//            return ZODIAC_SIGNS[4];
//        } else if ((this.day >= 23 && this.month >= 8) && (this.day <= 22 && this.month <= 9)) { //Дева
//            return ZODIAC_SIGNS[5];
//        } else if ((this.day >= 23 && this.month >= 9) && (this.day <= 22 && this.month <= 10)) { //Весы
//            return ZODIAC_SIGNS[6];
//        } else if ((this.day >= 23 && this.month >= 10) && (this.day <= 23 && this.month <= 11)) { //Скорпион
//            return ZODIAC_SIGNS[7];
//        } else if ((this.day >= 22 && this.month >= 11) && (this.day <= 21 && this.month <= 12)) { //Стрелец
//            return ZODIAC_SIGNS[8];
//        } else if ((this.day >= 22 && this.month >= 12) && (this.day <= 19 && this.month <= 1)) { //Козерог
//            return ZODIAC_SIGNS[9];
//        } else if ((this.day >= 20 && this.month >= 1) && (this.day <= 18 && this.month <= 2)) { //Водолей
//            return ZODIAC_SIGNS[10];
//        } else if ((this.day >= 19 && this.month >= 2) && (this.day <= 20 && this.month <= 3)) { //Рыбы
//            return ZODIAC_SIGNS[11];
//        }
        if ((this.day >= 21 && this.month >= 3) || (this.day <= 19 && this.month <= 4)) { //Овен
            return ZODIAC_SIGNS[0];
        } else if ((this.day >= 20 && this.month >= 4) || (this.day <= 20 && this.month <= 5)) { //Телец
            return ZODIAC_SIGNS[1];
        } else if ((this.day >= 21 && this.month >= 5) && (this.day <= 20 && this.month <= 6)) { //Близнецы
            return ZODIAC_SIGNS[2];
        } else if ((this.day >= 21 && this.month >= 6) && (this.day <= 22 && this.month <= 7)) { //Рак
            return ZODIAC_SIGNS[3];
        } else if ((this.day >= 23 && this.month >= 7) && (this.day <= 22 && this.month <= 8)) { //Лев
            return ZODIAC_SIGNS[4];
        } else if ((this.day >= 23 && this.month >= 8) && (this.day <= 22 && this.month <= 9)) { //Дева
            return ZODIAC_SIGNS[5];
        } else if ((this.day >= 23 && this.month >= 9) && (this.day <= 22 && this.month <= 10)) { //Весы
            return ZODIAC_SIGNS[6];
        } else if ((this.day >= 23 && this.month >= 10) && (this.day <= 23 && this.month <= 11)) { //Скорпион
            return ZODIAC_SIGNS[7];
        } else if ((this.day >= 22 && this.month >= 11) && (this.day <= 21 && this.month <= 12)) { //Стрелец
            return ZODIAC_SIGNS[8];
        } else if ((this.day >= 22 && this.month >= 12) && (this.day <= 19 && this.month <= 1)) { //Козерог
            return ZODIAC_SIGNS[9];
        } else if ((this.day >= 20 && this.month >= 1) && (this.day <= 18 && this.month <= 2)) { //Водолей
            return ZODIAC_SIGNS[10];
        } else if ((this.day >= 19 && this.month >= 2) && (this.day <= 20 && this.month <= 3)) { //Рыбы
            return ZODIAC_SIGNS[11];
        }

        return null;
    }
}
