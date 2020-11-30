public class CalculatorTest {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.setOperandOne(55);
        c.setOperation('-');
        c.setOperandTwo(19);
        c.performOperation();
        c.getResults();
    }
}