public class Main {
    public static void main(String[] args)
    {
    double spring_cost = 210.12;
    double summer_cost = 150.32;
    double fall_cost = 165.51;
    double winter_cost = 311.81;

        System.out.println("Enter the cost of maintenance for each season: ");
        System.out.println("The cost for Spring is: " + spring_cost);
        System.out.println("The cost for Summer is: " + summer_cost);
        System.out.println("The cost for Fall is: " + fall_cost);
        System.out.println("The cost for Winter is: " + winter_cost);

        System.out.println("The total yearly cost of maintenance is: " + (spring_cost + summer_cost + fall_cost + winter_cost));

    }
}