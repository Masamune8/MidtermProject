public abstract class Character implements Creature {
    String name;
    int hp;

    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public final boolean isAlive() {
        if (hp <= 0) {
            return false;
        } else {
            return true;
        }
    }
    public void showStatus(){
        System.out.println(name + "hp" + hp);
    }

}