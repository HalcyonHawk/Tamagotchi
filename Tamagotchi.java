
public class Tamagotchi {
    static final int maxHunger = 10;
    static final int maxEnergy = 10;
    static final int maxCleanness = 10;
    static final int maxHealth = 10;
    
    private int hunger;
    private int energy;
    private int clean;
    private int health;

    public Tamagotchi(){
        this.hunger = maxHunger;
        this.energy = maxEnergy;
        this.clean = maxCleanness;
        this.health = maxHealth;
    }
     
    //actions- used to increase needs 
    public void play(){
        System.out.println("Tamagotchi played with a ball");
    }
    
    public int feed(){
        //hunger increased by 1
        if(hunger < maxHunger){
            System.out.println("Tamagotchi is fed");
            hunger++; 
        } else{
            System.out.println("Tamagotchi is already full");
        }
        return hunger;
    }
    
    public int sleep(){
        //energy reset to full, then turns back lights on
        if(energy < maxEnergy){
            energy = maxEnergy;
            System.out.println("Tamagotchi has slept");
        } else{
            System.out.println("Tamagotchi is not tired");
        }
        return energy;
    }
    
    public int giveMedicine(){
        //health increased by 1
        if(health < maxHealth){
            System.out.println("Tamagotchi is given medicine");
            health++; 
        } else{
            System.out.println("Tamagotchi is already healthy");
        }
        return health;
    }
    
    public int clean(){
        //clean increased by 1
        if(clean < maxCleanness){
            System.out.println("Tamagotchi is cleaned");
            clean++; 
        } else{
            System.out.println("Tamagotchi is already clean");
        }
        return clean;
    }
    
    //check on tamagotchi
    public void isHungry(){
        if(hunger < maxHunger){
            System.out.println("Tamagotchi is hungry");
        } else{
            System.out.println("Tamagotchi is full");
        }
    }
    
    public void isTired(){
        if(energy < maxEnergy){
            System.out.println("Tamagotchi is tired");
        } else{
            System.out.println("Tamagotchi is energetic");
        }
    }
    
    public void isClean(){
        if(clean < maxCleanness){
            System.out.println("Tamagotchi is unclean");
        } else{
            System.out.println("Tamagotchi is clean");
        }
    }
    
    public void isHealthy(){
        if(health < maxHealth){
            System.out.println("Tamagotchi is unwell");
        } else{
            System.out.println("Tamagotchi is healthy");
        }
    }
    
    //needs go down over time
    public void passTime(){
        hunger--;
        energy--;
        clean--;
        health--;
    }
}