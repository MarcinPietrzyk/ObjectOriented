package ObjectOriented;

import java.util.Date;

public class Microwave {

    public interface MicrowaveOven{
        void start();
        void setDuration(int durationInSeconds);
        boolean isFinished();
        void setPower(int power);
        default String getName(){
            return "Microwave Oven";
        }
    }

    public interface Clock{
        long secondsElapsedSince(Date date);
    }

    public class BrokenClock implements Clock{
        public long secondsElapsedSince(Date date){
            return 500;
        }
    }

}
