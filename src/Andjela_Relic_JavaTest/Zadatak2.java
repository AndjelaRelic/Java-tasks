package Andjela_Relic_JavaTest;

public class Zadatak2 {
    //(a) [15] Napisati funkciju daLiSuIsti koja prima 3 niza realnih brojeva i
    //vraca odgovor na pitanje da li su oni medjusobno jednaki
    //(a) [15] Write a function whetherList that receives 3 sequences of real numbers i
    //returns the answer to the question whether they are equal to each other
    static boolean daLiSuIsti (double[] niz1, double[]niz2,double[]niz3){

        if ((niz1.length!=niz2.length) || (niz1.length!=niz3.length)){
            return false;
        }
        for (int i = 0; i <niz1.length; i++) {

            if (niz1[i] != niz2[i] || niz1[i] != niz3[i]){
                return false;
            }
        }
        return true;

    }

    //] Napisati funkciju daLiSuIstiOgledalo koja prima 2 niza realnih
    //brojeva i vraca odgovor na pitanje da li su oni isti u slucaju kada drugi
    //niz posmatramo od pozadi

    static boolean daLiSuIstiOgledalo (double [] niz1,double[] niz2){
        if (niz1.length != niz2.length){
            return false;
        }
        for (int i = 0; i <niz1.length; i++) {
            if(niz1[i] != niz2[niz1.length-i-1]){
                return false;
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args) {


        //Input : [3.14 , 2.71 , 9.81] , [3.14 , 2.71 , 9.81] , [3.14 ,
        //2.71 , 9.81]
        //2 Output : true

        double [] n1 = {3.14 , 2.71,  9.81};
        double [] n2 = {3.14 , 2.71 , 9.81};
        double [] n3 = {3.14 ,2.71 , 9.81};

        boolean b = daLiSuIsti(n1,n2,n3);
        System.out.println(b);


        //1 Input : [3.14 , 2.71 , 9.81] , [3.14 , 2.71 , 9.81]
        //2 Output : false
        //Primer b)
        //1 Input : [3.14 , 2.71 , 9.81] , [9.81 , 2.71 , 3.14]
        //2 Output : true

        double [] o1 = {3.14 , 2.71 , 9.81};
        double [] o2 = {9.81 , 2.71 , 3.14};
        boolean o = daLiSuIstiOgledalo(o1,o2);
        System.out.println(o);
    }
}
