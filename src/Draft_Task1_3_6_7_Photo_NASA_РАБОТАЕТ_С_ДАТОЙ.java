import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

//        Пример _ ППППППППППППППППППППППППППППППППППП ТЕСТ МЕТОДОВ И КЛАССОВ Каким макаром взять переменную term,
//        которая появилась вообще в третьем методе. Доступность переменных из разных методов.
//        Module1_Tema3_Urok3 Области видимости переменной 0 50 21 - Важный момент, я понимаю, что Вы могли устать
//        а про про то как из метода в метод передавать переменнкю - видео мин 0 53 21
public class Draft_Task1_3_6_7_Photo_NASA_РАБОТАЕТ_С_ДАТОЙ {
    public static void main(String[] args) throws IOException, ParseException {
        String termWithoutSpaces = term.replaceAll(" ", "+");   //  1. Пошагово пишем

        getUserInput();                                         //  5. Нажали Ctrl + Alt + M


    }

    private static void getUserInput() {                        //  5. Нажали Ctrl + Alt + M
        System.out.println("What are you looking in iTunes?");  //  2.
        Scanner scanner = new Scanner (System.in);              //  3.
        String term = scanner.nextLine(); //  war of worlds     //  4.
    }
}
//        Конец Примера _ КККККККККККККККК








////        Пример _ ППППППППППППППППППППППППППППППППППП ТЕСТ МЕТОДОВ И КЛАССОВ с изменениями Виктора Сильнова
////  Тест как sout в отдельный класс вывести
////  Здесь видео мин 02 28 , предположительно , ВАЖНО! Как sout в качестве объекта класса в main класс вывести
////  Гоша Дударь https://www.youtuBe.com/watch?v=_GLnOwDEE_A&list=PL0lO_mIqDDFW2xXiWSfjT7hEdOUZHVNBK&index=14
//public class Draft_Task1_3_6_7_Photo_NASA_РАБОТАЕТ_С_ДАТОЙ {
//    public static void main(String[] args) throws IOException, ParseException {
//
//        //  Далее про метод и имя ГОША ДУДАРЬ
//        //  package вот ТАК УКАЗЫВАТЬ: package com.company
//        System.out.println("От ГОШИ ДУДАРЯ: ");
//        Person vitia = new Person();
//        vitia.height = 120;  //  Если изменим ( не 180, а 120 ), то выведется 120
//        System.out.println(vitia.height);
//        Person vlad = new Person();
//        System.out.println(vlad.height);
//
////  Про метод и имя здесь: видео мин 08 00 Гоша Дударь https://www.youtuBe.com/watch?v=_GLnOwDEE_A&list=PL0lO_mIqDDFW2xXiWSfjT7hEdOUZHVNBK&index=14
////  Метод от класса отличается те, что в круглых скобках перраметр (его значение) указывать нужно.
//        vitia.say("George");
//        System.out.println(); //  перенос строки
//        //  Конец ГОША ДУДАРЬ
//
//        //  Далее про методы и доступность переменных внутри методов ВИКТОР СИЛЬНОВ
//        //  MoModule1_Tema3_Urok5 видео мин 36 31
////        StringBuilder result = new StringBuilder(); //  мы его создали внутри метода, а не как аргумент
//        System.out.println("От ВИКТОРА СИЛЬНОВА: ");
//        String page = "тестирование";
////        StringBuilder result = null;
//        extracted (page/*, result*/);
//    }
//
//    // Это метод, а не класс от ВИКТОРА СИЛЬНОВА
//    static StringBuilder extracted (String page/*, StringBuilder result*/) { // Это только метод, а не класс от ВИКТОРА СИЛЬНОВА
//        System.out.println(page.toUpperCase());
//
//        StringBuilder result = new StringBuilder();
//        result.append("This is a book.");
//        result.append(" Author is Hemingway.");
//        System.out.println(result);
//
//        return result;
//    }
//
//}
//class Person {  //  Если в отдельном файле, то надо писать public class
//    public int height = 180;
//    public void say (String name) {
//        System.out.println("Hello, " + name);
//    }
//}
////        Конец Примера _ КККККККККККККККК








