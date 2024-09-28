public class Zoo {
    Animal[] animals = new Animal[25] ;
    String name ;
    String city ;
    public static int nombreAnimaux=0 ;
    final int nbrCages =25;
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
    public boolean addAnimal(Animal animal){
        for(int i=0;i<animals.length;i++){
            if(animals[i]==null && searchAnimal(animal)==-1 && i<animals.length){
                animals[i]=animal;
                nombreAnimaux++;
                return  true;

            }


        }

        return false;
    }
    public void afficheAnimals(){
        for(Animal a :animals) {
            if (a != null) {
                System.out.println("name: " + a.name + " family : " + a.family + " age: " + a.age + " is Mammal: " + a.isMammal);
            }
        }

    }
    public int searchAnimal(Animal animal){
        for(int i=0;i<animals.length;i++){
            if(animals[i] != null && animals[i].name.equals(animal.name)){
                return i;}
        }
        return -1;
    }
    public boolean removeAnimal(Animal animal){
        int k=searchAnimal(animal);
        if (k!=-1){
            for(int i=k ; i<animals.length;i++) {
                if(animals[i]!=null)
                    animals[i]=animals[i+1];



            }
            return true;}
        else
            return false;


    }
    public boolean isZooFull(){
        for (Animal animal : animals){
            if(animal!=null)
                return true;
        }
        return false;
    }
    public Zoo comparerZoo(Zoo z1 , Zoo z2){
        int k=0;
        int f=0;
        for(int i=0;i<z1.animals.length;i++){
            if(z1.animals[i]!=null)
                k++;

        }
        for(int j=0;j<z2.animals.length;j++){
            if(z2.animals[j]!=null){
                f++;
            }
        }
        if (k>f)
            return z1;
        else if(f>k)
            return z2;
        else
            return null ;

    }



    public static void main(String[] args) {
        // write your code here
        Animal a = new Animal("cat","lion",25,true);
        Zoo zoo = new Zoo("zoo1","Tunis");
        System.out.println(zoo.displayZoo(zoo.name, zoo.city, zoo.nbrCages));
        System.out.println(zoo);

        System.out.println(zoo.toString());
        Animal b = new Animal("cat","cat",25,true);
        zoo.addAnimal(b);
        zoo.afficheAnimals();
        Animal c = new Animal("cat","tiger",26,true);
        zoo.addAnimal(c);
        System.out.println(zoo.searchAnimal(c));
        System.out.println(zoo.searchAnimal(a));
        Animal d = new Animal("cat","tiger",26,true);
        System.out.println(zoo.addAnimal(d));
        zoo.afficheAnimals();
        System.out.println(zoo.searchAnimal(d));
        Animal e = new Animal("loup","chien",26,true);
        zoo.addAnimal(e);

        zoo.removeAnimal(e);
        zoo.afficheAnimals();








    }

}
