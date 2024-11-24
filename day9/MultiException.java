class MultiException {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt("123"); 
            int b = 5000;
            int c = b / 0; 
            System.out.println("The Result Value is: " + c);

            int[] d = new int[5]; 
            d[10] = 300; 
            System.out.println("The Value d[10] is: " + d[10]);
        } 
        catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + a);
        } 
        catch (ArithmeticException ae) {
            System.out.println("ArithmeticException occurred: " + ae);
        } 
        catch (Exception e) {
            System.out.println("General Exception occurred: " + e);
        }
    }
}