package nyc.c4q.hakeemsackesbramble;

/**
 * Created by hakeemsackes-bramble on 8/31/16.
 */
public interface Vehicle{  //interface methods cannot be static because i

    double applyBrakes();
    double speedUp(int delta);
    double slowDown(int delta);
}

