class RecTest{
    int values[];

    RecTest(int i){
        values =  new int[i];
    }

    void printArray(int i){
        if(i==1) return;
        else printArray(i-1);
        System.out.println((i-1)+" "+values[i-1]);
    }
}

public class Factorial {
    public static void main(String[] args) {
        RecTest ob = new RecTest(10);
        for(int i=0; i<10; i++) ob.values[i] = i;
        ob.printArray(10);
    }
    
}
    
