/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package histograma;
import java.util.*;

/**
 *
 * @author Andrés Jiménez
 */
public class Histograma {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        Map<Integer,Integer> histograma=new HashMap<>();
            int [] data={1,1,1,0,1,2,1,0,3};
            for(int i=0;i<data.length;i++){
                if(histograma.containsKey(data[i])){
                    histograma.put(data[i],histograma.get(data[i])+1);
                    
                }else{
                    histograma.put(data[i],1);
                }    
            }
            for(Map.Entry<Integer,Integer> e : histograma.entrySet()){
                System.out.println(e.getKey()+":"+e.getValue());
            }    
    }
}
