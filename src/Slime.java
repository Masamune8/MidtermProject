public final class Slime extends Character{
    public Slime(String name, int hp){
        super(name, hp);
    }
    @Override
    public void attack(Character target){
        System.out.println(this.name + "は体当たりで攻撃！" + target.name + "に５のダメージを与えた!");
        target.hp -= 5;
    }
}
