package hw0;

/**
 * A SpaceAlien object stores and manipulates information about a race of
 * space aliens from another planet.
 * 
 * @author William Goble
 * @author Dickinson College
 * @version January 2024
 */

public class SlimeSpaceAlien extends SpaceAlien implements ZapsWithSlime {

    // New field to represent the color of the slime
    private String slimeType;

    public SlimySpaceAlien(String homePlanet, double distanceFromEarth, String slimeType) {
        super(homePlanet, distanceFromEarth);
        this.slimeType = slimeType;
    }

    
    @Override
    public void doGreeting() {
        super.doGreeting();
        System.out.println("We come with slime!");
    }

    // Implement the doSlimeZap method from ZapsWithSlime interface
    @Override
    public String doSlimeZap(int numHumans) {
        if (numHumans == 1) {
            return "Zap! Human covered with " + slimeType + " slime. Blech!";
        } else {
            return "Zap! Humans covered with " + slimeType + " slime. BLECHHHH!";
        }
    }

    // Implement the slimeWholeEarth method from ZapsWithSlime interface
    @Override
    public String slimeWholeEarth() {
        return "The Slime Star is activated. Earth is covered with " + slimeType + " slime!";
    }

    public static void main(String[] args) {
        SlimySpaceAlien slimyAlien = new SlimySpaceAlien("Slime World", 100, "Poison");
        slimyAlien.doGreeting();
        System.out.println(slimyAlien.doSlimeZap(3));
        System.out.println(slimyAlien.slimeWholeEarth());
    }
}

