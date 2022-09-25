<!DOCTYPE html>

<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php
//        Функции для обработки строк в PHP
//
//        Начиная с этого урока мы с вами открываем главу посвященную функциям для обработки строковых данных.
//        С помощью этих фукнций можно, например, обрезать строку, дописывать строку, заменить часть строки и много другое. Это очень полезный инструмент и вы частенько будете использовать все эти функции при разработке своих скриптов.
//        Все функции для обработки строк перечислены ниже:
//        chr
//        Возвращает символ по его коду ASCII
//        chunk_split
//        Разбивает строку на подстроки заданной длины
//        crypt
//        Зашифровывает строку с использованием одного из алгоритмов
//        echo
//        Выводит одну или несколько строк
//        explode
//        Разбивает строку на подстроки, ограниченные заданным разделителем, и форматирует из них массив
//        html_entity_decode
//        Декодирует все HTML-представления в соответствующие символы. Функция обратно по отношению к htmlentites
//        htmlentites
//        Кодирует все специальные символы в их HTML-представление
//        htmlspecialchars
//        Кодирует все символы в их HTML-представление
//        implode
//        Формирует строку из элементов массива
//        ltrim
//        Удаляет начальные пробелы из строки
//        rtrim
//        Удаляет конечные пробелы из строки
//        number_format
//        Представляет число в виде строки в различных форматах
//        ord
//        Возвращает ASCII-код символа
//        parse_str
//        Разбивает строку URL и присваивает значение переменным
//        print
//        Выводит строку
//        printf
//        Выводит строку с форматированием
//        sprintf
//        Возвращает строку с форматированием
//        setlocale
//        Устанавливает информацию о кодовой странице
//        similar_text
//        Вычисляет степень похожести двух строк
//        sscanf
//        Разбивает строку по шаблону и присваивает полученные значения переменным
//        str_ireplace
//        То же самое, что и str_replace, но без учета различий в регистре символов
//        str_pad
//        Дополняет строку до заданной длины другой строкой
//        str_repeat
//        Повторяет строку заданное количество раз
//        str_replace
//        Ищет в строке все вхождения подстроки и меняет на заданную строку
//        str_shuffle
//        Случайным образом перемешивает все символы в строке
//        str_split
//        Формирует массив из символов строки
//        str_word_count
//        Подсчитывает количество слов в строке
//        strcasecmp
//        Выполняет побайтовое сравнение строк без учета регистра символов
//        strcht
//        То же самое что strstr
//        strcmp
//        Выполняет побайтовое сравнение строк с учетом регистра символов
//        strip_tags
//        Удаляет из строки все HTML-и PHP-теги
//        stripos
//        Ищет первое вхождение подстроки в строке без учета регистра символов
//        stristr
//        То же самое что strstr, но без учета регистра символов
//        strlen
//        Возвращает длину строки
//        strnatcasecmp
//        То же самое что strnatcmp, но без учета регистра символов
//        strncmp
//        Выполняет побайтовое сравнение первых n символов строк
//        strpos
//        Ищет первое вхождение подстроки в строке
//        strrchr
//        Ищет последнее вхождение символа в строке
//        strrev
//        Инвертирует строку - прочитывает ее справа налево
//        strripos
//        Ищет последнее вхождение подстроки в строке без учета регистра символов
//        strrpos
//        Ищет последнее вхождение подстроки в строке
//        strspn
//        Возвращает длину участка строки, состоящего из заданных символов
//        strstr
//        Возвращает часть строки от первого вхождения подстроки до конца
//        strtolower
//        Преобразует прописные буквы в строчные
//        strtoupper
//        Преобразует строчные буквы в прописные
//        strtr
//        Преобразует заданные символы в строке
//        substr_compare
//        Сравнивает две строки, начиная с заданного смещения
//        substr_count
//        Подсчитывает, сколько раз заданная подстрока встречается в строке
//        substr_replace
//        Ищет в заданном участке строки все вхождения подстроки и меняет на другую строку
//        substr
//        Возвращает заданную часть исходной строки
//        trim
//        Удаляет начальные и конечные пробелы из строки
//        ucfirst
//        Преобразует первую букву строки в прописную
//        Использование строковых функций в PHP
//
//        В этом уроке мы посмотрим как использовать несколько строковых функций для обработки текста.
//        Функция substr
//        Функция substr используется для получения части строки. Синтаксис:
//        string substr(string $string, int $start [, int $length])
//                Первый параметр $string - строка из которой нужно получить подстроку начиная с позиции $start и длиной в $length.
//                Пример:

        echo substr("Hello world", 6, 5);

