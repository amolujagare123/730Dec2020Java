package Miseleneous;

public class ReturningArray {


    int[] getMyArray() // single dimentional array
    {
        int[] a = {34,6,21,34,12,231,32};
        return  a;
    }

    String[][] getMyTwoDArrary()
    {
       String[][] s = {

               {"abc1","pqr1","lmn1","xyz1"},
               {"abc2","pqr2","lmn2","xyz2"},
               {"abc3","pqr3","lmn3","xyz3"}
       };

        return  s;
    }

    public static void main(String[] args) {

        ReturningArray ob = new ReturningArray();

        int[] myArray = ob.getMyArray();

        for(int i=0;i<myArray.length;i++)
            System.out.print(myArray[i]+" ");

        System.out.println("\nTwo Dimentional String array");

        String[][] sArr = ob.getMyTwoDArrary();

        for(int i=0;i<sArr.length;i++)
        {
            for(int j=0;j<sArr[0].length;j++)
            {
                System.out.print(sArr[i][j]+" ");
            }
            System.out.println();
        }


    }


}