////        Пример 7 ППППППППППППППППППППППППППППППППППП ТЕСТ МЕТОДОВ И КЛАССОВ первая версия, до изменений Виктора Сильнова
////  Тест как sout в отдельный класс вывести
////  Здесь видео мин 02 28 , предположительно , ВАЖНО! Как sout в качестве объекта класса в main класс вывести
////  Гоша Дударь https://www.youtuBe.com/watch?v=_GLnOwDEE_A&list=PL0lO_mIqDDFW2xXiWSfjT7hEdOUZHVNBK&index=14
//public class Draft_Task1_3_6_7_Photo_NASA_РАБОТАЕТ_С_ДАТОЙ {
//    public static void main(String[] args) throws IOException, ParseException {
//
//        //  Далее про метод и имя ГОША ДУДАРЬ
//        //  package вот ТАК УКАЗЫВАТЬ: package com.company
//        System.out.println("От ГОШИ ДУДАРЯ: ");
//        Person vitia = new Person();
//        vitia.height = 120;  //  Если изменим ( не 180, а 120 ), то выведется 120
//        System.out.println(vitia.height);
//        Person vlad = new Person();
//        System.out.println(vlad.height);
//
////  Про метод и имя здесь: видео мин 08 00 Гоша Дударь https://www.youtuBe.com/watch?v=_GLnOwDEE_A&list=PL0lO_mIqDDFW2xXiWSfjT7hEdOUZHVNBK&index=14
////  Метод от класса отличается те, что в круглых скобках перраметр (его значение) указывать нужно.
//        vitia.say("George");
//        System.out.println(); //  перенос строки
//        //  Конец ГОША ДУДАРЬ
//
//        //  Далее про методы и доступность переменных внутри методов ВИКТОР СИЛЬНОВ
//        //  MoModule1_Tema3_Urok5 видео мин 36 31
//        StringBuilder result = new StringBuilder();
//        System.out.println("От ВИКТОРА СИЛЬНОВА: ");
//        String page = "тестирование";
////        StringBuilder result = null;
//        extracted (page, result);
//    }
//
//    static void extracted (String page, StringBuilder result) { // Это только метод, а не класс
//        System.out.println(page.toUpperCase());
//
//        result.append("This is a book.");
//        result.append(" Author is Hemingway.");
//        System.out.println(result);
//    }
//
//}
//class Person {  //  Если в отдельном файле, то надо писать public class
//    public int height = 180;
//    public void say (String name) {
//        System.out.println("Hello, " + name);
//    }
//}
////        Конец Примера 7 КККККККККККККККК







