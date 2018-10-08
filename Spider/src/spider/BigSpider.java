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
public class BigSpider {
    int legs;
    double size;
    enum color{GREY,BLACK};
    enum movement{RIGHT,LEFT};
    enum direction {UP,DOWN};
    color currentcolor;
    movement currentmovement;
    direction currentdirection;
    public BigSpider(){
        this.legs=8;
        this.size=3.5;
        this.currentcolor=color.BLACK;
        this.currentmovement=movement.RIGHT;
        this.currentdirection=direction.UP;
    }
    void changestate(){
        switch (currentmovement){
            case RIGHT:
                this.currentmovement =movement.LEFT;
                System.out.println("The spider has change its movement from RIGHT to LEFT");
                break;
        }
        switch (currentdirection)
        {case UP:
            this.currentdirection=direction.DOWN;
            System.out.println("The Spiderhas changes its direction from UP to DOWN");
            break;
            
        }
        }
    public void show(){
        System.out.println();
        System.out.println(this.legs);
        System.out.println(this.size);
        System.out.println(this.currentcolor);
        System.out.println(this.currentmovement);
        System.out.println(this.currentdirection);
    }
    @Override
    public String toString(){
        System.out.println();
        System.out.println("Hi!I am Spider");
        return "Spider info:"+"The Spider has "+this.legs+" legs of size "+this.size+"cm of "+this.currentcolor+" color moving "+this.currentmovement+" & in the "+this.currentdirection+" direction";
    }
    }

    