//        Отображение в браузере:
//        world
//        Последний параметр $length необязательный 

        echo substr("Hello world !!!", 6);

//        Отображение в браузере:
//        world !!!
//        Если $start отрицательный, то возвращаемая подстрока будет иметь значение от конца строки до позиции $start с конца строки. 
//        Для многобайтовых кодировок (например, для кириллицы) используйте функцию mb_substr с тем же синтаксисом что и в substr 
//        Функция strpos
//        Функция возвращает позицию первого вхождения подстроки в строку 
//        int strpos (string $string , mixed $needle [, int $offset = 0 ])
//        Первый параметр $string - строка в которой будет произведен поиск, $needle - строка, которую нужно найти, $offset - необязательный параметр, если этот параметр указан, то поиск будет начат с указанного количества символов с начала строки
//        Пример: 

        echo strpos("Hello world", "world"); // получим 6
//        В результате, получим 6, так как строка "world" впервые встречается на 6 позиции
//        Для многобайтовых кодировок(например, для кириллицы) используйте функцию mb_strpos с тем же синтаксисом что и в strpos
//                Создание массивов в PHP
//
//                Массив - это набор данных, которые объединены под одним именем. Массив состоит из нескольких элементов, которые имеют свой определенный индекс.
//                Массивы создаются при помощи оператора присвоения, также как и переменная.
//                Имена массивов начинаются со знака $, после которого следует произвольный идентификатор, далее идут квадратные скобки: $arr[0] = "php";
//                Данная конструкция создает массив и присваивает его элементу с индексом 0 значение "php", после чего мы можем обращаться к этому элементу как к обычной переменной: echo $arr[0]. В результате мы увидим слово php.
//                Также, мы можем добавить еще элементы к массиву:
        $arr[1] = "html";
        $arr[2] = "css";

//                В качестве индекса элементов массива мы можем использовать не только числа:
        $arr["Kiev"] = 3000000;
        $arr["Paris"] = 5000000;
        $arr["LA"] = 15000000;

//                В качестве значений индексов элементов и самих элементов мы можем использовать одинаковые типы данных одновременно!
//                Также существует сокращенная запись для индексирования:
        $arr[] = 3000000;
        $arr[] = 5000000;
        $arr[] = 15000000;

//                В этом случае первый элемент(3000000) получит индекс 0!Нужно иметь это ввиду.
//                Для создания массива
//                Для создания массива мы можем использовать функцию array:

        $arr = array("php", "html", "css");

//        В этом случае первый элемент получит индекс 0. Если нужно присвоить какой-то другой номер, то можно воспользоваться конструкцией => :

        $arr = array(1 => "php", "html", "css");

//        Теперь элемент под номером 1 это "php", а не "html"!Также, можно создать массив со строковым индексом:

        $arr = array("first" => "php", "second" => "html", "third" => "css");

//        PHP >= 5.4
//        Начиная с версии PHP 5.4, массивы можно создать через квадратные скобки:

        $arr = ["php", "laravel", "yii", "zend", "cakephp"];

//        Модификация элементов массива в PHP
//
//        Нередко, нужно изменить значение того, или иного элемента массива, для этого нужно всего лишь обратится к элементу массива по его индексу и присвоить ему новое значение.
//        Например, у нас есть массив:

        $arr[0] = "PHP";
        $arr[1] = "HTML";
        $arr[2] = "CSS";

//        Для того, чтобы изменить значение элемента используем оператор присвоения:

        $arr[1] = "JAVASCRIPT";

//        Для того, чтобы добавить новый элемент в конец массива использует конструкцию:

        $arr[] = "JQUERY";