////        Пример 6 ППППППППППППППППППППППППППППППППППП Вернуться к нему после теста методов и классов
////  Пример взят отсюда: https://www.youtube.com/watch?v=5V2lZpEeRlA  девушка на английском говорит
////  5 способов выполнения HTTP-запросов  https://javascopes.com/5-ways-to-make-http-requests-in-java-2p3-fca27bc8/
////  УТИЛИТА, КАК СКАЧАТЬ ФОТО NASA_Module1_Tema1_Urok9 видео мин 22.00, НО ЗДЕСЬ БЕЗ ДАТЫ
//public class Draft_Task1_3_6_7_Photo_NASA_РАБОТАЕТ_С_ДАТОЙ {
//    public static void main(String[] args) throws IOException, ParseException {
//        System.out.println("Задание: \n7. Сохраняйте снимки NASA с 1 января до того момента, пока в поле Explanation " +
//                "нет слова “Earth”\n\nРешение: ");
//
//        String dateBegin_NO_Format = "2022/12/31";
////        String dateNext_YES_Format;
//        for (int i = 0; i < 3; i++) {
//            System.out.println("ИТЕРАЦИЯ " + (i+1));
//
////            String dateBegin_NO_Format = dateBegin;
////            String dateBegin_YES_Format = "2022-12-31";
//            System.out.println("Было dateBegin_NO_Format: " + dateBegin_NO_Format);
//            dateFormat_Begin(dateBegin_NO_Format);  //  Форматируем дату
////            System.out.println("Стало dateBegin_YES_Format: " + dateBegin_YES_Format);
//
//            final SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
//            final Date date = format.parse(dateBegin_NO_Format);
//            final Calendar calendar = Calendar.getInstance();
//            calendar.setTime(date);
//            calendar.add(Calendar.DAY_OF_YEAR, 1);
//            String dateNext_NO_Format = format.format(calendar.getTime());
//            System.out.println("Была следующ. дата в цикле НЕ В ФОРМАТЕ: " + dateNext_NO_Format);
//            dateFormat_Next(dateNext_NO_Format);  //  Форматируем дату
//
//            String dateForSubstitute = ""/*dateNext_YES_Format*/; //  Дата для подстановки
//            String pageNasaAsText = "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&date=2019-10-14";
//            int urlBeginAsText = pageNasaAsText.lastIndexOf("date=");
//            String substringUrlAsText = pageNasaAsText.substring(urlBeginAsText + 5);
//            System.out.println(substringUrlAsText);
//            String pageNasaAsText_NEW = pageNasaAsText.replace(substringUrlAsText, dateForSubstitute);
//            System.out.println("С подставленной датой: \n" + pageNasaAsText_NEW);
//
//            dateBegin_NO_Format = dateNext_NO_Format;
//
//            System.out.println(); //  перенос строки
//        }
//
////        String dateForSubstitute = "2022-12-31"; //  Дата для подстановки
////        String pageNasaAsText = "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&date=2019-10-14";
////        int urlBeginAsText = pageNasaAsText.lastIndexOf("date=");
////        String substringUrlAsText = pageNasaAsText.substring(urlBeginAsText + 5);
////        System.out.println(substringUrlAsText);
////        String pageNasaAsText_NEW = pageNasaAsText.replace(substringUrlAsText, dateForSubstitute);
////        System.out.println("С подставленной датой: \n" + pageNasaAsText_NEW);
//
////        String pageNasa = downloadWeBPage("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&date=2019-10-14"); //  ВОТ ЗДЕСЬ ЗАДАЕТСЯ ДАТА
////        int urlBegin = pageNasa.lastIndexOf("url");
////        int urlEnd = pageNasa.lastIndexOf("}");
////        String urlPhoto = pageNasa.substring(urlBegin + 6, urlEnd - 1);
////        try (InputStream from = new URL(urlPhoto).openStream()) {
////            Path to = Paths.get("photo.jpg");  //  ЕСЛИ БЕЗ ПЕРЕЗАПИСИ, ТО ЭТА СТРОЧКА НЕ НУЖНА !
//////            Files.copy(from, Paths.get("photo.jpg"));  //  ЭТО БЫЛО РАНЕЕ, БЕЗ ПЕРЕЗАПИСИ !
////            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
////        }
////
////        System.out.println("\n" + "Картинка сохранена!");
////
////        int explanationBegin = pageNasa.lastIndexOf("explanation");
////        int explanationEnd = pageNasa.lastIndexOf("hdurl");
////        String explanation = pageNasa.substring(explanationBegin + 14, explanationEnd - 3/* или 8, три - правильно */);
////        System.out.println("Пояснение к фртографии: \n" + explanation);
//
//    }
//
//
//    private static String downloadWeBPage(String url) throws IOException {
//        StringBuilder result = new StringBuilder();
//        String line;
//        URLConnection urlConnection = new URL(url).openConnection();
//        try (InputStream is = urlConnection.getInputStream();
//             BufferedReader Br = new BufferedReader(new InputStreamReader(is))) {
//            while ((line = Br.readLine()) != null) {
//                result.append(line);
//            }
//        }
//        return result.toString();
//    }
//
//    private static void dateFormat_Begin(String dateBegin_NO_Format) {
//        SimpleDateFormat dt = new SimpleDateFormat("yyyy/MM/dd");
//        try {
//            Date date = dt.parse(dateBegin_NO_Format);
//            SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");
//            String dateBegin_YES_Format = dt1.format(date);
//            System.out.println("Стало dateBegin_YES_Format: " + dateBegin_YES_Format);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
////        System.out.println(); //  перенос строки
//    }
//    private static void dateFormat_Next(String dateNext_NO_Format) {
//        SimpleDateFormat dt = new SimpleDateFormat("yyyy/MM/dd");
//        try {
//            Date date2 = dt.parse(dateNext_NO_Format);
//            SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");
//            String dateNext_YES_Format = dt1.format(date2);
//            System.out.println("Стала следующ. дата в цикле В ФОРМАТЕ: " + dateNext_YES_Format);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//    }
//}
////        Конец Примера 6 КККККККККККККККК







