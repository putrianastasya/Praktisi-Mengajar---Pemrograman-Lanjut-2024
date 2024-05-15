package GenericPackage;

public class GenericOne <T> {
     
    public T data; 
    
    public GenericOne (T data) {
        this.data = data;
    }
    
    public void setdata (T data){
        this.data = data;
    }
    
    public T getdata (){
        return data;
    }
    
    
    
}
