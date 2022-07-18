public class Doctor {

    public static void main(String[] args) {
        Doctor[] doctors = new Doctor[5];
        for(int i=0;i<5;i++){
            if(i%2==0)
                doctors[i] = new Surgeon();
            else
                doctors[i] = new Generalist();
        }
        for(int i=0;i<5;i++){
            if(doctors[i] instanceof Surgeon)
                System.out.println("Surgeon");
            else
                System.out.println("Generalist");
        }
    }

    String name;

    public Doctor(String name){
        this.name = name;
    }

    public Doctor(){}

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Surgeon extends Doctor{
    String expertise;

    public Surgeon(String name, String expertise) {
        super(name);
        this.expertise = expertise;
    }

    public Surgeon() {}


    @Override
    public String toString() {
        return "Surgeon{" +
                "name='" + name + '\'' +
                ", expertise='" + expertise + '\'' +
                '}';
    }
}

class Generalist extends Doctor{
    int noPatients;

    public Generalist(String name, int noPatients) {
        super(name);
        this.noPatients = noPatients;
    }

    public Generalist() {}

    @Override
    public String toString() {
        return "Generalist{" +
                "name='" + name + '\'' +
                ", noPatients=" + noPatients +
                '}';
    }
}
