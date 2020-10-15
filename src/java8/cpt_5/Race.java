package java8.cpt_5;

class Race {
    private String name;
    private String result;
    private Car[] startingGrid ;

    public Race(String name){
        setName(name);
        setResult("Unfinisched race");
        makeStatingGrid();
    }

    static public void main(String[] args){
        Race race = new Race("Singapore");
        race.runRace();

        System.out.println( race.getResult());
    }

    private void makeStatingGrid() {
        Driver one = new Driver("Vettel");
        Driver two = new Driver("Hamilton");
        Driver three = new Driver("Raikkonen");
        Driver four = new Driver("Bottas");

        Car carNumberOne = new Car("Ferrari", one);
        Car carNumberTwo = new Car("Mercedes", two);
        Car carNumberThree = new Car("Ferrari", three);
        Car carNumberFour = new Car("Mercedes", four);

        startingGrid = new Car[4];
        startingGrid[0] = carNumberOne;
        startingGrid[1] = carNumberTwo;
        startingGrid[2] = carNumberThree;
        startingGrid[3] = carNumberFour;
    }

    public void runRace(){
        int winningNumber = (int) (Math.random() *4);
        Car winner = startingGrid[winningNumber];
        String result = winner.getDetails();
        setResult(result);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = "The "+this.getName()+" winner is: " + result;
    }

    public Car[] getStartingGrid() {
        return startingGrid;
    }

    public void setStartingGrid(Car[] startingGrid) {
        this.startingGrid = startingGrid;
    }
}