////        Пример 5 ППППППППППППППППППППППППППППППППППП УДАЛОСЬ ПЕРЕФОРМАТИРОВАТЬ ДАТУ
////  Пример взят отсюда: https://www.youtube.com/watch?v=5V2lZpEeRlA  девушка на английском говорит
////  5 способов выполнения HTTP-запросов  https://javascopes.com/5-ways-to-make-http-requests-in-java-2p3-fca27bc8/
////  УТИЛИТА, КАК СКАЧАТЬ ФОТО NASA_Module1_Tema1_Urok9 видео мин 22.00, НО ЗДЕСЬ БЕЗ ДАТЫ
//public class Draft_Task1_3_6_7_Photo_NASA_РАБОТАЕТ_С_ДАТОЙ {
//    public static void main(String[] args) throws IOException, ParseException {
//        System.out.println("Задание: \n.Сохраняйте снимки NASA с 1 января до того момента, пока в поле Explanation " +
//                "\nнет слова “Earth”\n\nРешение: ");
//
//        String date_s = "2022/03/15";
//        System.out.println("Было: " + date_s);
//        SimpleDateFormat dt = new SimpleDateFormat("yyyy/MM/dd");
//        try {
//            Date date = dt.parse(date_s);
//            SimpleDateFormat dt1 = new SimpleDateFormat("yyyy-MM-dd");
//            String result = dt1.format(date);
//            System.out.println("Стало: " + result);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(); //  перенос строки
//
//        String dateBegin = "2022/12/31";
//        System.out.println("Была dateBegin: " + dateBegin);
//        final SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
//        final Date date = format.parse(dateBegin);
//        final Calendar calendar = Calendar.getInstance();
//        calendar.setTime(date);
//        calendar.add(Calendar.DAY_OF_YEAR, 1);
//        String nextDateWrongFormat = format.format(calendar.getTime());
//        dateBegin = nextDateWrongFormat;
//        System.out.println(nextDateWrongFormat);
//        System.out.println("Стала dateBegin: " + dateBegin);
//
//        String pageNasa = downloadWeBPage("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&date=2019-10-14"); //  ВОТ ЗДЕСЬ ЗАДАЕТСЯ ДАТА
//        int urlBegin = pageNasa.lastIndexOf("url");
//        int urlEnd = pageNasa.lastIndexOf("}");
//        String urlPhoto = pageNasa.substring(urlBegin + 6, urlEnd - 1);
//        try (InputStream from = new URL(urlPhoto).openStream()) {
//            Path to = Paths.get("photo.jpg");  //  ЕСЛИ БЕЗ ПЕРЕЗАПИСИ, ТО ЭТА СТРОЧКА НЕ НУЖНА !
////            Files.copy(from, Paths.get("photo.jpg"));  //  ЭТО БЫЛО РАНЕЕ, БЕЗ ПЕРЕЗАПИСИ !
//            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
//        }
//
//        System.out.println("\n" + "Картинка сохранена!");
//
//        int explanationBegin = pageNasa.lastIndexOf("explanation");
//        int explanationEnd = pageNasa.lastIndexOf("hdurl");
//        String explanation = pageNasa.substring(explanationBegin + 14, explanationEnd - 3/* или 8, три - правильно */);
//        System.out.println("Пояснение к фртографии: \n" + explanation);
//
//    }
//
//    private static String downloadWeBPage(String url) throws IOException {
//        StringBuilder result = new StringBuilder();
//        String line;
//        URLConnection urlConnection = new URL(url).openConnection();
//        try (InputStream is = urlConnection.getInputStream();
//             BufferedReader Br = new BufferedReader(new InputStreamReader(is))) {
//            while ((line = Br.readLine()) != null) {
//                result.append(line);
//            }
//        }
//        return result.toString();
//    }
//}
////        Конец Примера 5 КККККККККККККККК







