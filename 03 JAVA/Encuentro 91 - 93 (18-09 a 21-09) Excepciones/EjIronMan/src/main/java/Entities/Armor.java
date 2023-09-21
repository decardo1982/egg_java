package Entities;

public class Armor{
    protected int resistence;
    protected int health;
    protected float energy = 100000; //Float.MAX_VALUE;
    protected int use;
    protected boolean damaged;
    protected Helmet helmet;
    protected Gloves gloves;
    protected Boots boots;


    public int getResistence() {
        return resistence;
    }

    public void setResistence(int resistence) {
        this.resistence = resistence;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public float getEnergy() {
        return energy;
    }

    public void setEnergy(float energy) {
        this.energy = energy;
    }

    public int getUse() {
        return use;
    }

    public void setUse(int use) {
        this.use = use;
    }

    public boolean isDamaged() {
        return damaged;
    }

    public void setDamaged(boolean damaged) {
        this.damaged = damaged;
    }

    public Helmet getHelmet() {
        return helmet;
    }

    public void setHelmet(Helmet helmet) {
        this.helmet = helmet;
    }

    public Gloves getGloves() {
        return gloves;
    }

    public void setGloves(Gloves gloves) {
        this.gloves = gloves;
    }

    public Boots getBoots() {
        return boots;
    }

    public void setBoots(Boots boots) {
        this.boots = boots;
    }

    @Override
    public String toString() {
        return "Armor{" +
                "resistence=" + resistence +
                ", health=" + health +
                ", use=" + use +
                ", helmet=" + helmet +
                ", gloves=" + gloves +
                ", boots=" + boots +
                '}';
    }

    public int energyConsumption(){ return 0; };
}
