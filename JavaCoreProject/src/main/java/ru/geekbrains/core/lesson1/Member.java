package ru.geekbrains.core.lesson1;

public class Member {
    private String name;
    private int strenght;
    private int stamina;
    private int agility;
    private int speed;

    public Member(String name, int strenght, int stamina, int agility, int speed) {
        this.name = name;
        this.strenght = strenght;
        this.stamina = stamina;
        this.agility = agility;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getStrenght() {
        return strenght;
    }

    public int getStamina() {
        return stamina;
    }

    public int getAgility() {
        return agility;
    }

    public int getSpeed() {
        return speed;
    }

    //
    //вывод информации о члене команды
    public void teamMemberInfo() {
        System.out.println("Имя игрока: " + name + "; Сила: " + strenght+ "; Выносливость: " + stamina + "; Ловкость: " + agility +  "; Скорость: " + speed);
    }
}
