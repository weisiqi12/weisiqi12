import java.util.Scanner;

public class p95 {
    public static void main(String[] args) {
        int[]arr={19,28,37,46,50};
        System.out.print("[");
for(int a=arr.length-1;a>=0;a--){
    if(a>0){System.out.print(arr[a]+",");}
    else{
        System.out.print(arr[a]+"]");
    }
}

    }
}
