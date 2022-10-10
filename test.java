public class test {
    public static void main (String[] args){
        int calc = 0;
        double over = 0.0;
        int max = 0;
        for (int i = 0; i <= 50; i++ ){
          int average = randomWalk();
            if (average > max){
                max = average;
            }
            calc = calc + average;
        }

        over = calc / 50.0;
        
        System.out.println("Average Steps: " + (int) over);
        System.out.println("Max Steps: " + max);


    }


public static int randomWalk(){
    int position = 0;
    int numSteps = 0;

    while (position != 4 && position !=- 4){
        double rand = Math.random();
        if (rand > 0.5 ){
            position++;
            numSteps++;

        }else if (rand<=0.5){
            position--;
            numSteps++;
        }
    }
    if (position == 4 || position == -4){
        return numSteps;
    } else {
        return 0;
    }
}
}