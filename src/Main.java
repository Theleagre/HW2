public class Main {
    public static void main(String[] args) {

        System.out.println("Задача1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        System.out.println("Задача2");
        dog += 4;
        System.out.println(dog);
        cat += 4;
        System.out.println(cat);
        paper +=4;
        System.out.println(paper);
        System.out.println("Задача3");
        dog -= 3.5;
        System.out.println(dog);
        cat -=1.6;
        System.out.println(cat);
        paper -= 7639;
        System.out.println(paper);
        System.out.println("Задача4");
        var friend = 19.0;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
        System.out.println("Задача5");
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /=3.5;
        System.out.println(frog);
        frog +=4;
        System.out.println(frog);
        System.out.println("Задание6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var boxers = boxer1 + boxer2;
        System.out.println("Вес двух боксеров " + boxers + " кг!");
        System.out.println("Задание7.1");
        var weightDifference = boxer2 - boxer1;
        System.out.println("Разница в весе боксеров составляет " +  weightDifference + " кг");
        System.out.println("Задание7.2");
        var weightDifference2 = (boxers + boxer1) % boxer1;
        System.out.println("Разница в весе по остаточному делению " + weightDifference2 + " кг");
        System.out.println("Задание8");
        var totalWork = 640;
        var workDay = 8;
        var workPeople = totalWork / workDay;
        System.out.println("Всего работников в компании – " + workPeople + " человек");
        workPeople += 94;
        totalWork = workDay * workPeople;
        System.out.println("Если в компании работает " + workPeople + " человек, то всего " + totalWork + " часов работы может быть поделено между сотрудниками");


    }
}