////        Пример 4 ППППППППППППППППППППППППППППППППППП УДАЛОСЬ ПОЛУЧИТЬ СЛЕДУЮЩУЮ ДАТУ
////  Пример взят отсюда: https://www.youtube.com/watch?v=5V2lZpEeRlA  девушка на английском говорит
////  5 способов выполнения HTTP-запросов  https://javascopes.com/5-ways-to-make-http-requests-in-java-2p3-fca27bc8/
////  УТИЛИТА, КАК СКАЧАТЬ ФОТО NASA_Module1_Tema1_Urok9 видео мин 22.00, НО ЗДЕСЬ БЕЗ ДАТЫ
//public class Draft_Task1_3_6_7_Photo_NASA_РАБОТАЕТ_С_ДАТОЙ {
//    public static void main(String[] args) throws IOException, ParseException {
//        System.out.println("Задание: \n.Сохраняйте снимки NASA с 1 января до того момента, пока в поле Explanation " +
//                "\nнет слова “Earth”\n\nРешение: ");
//
//        String dateBegin = "2023-01-01";
//        String curDate2 = "2023/01/01";
//        final SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
//        final Date date = format.parse(curDate2);
//        final Calendar calendar = Calendar.getInstance();
//        calendar.setTime(date);
//        calendar.add(Calendar.DAY_OF_YEAR, 1);
//        System.out.println(format.format(calendar.getTime()));
//
//        String pageNasa = downloadWeBPage("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&date=2019-10-14"); //  ВОТ ЗДЕСЬ ЗАДАЕТСЯ ДАТА
//        int urlBegin = pageNasa.lastIndexOf("url");
//        int urlEnd = pageNasa.lastIndexOf("}");
//        String urlPhoto = pageNasa.substring(urlBegin + 6, urlEnd - 1);
//        try (InputStream from = new URL(urlPhoto).openStream()) {
//            Path to = Paths.get("photo.jpg");  //  ЕСЛИ БЕЗ ПЕРЕЗАПИСИ, ТО ЭТА СТРОЧКА НЕ НУЖНА !
////            Files.copy(from, Paths.get("photo.jpg"));  //  ЭТО БЫЛО РАНЕЕ, БЕЗ ПЕРЕЗАПИСИ !
//            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
//        }
//
//        System.out.println("\n" + "Картинка сохранена!");
//
//        int explanationBegin = pageNasa.lastIndexOf("explanation");
//        int explanationEnd = pageNasa.lastIndexOf("hdurl");
//        String explanation = pageNasa.substring(explanationBegin + 14, explanationEnd - 3/* или 8, три - правильно */);
//        System.out.println("Пояснение к фртографии: \n" + explanation);
//
//    }
//
//    private static String downloadWeBPage(String url) throws IOException {
//        StringBuilder result = new StringBuilder();
//        String line;
//        URLConnection urlConnection = new URL(url).openConnection();
//        try (InputStream is = urlConnection.getInputStream();
//             BufferedReader Br = new BufferedReader(new InputStreamReader(is))) {
//            while ((line = Br.readLine()) != null) {
//                result.append(line);
//            }
//        }
//        return result.toString();
//    }
//}
////        Конец Примера 4 КККККККККККККККК







////        Пример 3 ППППППППППППППППППППППППППППППППППП С ПЕРЕЗАПИСЬЮ С ЗАДАННОЙ ДАТОЙ !!!
////  Пример взят отсюда: https://www.youtube.com/watch?v=5V2lZpEeRlA  девушка на английском говорит
////  5 способов выполнения HTTP-запросов  https://javascopes.com/5-ways-to-make-http-requests-in-java-2p3-fca27bc8/
////  УТИЛИТА, КАК СКАЧАТЬ ФОТО NASA_Module1_Tema1_Urok9 видео мин 22.00, НО ЗДЕСЬ БЕЗ ДАТЫ
//public class Draft_Task1_3_6_7_Photo_NASA_РАБОТАЕТ_С_ДАТОЙ {
//    public static void main(String[] args) throws IOException {
//        System.out.println("Задание: \n.Сохраняйте снимки NASA с 1 января до того момента, пока в поле Explanation " +
//                "\nнет слова “Earth”\n\nРешение: ");
//
//
//        String pageNasa = downloadWeBPage("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&date=2019-10-14"); //  ВОТ ЗДЕСЬ ЗАДАЕТСЯ ДАТА
//        int urlBegin = pageNasa.lastIndexOf("url");
//        int urlEnd = pageNasa.lastIndexOf("}");
//        String urlPhoto = pageNasa.substring(urlBegin + 6, urlEnd - 1);
//        try (InputStream from = new URL(urlPhoto).openStream()) {
//            Path to = Paths.get("photo.jpg");  //  ЕСЛИ БЕЗ ПЕРЕЗАПИСИ, ТО ЭТА СТРОЧКА НЕ НУЖНА !
////            Files.copy(in, Paths.get("photo.jpg"));  //  ЭТО БЫЛО РАНЕЕ, БЕЗ ПЕРЕЗАПИСИ !
//            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
//        }
//
//        System.out.println("\n" + "Картинка сохранена!");
//
//        int explanationBegin = pageNasa.lastIndexOf("explanation");
//        int explanationEnd = pageNasa.lastIndexOf("hdurl");
//        String explanation = pageNasa.substring(explanationBegin + 14, explanationEnd - 3/* или 8, три - правильно */);
//        System.out.println("Пояснение к фртографии: \n" + explanation);
//
//    }
//
//    private static String downloadWeBPage(String url) throws IOException {
//        StringBuilder result = new StringBuilder();
//        String line;
//        URLConnection urlConnection = new URL(url).openConnection();
//        try (InputStream is = urlConnection.getInputStream();
//             BufferedReader Br = new BufferedReader(new InputStreamReader(is))) {
//            while ((line = Br.readLine()) != null) {
//                result.append(line);
//            }
//        }
//        return result.toString();
//    }
//}
////        Конец Примера 3 КККККККККККККККК







