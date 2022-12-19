package ru.geekbrains.core.lesson1;

public class Course {
    private String courseTitle;
    private String result;
    private int memberStrenght;
    private int memberStamina;
    private int memberAgility;
    private int memberSpeed;
    private int strenghtDifficulty;
    private int staminaDifficulty;
    private int agilityDifficulty;
    private int speedDifficulty;

    public Course(String courseTitle, int strenghtDifficulty, int staminaDifficulty, int agilityDifficulty, int speedDifficulty) {
        this.courseTitle = courseTitle;
        this.strenghtDifficulty = strenghtDifficulty;
        this.staminaDifficulty = staminaDifficulty;
        this.agilityDifficulty = agilityDifficulty;
        this.speedDifficulty = speedDifficulty;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public int getStrenghtDifficulty() {
        return strenghtDifficulty;
    }

    public int getStaminaDifficulty() {
        return staminaDifficulty;
    }

    public int getAgilityDifficulty() {
        return agilityDifficulty;
    }

    public int getSpeedDifficulty() {
        return speedDifficulty;
    }

    public void courseInfo() {
        System.out.printf("Сложность испытания %s:\n", courseTitle);
        System.out.println("Требуемое значение силы для прохождения: " + strenghtDifficulty);
        System.out.println("Требуемое значение выносливости для прохождения: " + staminaDifficulty);
        System.out.println("Требуемое значение ловкости для прохождения: " + agilityDifficulty);
        System.out.println("Требуемое значение скорости для прохождения: " + speedDifficulty);

    }

    public String doIt(Team team) {
        result = "Название команды: "+ team.getTeamTitle()+ " \n";
        System.out.println(result);
        for(Member member : team.getMembers()){
            result += member.getName();
            System.out.print(result);
            int memberStrenght = member.getStrenght();
            int memberStamina = member.getStamina();
            int memberAgility = member.getAgility();
            int memberSpeed = member.getSpeed();
            courseResult(memberStrenght, memberStamina, memberAgility, memberSpeed);
        }
        return result;
    }

    public void courseResult(int memberStrenght, int memberStamina, int memberAgility, int memberSpeed) {
        if(memberStrenght >= strenghtDifficulty && memberStamina >= staminaDifficulty && memberAgility >= agilityDifficulty && memberSpeed >= speedDifficulty) {
            result = " прошел(а) испытание " + getCourseTitle() + " \n";
        } else {
            result = " не прошел(а) испытание " + getCourseTitle() + " \n";
        }

    }

}
