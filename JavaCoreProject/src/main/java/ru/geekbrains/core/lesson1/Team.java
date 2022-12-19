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

    //вывод информации о всех членах команды
    public Member[] getMembers() {
        return members;
    }





}
