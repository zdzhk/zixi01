public class Text02_Game {
    public static void main(String[] args) {
        Snake s1=new Snake();
        s1.setName("蛇妖甲");
        s1.setHp(5);
        s1.setAtk(20);
        s1.attack();
        s1.liveadd();
        s1.move();
        System.out.println("=======================");
        Centipede c1=new Centipede();
        c1.setName("蜈蚣乙");
        c1.setHp(60);
        c1.setAtk(15);
        c1.attack();
        c1.move();

    }

}
class Guaiwu{
    private String name;
    private int hp;//生命值
    private int atk;//攻击力

    public Guaiwu() {
    }

    public Guaiwu(String name, int hp, int atk) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
    }
//方法
    //攻击
    public  void attack(){
        System.out.println("怪物"+this.name+"展开攻击");
        System.out.println("当前生命值是："+this.hp);
        System.out.println("攻击力是："+this.atk);
    }
    //移动
    public void move(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }
}
//蛇妖
class Snake extends Guaiwu{
    public int liveadd(){
        int nowhp = 0;
        if(getHp()<10){
          nowhp=getHp()+20;
          System.out.println("实施大蛇补血术。。。当前生命值是："+nowhp);
        }
        return nowhp;

    }
    @Override
    public void move() {
        System.out.println("我是蛇怪，我走S型路线");
    }
}

//蜈蚣类
class Centipede extends Guaiwu{
    @Override
    public void move() {
        System.out.println("我是蜈蚣精，御剑飞行");
    }
}
