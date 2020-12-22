package Miseleneous;

import pack1.Java1;

public class ArrayArgument {

    void getArray(int[] a)
    {
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");

        System.out.println();
    }

    void getTwoDArray(String[][] stArr)
    {
        int row = stArr.length;
        int col = stArr[0].length;

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col ;j++)
            {
                System.out.print(stArr[i][j]+" ");
            }
            System.out.println();
        }
    }

    void setObject(Java1 obj)
    {
        obj.a1 = 12;
        obj.d1 = 12.5;
        obj.str1 ="str is a variable";

    }

    public static void main(String[] args) {

        ArrayArgument ob = new ArrayArgument();

        int[] arr = {23,43,1,4,2334,21,12,55,10};

        ob.getArray(arr);

        String[][] s = { // 4 x 3 array
                {"abc1","pqr1","xyz1"},
                {"abc2","pqr2","xyz2"},
                {"abc3","pqr3","xyz3"}
        };

        ob.getTwoDArray(s);

        Java1 java1 = new Java1();
        java1.display1(); // before method call

        ob.setObject(java1);

        java1.display1(); // after method call
    }
}
