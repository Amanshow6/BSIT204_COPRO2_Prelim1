import java.util.Scanner;
import java.util.Random;
/*
 ---------------------------------ASSIGNMENT :)
 ----------SPORT---------
 sportName: String
 sportSettings: String
 sportType: String
 setSportName (String sportName): void
 setSportSettings (String sportPlace): void
 setSportType (String sportType): void
 getSportName():String
 getSportSettings():String
 getSportSettings():String
 readInput(): void
 writeOutput(): void
 -------------------------
 ----------Song---------
 songName: String
 songType: String
 songArtist: String
 setSongName (String title): void
 setSongType (String songGenre): void
 setSongArtist (String person): void
 getSongName():String
 getSongType():String
 getSongArtist():String
 readInput(): void
 writeOutput(): void
 -------------------------
 ----------Movie---------
 movieTitle: String
 movieGenre: String
 movie:Director: String
 setMovieTitle (String title): void
 setMovieGenre (String Genre): void
 setMovieDirector (String person): void
 getMovieTitle():String
 getMovieGenre():String
 getMovieDirector():String
 readInput(): void
 writeOutput(): void
 -------------------------
  */



class Pokemon {
private String name;
private int health;
private int damage;

public Pokemon (String name, int health, int damage) {
this.name = name;
this.health = health;
this.damage = damage;

}

public String getName() {
return this.name;
}
public int getHealth() {
return this.health;
}
public int getDamage() {
return this.damage;
}

public void setHealth(int health) {
this.health = health;
}
public void setDamage(int damage) {
this.damage = damage;
}
}
//--------------------------------------------------------------------------------
//class for Abilities
class Skills {
private String attack1, attack2, attack3, attack4;

public Skills(String attack1, String attack2, String attack3, String attack4) {
this.attack1 = attack1;
this.attack2 = attack2;
this.attack3 = attack3;
this.attack4 = attack4;
}
public String getAttack1() {
return this.attack1;
}
public String getAttack2() {
return this.attack2;
}
public String getAttack3() {
return this.attack3;
}
public String getAttack4() {
return this.attack4;
}
public void setAttack1(String attack1) {
this.attack1 = attack1;
}
public void setAttack2(String attack2) {
this.attack2 = attack2;
}
public void setAttack3(String attack3) {
this.attack3 = attack3;
}
public void setAttack4(String attack4) {
this.attack4 = attack4;
}

}
//-------------------------------------------------------------------------------





 class Poke {

public static void main(String[] args) {
Random rand  = new Random ();
Scanner scan = new Scanner(System.in);
//enemies
String [] enemy_choices = {"Marvinous","Amanshow","SanWhoSee","Mjet","Seanite"};
int random_enemy = rand.nextInt(enemy_choices.length);
String Enemy = enemy_choices[random_enemy];

//player
String Player = "pikachu";
System.out.println ("Pikachu is againts " + Enemy + "!!!");
System.out.println("Get ready to battle! \n");


Pokemon enemy = new Pokemon (Enemy,100, 0);
Pokemon player = new Pokemon (Player, 100, 0);
Skills pikachu_skills = new Skills ("Electrocute","Thunderbolt","Meralco Bill","Brown Out");
Skills random_skills = new Skills ("","","","");

while (enemy.getHealth() > 0 && player.getHealth() > 0){

System.out.println(Enemy +"'s health is " + enemy.getHealth());
System.out.println("Pikachu's health is " + player.getHealth() + "\n");

//constructor for enemy and player's abilities
Random player_abilities = new Random();
Random enemy_abilities =new Random();
int [] player_attack1 = {0,5,25};
int [] player_attack2 = {0,10,20};
int [] player_attack3 = {0,15,15};
int [] player_attack4 = {0,40,0};

int [] enemy_attack1 = {0,5,25};
int [] enemy_attack2 = {0,10,20};
int [] enemy_attack3 = {0,15,15};
int [] enemy_attack4 = {0,40,0};

//player random damage
int player_damage1 =  player_abilities.nextInt(player_attack1.length);

int player_damage2 =  player_abilities.nextInt(player_attack2.length);
int player_damage3 = player_abilities.nextInt(player_attack3.length);
int player_damage4 =  player_abilities.nextInt(player_attack4.length);

//enemy random damage
int enemy_damage1 =  enemy_abilities.nextInt(enemy_attack1.length);
int enemy_randDamage1 = enemy_attack1[enemy_damage1];

int enemy_damage2 =  enemy_abilities.nextInt(enemy_attack2.length);
int enemy_randDamage2 = enemy_attack2[enemy_damage2];

int enemy_damage3 = enemy_abilities.nextInt(enemy_attack3.length);
int enemy_randDamage3 = enemy_attack3[enemy_damage3];

int enemy_damage4 =  enemy_abilities.nextInt(enemy_attack4.length);
int enemy_randDamage4 = enemy_attack4[enemy_damage4];


System.out.println("\t choose your move");
System.out.println("\t[1]. Electrocute\t[2]. Thunderbolt\t[3]. Meralco Bill\t[4]. Brown Out");

//final skill choice
int input;
switch (scan.nextInt()){
case 1: input = player_attack1[player_damage1];
       
break;
case 2: input = player_attack2[player_damage2];
break;
case 3: input = player_attack3[player_damage3];
break;
case 4: input = player_attack4[player_damage4];
default: input = player_attack1[player_damage1];
}

//skill set
if (Enemy.equals("Marvinous")) {
random_skills.setAttack1("Trashtalk");
random_skills.setAttack2("Moneypressure");
random_skills.setAttack3("Existence Erasure");
random_skills.setAttack4("Critical Judgement");
}
else if (Enemy.equals("Amanshow")) {
random_skills.setAttack1("Killer Smile");
random_skills.setAttack2("Poisonous Fart");
random_skills.setAttack3("Bisaya Punch");
random_skills.setAttack4("Yawa curse");
}
else if (Enemy.equals("MarKing")) {
random_skills.setAttack1("Kubo Cornering");
random_skills.setAttack2("Beki Curse Transfusion");
random_skills.setAttack3("Silent Blinding");
random_skills.setAttack4("Jan Jan Summon ");
}
else if (Enemy.equals("Mjet")) {
random_skills.setAttack1("Shining Forehead");
random_skills.setAttack2("Hair Snare");
random_skills.setAttack3("Flirty inside");
random_skills.setAttack4("Fast Shifting");
}
else if (Enemy.equals("Seanite")) {
random_skills.setAttack1("Beki Bomb");
random_skills.setAttack2("Beki Charisma");
random_skills.setAttack3("Invisible Existence");
random_skills.setAttack4("Mysterious Passing");
}

System.out.println("You choose "  + pikachu_skills.getAttack1());

if ( input == player_attack1[player_damage1]) {
System.out.println(Player + " uses" + pikachu_skills.getAttack1());
System.out.println(Enemy + " takes" + input + " damage!");
enemy.setHealth(enemy.getHealth() - input);
System.out.println("-----");
System.out.println(Enemy + "uses" + enemy.getDamage());
System.out.println(Player + "takes" + input + " Damage!");
player.setHealth(player.getHealth() - enemy_randDamage1);

}
else if ( input == player_attack2[player_damage2]) {
System.out.println(Player + " uses" + pikachu_skills.getAttack2());
System.out.println(Enemy + " takes" + input + " damage!");
enemy.setHealth(enemy.getHealth() - input);
System.out.println("-----");
System.out.println(Enemy + "uses" + enemy.getDamage());
System.out.println(Player + "takes" + input + " Damage!");
player.setHealth(player.getHealth() - enemy_randDamage2);

}
else if ( input == player_attack3[player_damage3]) {
System.out.println(Player + " uses" + pikachu_skills.getAttack3());
System.out.println(Enemy + " takes" + input + " damage!");
enemy.setHealth(enemy.getHealth() - input);
System.out.println("-----");
System.out.println(Enemy + "uses" + enemy.getDamage());
System.out.println(Player + "takes" + input + " Damage!");
player.setHealth(player.getHealth() - enemy_randDamage3);

}
else if ( input == player_attack4[player_damage4]) {
System.out.println(Player + " uses" + pikachu_skills.getAttack4());
System.out.println(Enemy + " takes" + input + " damage!");
enemy.setHealth(enemy.getHealth() - input);
System.out.println("-----");
System.out.println(Enemy + "uses" + enemy.getDamage());
System.out.println(Player + "takes" + input + " Damage!");
player.setHealth(player.getHealth() - enemy_randDamage4);

}
System.out.println("------");


if (enemy.getHealth() <= 0) {
System.out.println(Enemy + " has Fainted");
System.out.println("YOU WIN");
}
else if (player.getHealth() <= 0) {
System.out.println(Player + " has Fainted");
System.out.println("YOU LOSE");
}

}

}
}