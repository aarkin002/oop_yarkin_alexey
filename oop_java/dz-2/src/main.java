import java.util.List;

public class main {
    public static void main(String[] args) {
        /** Создаем объекты классов **/
        Wall wall1 = new Wall(5);
        Wall wall2 = new Wall(20);
        Wall wall3 = new Wall(30);
        Wall wall4 = new Wall(40);
        Wall wall5 = new Wall(50);
        Wall wall6 = new Wall(60);
        Treadmill treadmill1 = new Treadmill(5);
        Treadmill treadmill2 = new Treadmill(10);
        Treadmill treadmill3 = new Treadmill(15);
        Treadmill treadmill4 = new Treadmill(20);
        Treadmill treadmill5 = new Treadmill(30);
        Treadmill treadmill6 = new Treadmill(40);
        Cat cat1 = new Cat("Barsik", 15, 10);
        People man1 = new People("Petr", 10, 20);
        Robot robot = new Robot("Robocop", 30, 40);
        Object[] sbjct = {cat1, man1, robot};
        Object[] obstacle = {wall1, wall2, wall3, wall4, wall5, wall6, treadmill1, treadmill2, treadmill3, treadmill4, treadmill5, treadmill6};

        /** Заставляем существо преодолевать препятствия **/

        for(Object sbj: sbjct){
            for(Object obs: obstacle){
                if(sbj instanceof Cat & obs instanceof Wall){((Cat) sbj).jump((Wall) obs);}
                if(sbj instanceof People & obs instanceof Wall){((People) sbj).jump((Wall) obs);}
                if(sbj instanceof Robot & obs instanceof Wall){((Robot) sbj).jump((Wall) obs);}
                if(sbj instanceof Cat & obs instanceof Treadmill){((Cat) sbj).run((Treadmill) obs);}
                if(sbj instanceof People & obs instanceof Treadmill){((People) sbj).run((Treadmill) obs);}
                if(sbj instanceof Robot & obs instanceof Treadmill){((Robot) sbj).run((Treadmill) obs);}
            }
        }
    }
}
