package funcaofatorial;

/**
 * @since 15/11/2023
 * @author myckazs
 */
public class Fatorial {
    
    private int num = 0;
    private int fat = 1;
    private String formula = " ";
    
    public void setValor(int v){
        num = v;
        int f = 1;
        String s = " ";
        for(int c = v; c > 1; c--){
            f*=c;
            s+=c + " x ";
        }
        s += "1 = ";
        fat = f;
        formula = s;
    }
    
    public int getFatorial(){
        return fat;
    }
    public String getFormula(){
        return formula;
    }
}
