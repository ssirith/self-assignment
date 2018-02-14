/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heroesbattle;

/**
 *
 * @author INT102
 */
public class Hero {
    private String name;
    private int health;
    private Armor armor;
    private Weapon weapon;

    public Hero(String name, int health, Armor armor, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.armor = armor;
        this.weapon = weapon;
    }
    public void changeArmor(){
       
            this.armor = armor;
        
    }
    public  void ChangeWeapon(){
       
            this.weapon = weapon;
        
    }
    public int getAttactPower(){
        int power = weapon.getPower();
        return power;
        
    }
    public void attacted(int power){
        this.health-= (power-this.armor.getArmor());
    }
    public void attacted(Hero enemy){
        this.health-= (enemy.getAttactPower()-this.armor.getArmor());
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    void changeWeapon(Weapon batarangs) {
        this.weapon = batarangs;
    }

    void changeArmor(Armor batSuit) {
        this.armor = batSuit;
    }

    

   

    
}
