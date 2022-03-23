public class p81 {
    public static void main(String[] args){
boolean reasult=issame(10000,1000000);
        System.out.println(reasult);

    }


    public static  boolean issame( byte a,byte b){
        if(a==b){
            return true;}
        else{
            return false;}}
//    或者直接return a==b;
    public static  boolean issame( short a,short b){
        if(a==b){
            return true;}
        else{
            return false;}}
    public static  boolean issame( int a,int b){
        if(a==b){
            return true;}
        else{
            return false;}}
    public static  boolean issame( long a,long b){
        if(a==b){
            return true;}
        else{
            return false;}}
}
