package Toys;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
            ToyStore gep = new ToyStore();
            gep.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball");
            System.out.println(gep);
            System.out.println(gep.getMostFrequentToy());
            gep.getToy("ball").add();
            System.out.println(gep);
            gep.sortToysByCount();
            System.out.println(gep);
            gep.sortToysByCount();
            System.out.println(gep);
            gep.sortToysByCount();
            System.out.println(gep);
            
	}
}