//        Для того, чтобы вывести на экран массив можно использовать foreach:

        $arr[0] = "PHP";
        $arr[1] = "HTML";
        $arr[2] = "CSS";

        $arr[1] = "JAVASCRIPT";
        $arr[] = "JQUERY";

        foreach ($arr as $key => $value) { // при переборе: $key - индекс элемента массива, $value - значение элемента массива
            echo $value . '<br/>';
        }

//        Отображение в браузере:
//        PHP
//        JAVASCRIPT
//        CSS
//        JQUERY
//        Удаление элементов массива в PHP
//        Если нам нужно удалить один из элементов массива, то для этого мы должны использовать функцию unset

        $arr[0] = "PHP";
        $arr[1] = "HTML";
        $arr[2] = "CSS";

        unset($arr[1]);

        foreach ($arr as $key => $value) {
            echo $value . '<br/>';
        }

//        Перебор элементов массива в PHP
//
//        Кроме использования цикла for для вывода всех элементов массива на экран мы можем использовать функцию print_r, которая выведет все элементы массива вместе с их индексами.
        $arr[0] = "PHP";
        $arr[1] = "HTML";
        $arr[2] = "CSS";

        print_r($arr);

//        Отображение в браузере:
//        Array ( [0] => PHP [1] => HTML [2] => CSS )
//        Также, чтобы результат вывода функции print_r был более наглядным рекомендую перед использованием функции писать echo "<pre>";
//        , а после функции - echo "</pre>";
//        Что такое тег pre?
//        Также в PHP присутствует специальный цикл для обработки массивов - цикл foreach

        $arr[0] = "PHP";
        $arr[1] = "HTML";
        $arr[2] = "CSS";

        foreach ($arr as $value) {
            echo $value, "<br>";
        }

//        Отображение в браузере:
//        PHP
//        HTML
//        CSS
//        Для вывода индекса элемента нужно использовать второй вариант синтаксиса цикла foreach

        $arr[0] = "PHP";
        $arr[1] = "HTML";
        $arr[2] = "CSS";

        foreach ($arr as $key => $value) { // $key - индекс элемента массива, $value - значение элемента массива
            echo "[{$key}] => {$value} <br/>";
        }

//        Отображение в браузере:
        [0] => PHP
        [1] => HTML
        [2] => CSS
