package controller;

public class Ex4 {
    public static int FatorialDuplo(int N){
        if(N==1){
            return 1;
        }
        return N * FatorialDuplo(N - 2);
    }
}
