public class CWH_29_PracticeSet {
    public static void main(String[] args) {
        //que 1
//        float [] arr1 = {10.5f,20.5f,30.5f,40.0f};
//        float sum = 0;
//        for (int i=0; i < arr1.length; i++){
//            sum = sum + arr1[i];
//        }
//        System.out.println("sum of all the numbers is "+ sum);


        //que 2
//        int [] marks = {10,20,30,40};
//        int num = 20;
//        for (int i=0; i < marks.length; i++){
//            if ( num == marks[i] ){
//                System.out.println("match found at " + (i + 1) + "nd position");
//            }
//        }


        //que 3
//        int [] marks = {10,20,30,40};
//        int total=0;
//        for (int element : marks){
//            total = total + element;
//        }
//        int avg= total/4;
//        System.out.println("average is "+ avg);


        //que 4
//        int [][] matx1 = {{1,3,5},
//                          {2,0,5}};
//        int [][] matx2 = {{2,0,1},
//                          {0,2,7}};
//        int [][] result = {{0,0,0},
//                {0,0,0}};
//
//        for (int i =0; i<matx1.length ; i++){
//            for (int j =0; j<matx1[i].length ; j++){
//                result[i][j] = matx1[i][j] + matx2[i][j];
//                System.out.format("the value of %d row and %d column index of resultant matrix are %d  \n", i, j, result[i][j]);
//            }
//        }
//
//        for (int i =0; i<matx1.length ; i++){
//            for (int j =0; j<matx1[i].length ; j++){
//                result[i][j] = matx1[i][j] + matx2[i][j];
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println("");
//        }


        //que 5
//        int [] marks = {10,20,30,40};
//        int size =(marks.length-1);
//        int [] rev = new int[4];
//        for (int i=0; i < marks.length; i++){
//            rev[size] = marks [i];
//            size--;
//        }
//        System.out.println("this is modified array ");
//        for (int i=0; i < rev.length; i++){
//            System.out.print(rev[i]);
//            System.out.print(" ");
//        }
//        System.out.println("");


        //que 6
//        int [] marks = {100,20,300,40};
//        int greatNo=marks[0];
//        for (int i=0; i < marks.length; i++){
//            if (i>0){
//                if( marks[i] > greatNo){
//                    greatNo = marks[i];
//                }
//            }
//        }
//        System.out.println("greatest num is "+ greatNo);



        //que 7
//        int [] marks = {10,28,4,2};
//        int minNo=marks[0];
//        for (int i=0; i < marks.length; i++){
//            if (i>0){
//                if( marks[i] < minNo){
//                    minNo = marks[i];
//                }
//            }
//        }
//        System.out.println("minimum num is "+ minNo);


        //que 8
//        int [] marks = {10,20,30,400};
//        int greatNo=marks[0];
//        for (int i=0; i < marks.length; i++){
//            if (i>0){
//                if( marks[i] > greatNo){
//                    greatNo = marks[i];
//                }
//            }
//        }
//        if (greatNo == marks[marks.length-1]){
//            System.out.println("array is sorted");
//        }
//        else {
//            System.out.println("array is not sorted");
//        }
    }
}