//        Функции для работы с массивами в PHP
//
//        Для работы с массивами в PHP предусмотрено очень много функций, полный список которых находиться ниже:
//        array_chunk
//        Разбивает массив на несколько меньших массивов заданного размера
//        array_combine
//        Создает массив из двух заданных массивов - массива индексов элементов и массива значений
//        array_count_values
//        Формирует массив, индексами которого являются значения заданного массива, а значениями - число повторений соответствующего значения в заданном массиве
//        array_diff
//        Формирует массив из тех элементов первого заданного массива, которые отсутствуют в остальных заданных в качестве аргументов функции массива
//        array_fill
//        Заполняет массив заданным значением
//        array_intersect
//        Формирует массив из элементов, которые присутствуют во всех заданных массивах
//        array_key_exists
//        Проверяет наличие заданного индекса в массиве
//        array_keys
//        Возвращает массив из индексов заданного массива
//        array_merge
//        Объединяет несколько массивов в один
//        array_multisort
//        Выполняет сортировку многомерного массива или нескольких одномерных массивов
//        array_pad
//        Дополняет массив до заданного количества элементов заданным значением
//        array_pop
//        Возвращает последний элемент массива, одновременно удаляя элемент из массива
//        array_push
//        Добавляет заданные элементы в конец массива
//        array_rand
//        Выбирает один или несколько случайно взятых элементов из массива
//        array_reduce
//        Осуществляет последовательное применение заданной функции к элементам массива, формируя итоговое значение
//        array_reverse
//        Производит обращение массива - первый элемент становится последним, второй - предпоследним и т.д.
//        array_search
//        Ищет заданный элемент в массиве и возвращает соответствующим ему индекс
//        array_shift
//        Возвращает первый элемент массива, одновременно удаляя его из массива с перенумерацией числовых индексов
//        array_slice
//        Вырезает из массива подмассив заданной длины, начиная с указанного элемента
//        array_sum
//        Вычисляет сумму всех элементов массива
//        array_unique
//        Удаляет дублирующиеся значения из массива
//        array_unshift
//        Добавляет один или несколько элементов в начало массива с перенумерацией числовых индексов
//        array_walk
//        Вызывает заданную функцию последовательно для каждого элемента массива
//        array
//        Создает массив из заданных значений или пар индекс - значение
//        arsort
//        Сортирует массив по убыванию его значений, сохраняя индексы неизменными
//        asort
//        Сортирует массив по возрастанию его значений, сохраняя индексы неизменными
//        krsort
//        Сортирует массив по убыванию его индексов
//        ksort
//        Сортирует массив по возрастанию его индексов
//        sort
//        Сортирует массив по возрастанию значений его элементов с перенумерацией его индексов
//        usort
//        Сортирует массив с использование заданной функции сравнения элементов массива
//        rsort
//        Сортирует массив по убыванию значений его элементов с перенумерацией его индексов
//        natcasesort
//        Сортирует массив естественным образом без учета регистра массива
//        natsort
//        Сортирует массив естественным образом с учетом регистра символов
//        count
//        Возвращает количество элементов в массиве
//        current
//        Возвращает значение текущего элемента массива
//        each
//        Возвращает текущие индекс и значение элемента массива и продвигает указатели на следующий элемент
//        in_array
//        Проверяет, присутствует ли заданное значение в массиве
//        key
//        Возвращает индекс текущего элемента массива
//        list
//        Присваивает значения из массива списку переменных
//        pos
//        Синоним функции current
//        reset
//        Устанавливает внутренний указатель на первый элемент массива
//        shuffle
//        Переставляет элементы массива случайным образом
//        sizeof
//        Синоним функции count
//        Более подробную информацию про все функции для работы с массивами вы можете найти на странице официальной документации.
//
//        Сортировка массивов в PHP
//
//        Очень часто нужно отсортировать массив по индексу его элементов, по алфавиту его элементов, по возрастанию, по убыванию и т. д. В PHP для этого существует достойное количество функций, и в этом уроке мы поговорим именно о них.
//        Первая функция - sort, которая сортирует массив по возрастанию значений его элементов, при этом изменяя индекс после сортировки:

        $arr[0] = "PHP";
        $arr[1] = "HTML";
        $arr[2] = "CSS";

        sort($arr);

        print_r($arr);

//        В нашем случае, массив отсортируется в алфавитном порядке. Отображение в браузере:
//        Array ( [0] => CSS [1] => HTML [2] => PHP )
//        Вторая функция - rsort, которая сортирует массив по убыванию значений его элементов, при этом не изменяя индекс после сортировки:

        $arr[0] = "PHP";
        $arr[1] = "HTML";
        $arr[2] = "CSS";

        rsort($arr);

        print_r($arr);

//        Отображение в браузере:
//        Array ( [0] => PHP [1] => HTML [2] => CSS )
//        Третья функция - ksort, которая сортирует массив по ключам, сохраняя отношения между ключами и значениями:

        $arr[0] = "PHP";
        $arr[1] = "HTML";
        $arr[2] = "CSS";

        ksort($arr);

        print_r($arr);

//        Отображение в браузере:
//        Array ( [0] => PHP [1] => HTML [2] => CSS )
//        Следующая функция - krsort, которая сортирует массив по убыванию индексов его элементов:

        $arr[0] = "PHP";
        $arr[1] = "HTML";
        $arr[2] = "CSS";

        krsort($arr);

        print_r($arr);

//        Отображение в браузере:
//        Array ( [2] => CSS [1] => HTML [0] => PHP )
//        Навигация по массивам в PHP
//
//        Навигация по массива дает возможно узнать текущий, следующий, предыдущий, последний элемента массива.
//        Для определения текущего элемента массива используют функцию current:

        echo "Now is: ", current($arr), "<br>";

//        Для определения следующего элемента массива используют функцию next:

        echo "Next is: ", next($arr), "<br>";

//        Для определения предыдущего элемента массива используют функцию prev:

        echo "Previously is: ", prev($arr), "<br>";