////        Пример 2 ППППППППППППППППППППППППППППППППППП С ПЕРЕЗАПИСЬЮ
////  5 способов выполнения HTTP-запросов  https://javascopes.com/5-ways-to-make-http-requests-in-java-2p3-fca27bc8/
////  УТИЛИТА, КАК СКАЧАТЬ ФОТО NASA_Module1_Tema1_Urok9 видео мин 22.00
//public class Draft_Task1_3_6_7_Photo_NASA_РАБОТАЕТ_С_ДАТОЙ {
//    public static void main(String[] args) throws IOException {
//        System.out.println("Задание: \n.Сохраняйте снимки NASA с 1 января до того момента, пока в поле Explanation " +
//                "\nнет слова “Earth”\n\nРешение: ");
//
//
//        String pageNasa = downloadWeBPage("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY");
//        int urlBegin = pageNasa.lastIndexOf("url");
//        int urlEnd = pageNasa.lastIndexOf("}");
//        String urlPhoto = pageNasa.substring(urlBegin + 6, urlEnd - 1);
//        try (InputStream from = new URL(urlPhoto).openStream()) {
//            Path to = Paths.get("photo.jpg");  //  ЕСЛИ БЕЗ ПЕРЕЗАПИСИ, ТО ЭТА СТРОЧКА НЕ НУЖНА !
////            Files.copy(in, Paths.get("photo.jpg"));  //  ЭТО БЫЛО РАНЕЕ, БЕЗ ПЕРЕЗАПИСИ !
//            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
//        }
//
//        System.out.println("\n" + "Картинка сохранена!");
//
//        int explanationBegin = pageNasa.lastIndexOf("explanation");
//        int explanationEnd = pageNasa.lastIndexOf("hdurl");
//        String explanation = pageNasa.substring(explanationBegin + 14, explanationEnd - 3/* или 8, три - правильно */);
//        System.out.println("Пояснение к фртографии: \n" + explanation);
//
//    }
//
//    private static String downloadWeBPage(String url) throws IOException {
//        StringBuilder result = new StringBuilder();
//        String line;
//        URLConnection urlConnection = new URL(url).openConnection();
//        try (InputStream is = urlConnection.getInputStream();
//             BufferedReader Br = new BufferedReader(new InputStreamReader(is))) {
//            while ((line = Br.readLine()) != null) {
//                result.append(line);
//            }
//        }
//        return result.toString();
//    }
//}
////        Конец Примера 2 КККККККККККККККК







////        Пример 1 ППППППППППППППППППППППППППППППППППП
//public class Draft_Task1_3_6_7_Photo_NASA_РАБОТАЕТ_С_ДАТОЙ {
//    public static void main(String[] args) throws IOException {
//        System.out.println("Задание: \n.Сохраняйте снимки NASA с 1 января до того момента, пока в поле Explanation " +
//                "\nнет слова “Earth”\n\nРешение: ");
//
//
//        String pageNasa = downloadWeBPage("https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY");
//        int urlBegin = pageNasa.lastIndexOf("url");
//        int urlEnd = pageNasa.lastIndexOf("}");
//        String urlPhoto = pageNasa.substring(urlBegin + 6, urlEnd - 1);
//        try (InputStream in = new URL(urlPhoto).openStream()) {
//            Files.copy(in, Paths.get("photo.jpg"));
//        }
//
//        System.out.println("\n" + "Картинка сохранена!");
//
//        int explanationBegin = pageNasa.lastIndexOf("explanation");
//        int explanationEnd = pageNasa.lastIndexOf("hdurl");
//        String explanation = pageNasa.substring(explanationBegin + 14, explanationEnd - 3/* или 8, три - правильно */);
//        System.out.println("Пояснение к фртографии: \n" + explanation);
//
//    }
//
//    private static String downloadWeBPage(String url) throws IOException {
//        StringBuilder result = new StringBuilder();
//        String line;
//        URLConnection urlConnection = new URL(url).openConnection();
//        try (InputStream is = urlConnection.getInputStream();
//             BufferedReader Br = new BufferedReader(new InputStreamReader(is))) {
//            while ((line = Br.readLine()) != null) {
//                result.append(line);
//            }
//        }
//        return result.toString();
//    }
//}//        Конец Примера 1 КККККККККККККККК







