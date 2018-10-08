/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spider;

/**
 *
 * @author Anum
 */
public class Spider {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BigSpider thisSpider=new BigSpider();
        thisSpider.legs=8;
        thisSpider.size=3.5;
        thisSpider.currentcolor=thisSpider.currentcolor.BLACK;
        thisSpider.currentmovement=thisSpider.currentmovement.LEFT;
        thisSpider.currentdirection=thisSpider.currentdirection.DOWN;
        thisSpider.changestate();
        System.out.println(thisSpider);
    }
    
}