//        Для определения последнего элемента массива используют функцию end:

        echo "The end is: ", end($arr), "<br>";

//        Для определения первого(возврата указателя) элемента массива используют функцию reset:

        echo "First is: ", reset($arr), "<br>";

//        Пример навигации по массивам:

        $arr[0] = "PHP";
        $arr[1] = "HTML";
        $arr[2] = "CSS";

        echo "Now is: ", current($arr), "<br>";
        echo "Next is: ", next($arr), "<br>";
        echo "Previously is: ", prev($arr), "<br>";
        echo "The end is: ", end($arr), "<br>";
        echo "First is: ", reset($arr), "<br>";

//        Отображение в браузере:
//        Now is: PHP
//        Next is: HTML
//        Previously is: PHP
//        The end is: CSS
//        First is: PHP
//        Преобразование строк в массивы и наоборот в PHP
//
//        PHP умеет преобразовывать данные из строки в массив и наоборот, для этого в PHP есть функция implode и explode.
//        implode - формирует строку из массива.
//        explode - формирует массив из строки.
//        Использование функции implode:

        $arr[0] = "PHP";
        $arr[1] = "HTML";
        $arr[2] = "CSS";

        $string = implode(", ", $arr);
        echo $string;

//        Отображение в браузере:
//        PHP, HTML, CSS
//        Использование функции explode:

        $string = "PHP, HTML, CSS";
        $arr = explode(", ", $string);
        print_r($arr);

//        Отображение в браузере:
//        Array ( [0] => PHP [1] => HTML [2] => CSS )
//        Извлечение переменных из массивов в PHP
//
//        Если есть потребность для массива, который проиндексированн строчными данным, присвоить значение переменным, одноименным с соответствующими индексами, то можно использовать функцию extract .
        $arr["one"] = "PHP";
        $arr["two"] = "HTML";
        $arr["three"] = "CSS";

        extract($arr);

        echo "\$one = $one <br>";
        echo "\$two = $two <br>";
        echo "\$three = $three <br>";

//        Отображение в браузере:
//        $one = PHP
//        $two = HTML
//        $three = CSS
//        Если нужно сложить из переменных массив, то нужно использовать функцию compact .
        $one = "PHP";
        $two = "HTML";
        $three = "CSS";

        $arr = compact("one", "two", "three");

        print_r($arr);

//        Отображение в браузере:
//        Array ( [one] => PHP [two] => HTML [three] => CSS )
//        Слияние и разделение массивов в PHP
//
//        Если вам нужно добавить в массив несколько элементов другого массива, то вам поможет функция array_slice:

        $arr["one"] = "PHP";
        $arr["two"] = "HTML";
        $arr["three"] = "CSS";

        $new_arr = array_slice($arr, 0, 2);
        print_r($new_arr);

//        Отображение в браузере:
//        Array ( [one] => PHP [two] => HTML )
//        Первый параметр функции array_slice - это название того массива, с которого будут браться элементы;
//        второй - начальный номер элемента(с какого элемента начинать брать элементы);
//        третий - количество элементов выборки.
//        Для соединения массивов в один нужно использовать функцию array_merge:

        $arr[1] = "PHP";
        $arr[2] = "HTML";
        $arr[3] = "CSS";

        $arr2[1] = "PHOTOSHOP";
        $arr2[2] = "PAINT.NET";
        $arr2[3] = "DREAMWEAVER";

        $new_arr = array_merge($arr, $arr2);
        print_r($new_arr);

//        Отображение в браузере:
//        Array ( [0] => PHP [1] => HTML [2] => CSS [3] => PHOTOSHOP [4] => PAINT.NET [5] => DREAMWEAVER )
//        Сравнение массивов в PHP
//
//        Если нужно проверить какой элемент совпадает в том, или ином массиве, или наоборот НЕ совпадает, то можно использовать функцию array_diff:

        $arr[1] = "PHP";
        $arr[2] = "HTML";
        $arr[3] = "CSS";

        $arr2[1] = "PHP";
        $arr2[2] = "PAINT.NET";
        $arr2[3] = "DREAMWEAVER";

        $diff = array_diff($arr, $arr2);
        print_r($diff);

