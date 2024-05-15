package GenericPackage;

public class GenericMain {
    public static void main (String [] args) {
    
        
        GenericClass<String, Integer> data1 = new GenericClass<>("Hello World", 123);
    
        GenericOne <Integer> angka1= new GenericOne <> (40);
        GenericOne <Integer> angka2 = new GenericOne <> (20);
            
        System.out.println(data1.getDatapertama());
        System.out.println(angka1.getdata() + angka2.getdata());
        
        
        }
}
