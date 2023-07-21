import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;
import java.util.*;


public class TenDigitSorting {
    static void tenSort(Vector<String> arr)
    {
        Collections.sort(arr, new Comparator<String>()
        {

            @Override public int compare(String X, String Y)
            {
                System.out.println(X+" "+Y);
                if(X.length()>Y.length()){
                    return 1;
                }
                if(X.charAt(0)==Y.charAt(0)) {

                    return X.compareTo(Y) > 0 ? -1 : 1;
                }
                return -1;
            }
        });

        Iterator it = arr.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        //System.out.println(arr.get(0));
    }






    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        Vector<String> arr;
        arr = new Vector<>();



        for (int i=0;i<size;i++) {
            arr.add(scan.next());
        }

        tenSort(arr);

    }

}
