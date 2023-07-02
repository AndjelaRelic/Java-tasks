package Andjela_Relic_JavaTest;

public class Zadatak1 {

    //1. [40] Napisati funkciju najmanjiOdCetiri koja prima 4 niza celih brojeva i
    //vraca najmanji broj medju ta 4 prosledjena niza.
    //1. [40] Write the function smallestOfFour that receives 4 sequences of integers i
    //returns the smallest number among the 4 passed strings.
    //Primer a)
    //1 Input : [1 , 2 , 3 , 4 , 5] , [6 , 7 , -1 , 0] , [9 , 10] ,[11 , 12]
    //2 Output : -1
    //Primer b)
    //1 Input : [5 , 4 , 3 , 2 , 1 , 0 , -1 , -2] [ -3 , -4] , [ -5] , [ -5]
    //2 Output : -5
    //Primer c)
    //1 Input : [5] , [2] , [3] , [4]
    //2 Output : 2
    //Primer d)
    //1 Input : [1] , [1] , [1] , [1]
    //2 Output : 1


    static int najmanjiOdCetiri (int [] niz1, int [] niz2, int [] niz3, int [] niz4) {


        int [] sviUkupno = new int [niz1.length + niz2.length + niz3.length + niz4.length];
        int brojac = 0;

        for (int i: niz1) {
            sviUkupno[brojac] = i;
            brojac++;
        }
        for (int i: niz2) {
            sviUkupno[brojac] = i;
            brojac++;
        }
        for (int i: niz3) {
            sviUkupno[brojac] = i;
            brojac++;
        }
        for (int i: niz4) {
            sviUkupno[brojac] = i;
            brojac++;
        }
        int najmanji = sviUkupno[0];
        for (int i = 1; i < sviUkupno.length; i++) {
            if (sviUkupno[i]<najmanji){
            najmanji=sviUkupno[i];}
        }
        return najmanji;
        }

    public static void main(String[] args) {

        //[1 , 2 , 3 , 4 , 5] , [6 , 7 , -1 , 0] , [9 , 10] ,[11 , 12]
        int [] n1 = {1 , 2 , 3 , 4 , 5};
        int [] n2 = {6 , 7 , -1 , 0};
        int [] n3 = {9 , 10};
        int [] n4 = {11,12};
        int min1 = najmanjiOdCetiri(n1,n2,n3,n4);
        System.out.println(min1);
    }
}
