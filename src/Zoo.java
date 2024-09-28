public class Zoo {
    Animal[] animals = new Animal[25] ;
    String name ;
    String city ;

    int nbrCages =25;
    public Zoo(String name , String city ){
        this.name = name ;
        this.city = city ;





    }
    public String displayZoo(String name, String city , int nbrCages)
    {
        return  "name :"+name+" city :"+city+"nbr cages :"+nbrCages;
    }
    @Override
    public String toString()
    {
        return  "name :"+name+" city :"+city+"nbr cages :"+nbrCages;
    }




    public static void main(String[] args) {
        // write your code here
        Animal a = new Animal("cat", "lion", 25, true);
        Zoo zoo = new Zoo("zoo1", "Tunis");
        System.out.println(zoo.displayZoo(zoo.name, zoo.city, zoo.nbrCages));
        System.out.println(zoo);

        System.out.println(zoo.toString());
    }
}
