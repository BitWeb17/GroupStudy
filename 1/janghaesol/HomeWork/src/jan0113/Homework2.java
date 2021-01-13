package jan0113;
class common{
    private String size;
    private String name;
    private String species;
    private String enginePA;

    public common(String size,String name,String species,String enginePA) {
        this.size = size;
        this.name = name;
        this.species = species;
        this.enginePA = enginePA;
    }
        public String getSize() {
            return size;
        }
        public String getName() {
            return name;
        }

        public String getSpecies() {
            return species;
        }
        public String getenginePA(){
            return enginePA;
        }

    @Override
    public String toString() {
        return "common{" +
                "size='" + size + '\'' +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", enginePA='" + enginePA + '\'' +
                '}';
    }
}

class overseas extends common {
    private String canFishingOrNot ;

    public overseas(String size,String name,String species,String enginePA, String canFishingOrNot) {
        super(size, name, species, enginePA);
        this.canFishingOrNot = canFishingOrNot;
    }

    public void test(){
        System.out.println(super.getName());
    }


    }

public class Homework2 {
    public static void main(String[] args) {

    }
}
