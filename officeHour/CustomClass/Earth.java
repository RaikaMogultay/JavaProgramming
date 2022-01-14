package CustomClass;

public class Earth {
    public static void main(String[] args) {

        AnimalSpecies dogs = new AnimalSpecies();
        dogs.growthRate=10;
        dogs.name= "Fistik";
        dogs.population = 50;

        dogs.setInfo("fistik",50,10);
        System.out.println(dogs.getGrowthRate());
        System.out.println("dogs.getName() = " + dogs.getName());
        System.out.println("dogs.getPopulation() = " + dogs.getPopulation());


    }
}
