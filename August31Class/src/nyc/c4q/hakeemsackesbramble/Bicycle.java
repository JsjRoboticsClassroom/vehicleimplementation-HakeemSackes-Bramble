package nyc.c4q.hakeemsackesbramble;

/**
 * Created by hakeemsackes-bramble on 8/31/16.
 */


/*
interface syntax:  CHALLENGE:-- use in game
 */
public class Bicycle implements Vehicle{
    public double initialSpeed; //if you dont specify its auto private
    public Bicycle(){
    }
    public Bicycle(double speed){  //this is a constructor, it provides a value name for the class
        this.initialSpeed = speed;
    }
    @Override
    public double applyBrakes(){
        initialSpeed = 0;
        return initialSpeed;
    }

    @Override
    public double speedUp(int delta){
        initialSpeed += delta;
        return initialSpeed;
    }

    @Override
    public double slowDown(int delta){
        initialSpeed -= delta;
        return initialSpeed;
    }

}