//        Отображение в браузере:
//        Array ( [2] => HTML [3] => CSS )
//        Если нужно, чтобы сравнивался еще и строковый индекс массивов, то тут уже нужно использовать функцию array_diff_assoc:

        $arr["one"] = "PHP";
        $arr["two"] = "HTML";
        $arr["three"] = "CSS";

        $arr2[1] = "PHP";
        $arr2["two"] = "HTML";
        $arr2[3] = "DREAMWEAVER";

        $diff = array_diff_assoc($arr, $arr2);
        print_r($diff);

//        Отображение в браузере:
//        Array ( [one] => PHP [three] => CSS )
//        Если вам нужно найти общие элементы массивов, то вам поможет функция array_intersect:

        $arr[1] = "PHP";
        $arr[2] = "HTML";
        $arr[3] = "CSS";

        $arr2[1] = "PHP";
        $arr2[2] = "PAINT.NET";
        $arr2[3] = "DREAMWEAVER";

        $diff = array_intersect($arr, $arr2);
        print_r($diff);

//        Отображение в браузере:
//        Array ( [1] => PHP )
//        Если при нахождении общих элементов массивов нужно учесть и индекс, то, по аналогии array_diff_assoc, используйте функцию array_intersect_assoc.
//        Обработка данных в массивах PHP
//
//        PHP имеет множество функций для обработки данных в массивах. Например, если нужно вычислить сумму всех элементов массив, то можно воспользоваться функцией array_sum:

        $arr[1] = 31;
        $arr[2] = 1;
        $arr[3] = 94;

        $sum = array_sum($arr);

        echo $sum;

//        Отображение в браузере:
//        126
//        Если, требуется избавиться от элементов с повторяющимся значением, то стоит использовать функцию array_unique:
//
        $arr = array(30, 44, 97, 30);
        print_r($arr);

        $new_arr = array_unique($arr);
        print_r($new_arr);

//        Отображение в браузере:
//        Array ( [0] => 30 [1] => 44 [2] => 97 [3] => 30 )
//        Array ( [0] => 30 [1] => 44 [2] => 97 )
//        Многомерные массивы в PHP
//
//        Кроме одномерных в PHP есть еще и многомерные массивы. Это такие массивы, какие имеют под одним индексом два или более значений. Например, есть массив companies, который имеет информацию об предложениях по работе, от разных компаний:

        $companies["Microsoft"] = "Programmer";
        $companies["Google"] = "IT";
        $companies["Mozilla"] = "PR";

//        А если компания имеет несколько предложений, то тут уже нужно использовать многомерные массивы:

        $companies["Microsoft"][1] = "Programmer";
        $companies["Microsoft"][2] = "PR";
        $companies["Microsoft"][3] = "Office Manager";

        $companies["Google"][1] = "IT";
        $companies["Google"][2] = "Web-design";

        $companies["Mozilla"][1] = "PR";
        $companies["Mozilla"][2] = "C++ Programmer";

        print_r($companies);

//        Отображение в браузере:
//        Array (
//        [Microsoft] => Array ( [1] => Programmer [2] => PR [3] => Office Maneger )
//        [Google] => Array ( [1] => IT [2] => Web-design )
//        [Mozilla] => Array ( [1] => PR [2] => C++Programmer )
//        )
//        Также, эту конструкцию можно было записать так:

        $companies = [
            "Microsoft" => ["Programmer", "PR", "Office Manager"],
            "Google" => ["IT", "Web-design"],
            "Mozilla" => ["PR", "C++ Programmer"]
        ];

// можете используйте тег pre для форматирования вывода
        echo "<pre>";
        print_r($companies);
        echo "</pre>";

//        Отображение в браузере:
//        Array
//        (
//        [Microsoft] => Array
//        (
//        [0] => Programmer
//        [1] => PR
//        [2] => Office Manager
//        )
//
//        [Google] => Array
//        (
//        [0] => IT
//        [1] => Web-design
//        )
//
//        [Mozilla] => Array
//        (
//        [0] => PR
//        [1] => C++Programmer
//        )
//
//        )
        ?>
    </body>
</html>
