package Main;

public class Animals {
    public String name;
    public int howManyTimeItEats;




    public Animals() {

    }

    public Animals(int howManyTimeItEats) {

        this.howManyTimeItEats = howManyTimeItEats;
    }

    public Animals(String name) {

        this.name = name;
    }


    public static int add(int howManyTimeItEats){
        return howManyTimeItEats * 2;

    }

    public int getHowManyTimeItEats() {
        return howManyTimeItEats;
    }

    public void setHowManyTimeItEats(int howManyTimeItEats) {
        this.howManyTimeItEats = howManyTimeItEats;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        Animals other = (Animals) obj;
        return this.name == ((Animals) obj).name && this.howManyTimeItEats == ((Animals) obj).howManyTimeItEats;

    }
}
