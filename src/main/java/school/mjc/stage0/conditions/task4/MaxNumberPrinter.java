package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int max1;
        if(first >= second){max1 = first;}
        else{
            max1 = second;
        }
        if(max1 >= third){
            System.out.println(max1);
        }
        else{
            System.out.println(third);
        }

    }
}
