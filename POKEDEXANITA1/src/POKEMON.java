
/**
 *
 * @author USER
 */
public class POKEMON {
    
    private int id;
    private String name;
    private String type1;
    private String type2;
    private int total;
    private int hp;
    private int attack;
    private int defense;
    private int spattk;
    private int spdef;
    private int speed;
    private int generation;
    private boolean legendary;
    private float height;
    private float weight;

    public POKEMON(int id, String name, String type1, String type2, int total, int hp, 
                   int attack, int defense, int spattk, int spdef, int speed, int generation, 
                   boolean legendary, float height,float weight) {
        this.id = id;
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.total = total;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.spattk = spattk;
        this.spdef = spdef;
        this.speed = speed;
        this.generation = generation;
        this.legendary = legendary;
        this.height = height;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getType1() {
        return type1;
    }
    public String getType2() {
        return type2;
    }
    public int getTotal() {
        return total;
    }
    public int getHp() {
        return hp;
    }
    public int getAttack() {
        return attack;
    }
    public int getDefense() {
        return defense;
    }
    public int getAttk() {
        return spattk;
    }
    public int getSpDef() {
        return spdef;
    }
    public int getSpeed() {
        return speed;
    }
    public int getGeneration() {
        return generation;
    }
    public boolean isLegendary() {
        return legendary;
    }
        public float getHeight() {
        return height;
    }
        public float getWeight() {
        return weight;
    }
}