public class Ball {
    public boolean condition;
    private String firm;
    private int price;

    public Ball(String a, int b, boolean c){
        firm = a;
        price = b;
        condition = c;
    }

    public Ball(int a, boolean c) {
        firm = "common";
        condition = c;
        price = a;
    }

    public Ball(int a){
        firm = "common";
        condition = true;
        price = a;
    }

    public void burst(){
        this.condition = false;
        System.out.println(firm + " was blown up by you. You're disgusting.");
    }
    public void showCoast(){
        System.out.println(this.price);
    }
    public void play(){
        if (this.condition) {
            System.out.println("You are playing with " + firm);
            int chance;
            chance = (int) (Math.random() * 7);
            if (chance == 0) {
                System.out.println("Oh, the ball burst, what a misfortune. You can't play with it anymore.");
            }
            this.condition = false;
        }
        else {
            System.out.println("You cant play with this ball.");
        }
    }
}
