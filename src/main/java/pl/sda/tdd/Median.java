package pl.sda.tdd;

import java.util.Arrays;

public class Median {

        public Integer find(int[]tab){
            if (tab==null || tab.length==0){
                return  null;
            }
            if(tab.length % 2==0){
                return  tab[(tab.length -1)/2];
            }
            return tab[tab.length/2];
           // return null;
        }
    }

