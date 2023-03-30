public class MainA {
    public static void main(String[] args) {
        Fish pike = new Pike("Freshwater Pike");
        Fish carp = new Carp("Gold Carp");
        Fish catfish = new Catfish("Long Catfish");

        System.out.println(pike.getName() + " is a " + pike.getType());
        System.out.println(carp.getName() + " is a " + carp.getType());
        System.out.println(catfish.getName() + " is a " + catfish.getType());

        Swimmable[] swimmableFish = new Swimmable[] { (Swimmable) pike, (Swimmable) carp, (Swimmable) catfish };
        for (Swimmable fish : swimmableFish) {
            fish.swim();
        }
    }
}
