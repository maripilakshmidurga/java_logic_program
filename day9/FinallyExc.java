// Finnally

class FinallyExc {
    public static void main(String[] args) {
        try {
            int a = 1000; 
            int b = 5000;
            int c = b / 0; 
            System.out.println("The Result Value is: " + c);
        } 
        catch (Exception e) {
            System.out.println("Error: " + e);
        } 
        finally { 
            System.out.println("Statement in Finally Block");
        }
    }
} {
    public static void main(String[] args) {
        try {
            int a = 1000; 
            int b = 5000;
            int c = b / 0; 
            System.out.println("The Result Value is: " + c);
        } 
        catch (Exception e) {
            System.out.println("Error: " + e);
        } 
        finally { 
            System.out.println("Statement in Finally Block");
        }
    }
}