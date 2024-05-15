package GenericPackage;

public class GenericClass<T, U> {
    public T datapertama;
    public U datakedua;
    
    public GenericClass(T datapertama, U datakedua) {
        this.datapertama = datapertama;
        this.datakedua = datakedua;
    }
    
    public void setDatapertama(T datapertama) {
        this.datapertama = datapertama;
    }
    
    public T getDatapertama() {
        return datapertama;
    }
    
    public void setDatakedua(U datakedua) {
        this.datakedua = datakedua;
    }
    
    public U getDatakedua() {
        return datakedua;
    }
}