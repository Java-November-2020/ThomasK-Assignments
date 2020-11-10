public class StringManipulatorTest{

    public static void main(String[] args) {

        StringManipulator manipulator = new StringManipulator();
        String export = manipulator.TrimAndConcat("    Hello     " , "     World    ");
        System.out.println(export); // Hello World

        char letter = 'a';
        Integer a = manipulator.GetIndexOrNull("Alphabet", 'a');
        System.out.println(a);

        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer b = manipulator.getIndexOrNull(word, subString);
        Integer c = manipulator.getIndexOrNull(word, notSubString);
        System.out.println(b); // 2
        System.out.println(c); // null

        String words = manipulator.ConcatSubstring("Hello", 1, 2, "world");
        System.out.println(words); // eworld
    }

}