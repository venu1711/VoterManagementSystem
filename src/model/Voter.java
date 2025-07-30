package model;

public class Voter {
    private int id;
    private String name;
    private int age;
    private boolean voted;

    Voter(int id, String name, int age, boolean voted){
        this.id = id;
        this.name = name;
        this.age = age;
        this.voted = voted;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public boolean isVoted() {
        return voted;
    }
    public void setVoted(boolean voted){
        this.voted = voted;
    }
}
