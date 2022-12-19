package ru.geekbrains.core.lesson1;

public class Main {
    public static void main(String[] args) {

        Member[] members = new Member[4];
        members[0] = new Member("Иван", 4, 4, 4, 4);
        members[1] = new Member("Николай", 3, 5, 5, 3);
        members[2] = new Member("Марина", 2, 2, 4, 5);
        members[3] = new Member("Александр", 5, 5, 3, 1);

        Team Arrow = new Team("Стрела", members);

        Course Mass = new Course("Абсолютная масса", 5, 4, 1, 1);
        Course Effect = new Course("Эффективность", 3, 4, 3, 3);
        Course Light = new Course("Легкость", 1, 2, 4, 4);

        Arrow.teamInfo(members);

        Mass.courseInfo();
        System.out.println(Mass.doIt(Arrow));

        Effect.courseInfo();
        System.out.println(Effect.doIt(Arrow));

        Light.courseInfo();
        System.out.println(Light.doIt(Arrow));

        Arrow.getMembers();



    }
}
