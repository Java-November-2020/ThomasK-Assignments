public class ProjectTest {

    public static void main(String[] args) {
        Project var1 = new Project();
        Project var2 = new Project("John Lennon");
        Project var3 = new Project("name", "description");
        Project elevatorPitchTest = new Project("Keanu Reeves", "I loved him in the John Wick Movies");
        var1.setName("Pope John Paul II");
        var1.setDescription("Variable test dialog");

        System.out.println(var1.getName());
        System.out.println(var1.getDescription());
        System.out.println(var1.elevatorPitch());

        System.out.println(var2.getName());

        System.out.println(var3.getName());
        System.out.println(var3.getDescription());
        System.out.println(var3.elevatorPitch());

        System.out.println(elevatorPitchTest.elevatorPitch());


    }

}