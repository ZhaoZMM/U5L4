public class Dragon {
    private int hp;
    private int atk;
    private int lvl;
    private boolean isDead;
    private int every50;

    public Dragon(){
        hp=100;
        atk=1;
        lvl=1;
    }
    public void takeDmg(){
        int dmgDealt = (int)(Math.random()*25+(hp/2-25));
        hp-=dmgDealt;
        if (!isDead){
            if(hp<=0){
                System.out.println("The dragon has been slayed!");
                hp=0;
                isDead = true;
            }else{
                System.out.println("The dragon takes" +dmgDealt +"damage and now has"+ hp +"health";
            }
        }else{
            System.out.println("The dragon is already dead!");
        }
    }
    public int attack(){
        int dmg = lvl*atk;
        every50 += dmg;
        System.out.println("The dragon attacks for"+dmg+"health points!");
        lvl += (int)every50/50;

        return dmg;
    }

}
