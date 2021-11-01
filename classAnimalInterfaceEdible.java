public class classAnimalInterfaceEdible {
    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        Tiger tiger =new Tiger();
        Orange orange = new Orange();
        Apple apple = new Apple();
        System.out.println(chicken.makeSound()+"\t"+chicken.howToEat());
        System.out.println(tiger.makeSound()+"\t"+chicken.howToEat());
        System.out.println(orange.howToEat());
        System.out.println(apple.howToEat());
    }
}