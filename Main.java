package Geekbrains.lesson_5.homework;
/** Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
 * Конструктор класса должен заполнять эти поля при создании объекта;
 * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
 * Создать массив из 5 сотрудников
 Пример:
 Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
 persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
 persArray[1] = new Person(...);
 * С помощью цикла вывести информацию только о сотрудниках старше 40 лет;*/
public class Main {
 static final int Agmax = 40; //


    public static void main(String[] args) {


        Worker[] pers = new Worker[5];


        pers[0] = new Worker("Ivan Ivanov ", "Engineer", "ivivan@mailbox.com", "892312312", 300000, 30);

        pers[1] = new Worker("Sam Gold", "Designer",
                "Sam_Gold@mailbox.ru", "89530000001", 600000, 650);

        pers[2] = new Worker("Gerbert Shield", "Writer",
                "Gerbert_Shield@mailbox.ru", "89530000002", 500000, 850);

        pers[3] = new Worker("Tom Riddle", "Male nurse",
                "Anti_Garik@mailbox.ru", "89530000003", 400000, 120);
        pers[4] = new Worker("Harry Potter", "Doctor",
                "Anti_Tom@mailbox.ru", "89530000003", 400000, 25);


        for (int q = 0; q <pers.length ; q++) {
           if (pers[q].getAge() > Agmax) {
               System.out.println(pers[q].workers());

           }}
            }
}
