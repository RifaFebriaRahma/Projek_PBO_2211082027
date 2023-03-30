/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rifa300323;

/**
 *
 * @author LABP1KOMP
 */
public class TestPassByValue {
    public static void main (String[] args){
        int i = 10;
        
        //mencetak nilai i
        System.out.println(i);
        
        //memanggil method test
        //pssing i pada method test
        test(i);
        
        //mencetak nilai i
        System.out.println(i);
        }
        
        public static void test(int j){
        //merubah nilai parameter j
        j = 33;
        }
    }
