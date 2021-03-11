package Polymorphism;

// For explanation we will create all Classes inside same file, at the bottom the MAIN.
// Assigning Different functionality depending on the type of object that we created.
// Objects inherit from MOVIE, but each PLOT() has different functionality.

//    Classes:
    class Movie {
        private String name;

    public Movie(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String plot(){
        return "No plot here.";
    }
}

    class Jaws extends Movie {
        public Jaws(){
            super("Jaws");
        }
        public String plot(){
            return "A shark eats lots of people.";
        }
    }
    class IndependenceDay extends Movie{
        public IndependenceDay(){
            super("Independence Day");
        }
        @Override
        public String plot() {
            return "Aliens kills 'murica.";
        }
    }
    class MazeRunner extends Movie{
        public MazeRunner(){
            super("Maze Runner");
        }
        @Override
        public String plot() {
            return "Kids try to escape a maze.";
        }
    }
    class StarWars extends Movie{
        public StarWars(){
            super("Star Wars");
        }
        @Override
        public String plot() {
            return "Imperial Force vs Yoda.";
        }
    }
    class Forgetable extends Movie{
        public Forgetable(){
            super("Forgetable");
        }
    }

//    Main:
public class Main {
    public static void main(String[] args) {
        for (int i=1; i<11; i++){
            System.out.println("***");
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + "\nMovie: " + movie.getName() + "\nPlot: " + movie.plot());
        }

    }
    public static Movie randomMovie(){
        int randomNumber = (int)(Math.random()*5)+1; // Random between 1-5 (integer).
        System.out.println("Random Number Generated: " + randomNumber);
        switch (randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }
        return null;
    }
}



