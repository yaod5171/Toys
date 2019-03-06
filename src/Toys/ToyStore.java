package Toys;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;
        private ArrayList<String> toyNames;

	public ToyStore()
	{
            toyList = new ArrayList();
            toyNames = new ArrayList();
	}

	public void loadToys( String toys )
	{
            Scanner scanToys = new Scanner(toys);
            while (scanToys.hasNext()) {
               String newToyName = scanToys.next();
               addToy(newToyName);
            }
	}
        
        public void addToy( String toy )
        {
            int ind = toyNames.indexOf(toy);
            if (ind == -1) {
                toyList.add(new Toy(toy));
                toyNames.add(toy);
            }
            else {
                toyList.get(ind).add();
            }
        }
  
  	public Toy getToy( String nm )
  	{
            int ind = toyNames.indexOf(nm);
            return toyList.get(ind);
  	}
  
  	public Toy getMostFrequentToy()
  	{
            Toy MFT = toyList.get(0);
            
            for (Toy t: toyList) {
                if (t.getCount() > MFT.getCount()) {
                    MFT = t;
                }
            }
            return MFT;
  	}  
  
  	public void sortToysByCount()
  	{
            ArrayList<Toy> sorted = new ArrayList();
            
            for (int count = 1; toyList.size() > 0; count++) {
                ArrayList<Toy> oldToyList = new ArrayList();
                oldToyList.addAll(toyList);
                for (Toy t: oldToyList) {
                    if (t.getCount() == count) {
                        sorted.add(t);
                        toyList.remove(t);
                    }
                }
            }
            
            toyList = new ArrayList();
            for (int i = sorted.size(); i > 0; i--) {
                toyList.add(sorted.get(i-1));
            }
  	}  
  	  
	public String toString()
	{
	   return "" + toyList;
	}
}