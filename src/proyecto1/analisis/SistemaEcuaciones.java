
package proyecto1.analisis;


public class SistemaEcuaciones {
    
    private float matriz [][];
    private int n;
    
    public SistemaEcuaciones(float matriz[][], int n){
        this.matriz = matriz;
        this.n = n;
    }
    
    public void gaussJordan(){
        
        for(int i = 0; i < this.n; i++){
            hacerColumna1(i);
            hacerFila0(i);
            hacerFila0Arriba(i);
        }
    }
        
    
    public void hacerColumna1(int i){
        float aux = this.matriz[i][i];
            if(this.matriz[i][0] != 1){
                for(int j = 0; j <= this.n; j++){
                    this.matriz[i][j] /= aux;
                    
                    if(j == n)
                        break;
                }
            }
    }
    
    public void hacerFila0(int i){
        
        for(int j = i+1; j<this.n; j++){
            //System.out.println("x: "+(i+j));
            /*if(j == this.n){
                break;
            }*/
            
            float aux = this.matriz[j][i];
            //System.out.println("aux: "+aux);
      
            for(int a = i; a<= this.n; a++){
                //System.out.println("Modificando columna: " + i);
                if(j < this.n){
                    //System.out.println("inicio: "+this.matriz[j][a]);
                    //this.matriz[i+j][a] = this.matriz[i+j][a] - (aux * this.matriz[i][a]);
                    this.matriz[j][a] = this.matriz[j][a] - (aux * this.matriz[i][a]);
                    //System.out.println("fin: "+this.matriz[j][a]);
                }
                    
                //System.out.println(this.matriz[j+i][i] + (-aux * this.matriz[i][a]));
                //System.out.println(this.matriz[i+j][a]);
                
            }
        }
    }
    
    public void hacerFila0Arriba(int i){
        //Si estamos en la primer Fila no hay casillas arriba
        if(i == 0)
            return;
        
        //Empezar con la columna de arriba (i-1)
        for(int j = i-1; j>= 0; j--){
            
            
            float aux = this.matriz[j][i];
            //System.out.println("aux: "+aux);
      
            for(int a = i; a<= this.n; a++){
                //System.out.println("Modificando columna: " + i);
                if(j < this.n){
                    this.matriz[j][a] = this.matriz[j][a] - (aux * this.matriz[i][a]);
                }
            }
        }
    }
    
    
    public void imprimirMatriz(){
        for(int i = 0; i < this.n; i++){
            for(int j = 0; j <= this.n; j++){
                System.out.print(this.matriz[i][j]+" * ");
            }
            System.out.println("");
        }  
    }
}
