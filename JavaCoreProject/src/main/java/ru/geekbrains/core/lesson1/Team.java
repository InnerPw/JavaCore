package ru.geekbrains.core.lesson1;

public class Team {

    private String teamTitle;
    private Member[] members;


    public Team(String teamTitle, Member[] members) {
        this.teamTitle = teamTitle;
        this.members = members;
    }

    //вывод названия команды
    public String getTeamTitle() {
        return teamTitle;
    }

    public Member[] getMembers() {
        return members;
    }

    //вывод информации о каждом члене команды
    public void teamInfo(Member[] members) {
        for (Member member : members) {
            System.out.println("Имя игрока: " + member.getName() + "; Сила: " + member.getStrenght()+ "; Выносливость: " + member.getStamina() + "; Ловкость: " + member.getAgility() +  "; Скорость: " + member.getSpeed());
        }
        System.out.println();
    }





}
