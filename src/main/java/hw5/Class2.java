package hw5;

public class Class2 {

    public static void main(String[] args) {
        /*Cat cat01 = new Cat("Персик", 12, "Рыжий");
        cat01.displayInfo();

        changeName(cat01, "Барсик");
        cat01.displayInfo();
    }

    static void changeName(Cat cat, String newName){
        cat.setName(newName);
    }

    static void changeCat(Cat cat){
        cat = new Cat("Персик", 4, "Белый");
            cat.setName("Бублик");
            cat.displayInfo();
    }
         */

        Staff[] staffArray = new Staff[5];
        staffArray[0] = new Staff("Сергеев Сергей", "Главный инженер", "sergey@gmail.com", 35, 45000);
        staffArray[1] = new Staff("Иванов Иван", "Заместитель директора", "ivan@gmail.com", 45, 50000);
        staffArray[2] = new Staff("Романов Роман", "Инженер", "roman@gmail.com", 20, 20000);
        staffArray[3] = new Staff("Петров Петр", "Разнорабочий", "petr@gmail.com", 42, 25000);
        staffArray[4] = new Staff("Алексеев Алексей", "Бухгалтер", "aleksey@gmail.com", 30, 40000);

        for (int i = 0; i < staffArray.length; i++){
            if (staffArray[i].age > 40){
                System.out.println("" + staffArray[i].fullName + ", " + staffArray[i].jobTitle + ", " + staffArray[i].eMail + ", " + staffArray[i].age + ", " +staffArray[i].salary);
            }
        }
    }
}
