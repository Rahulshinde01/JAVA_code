public class CWH_26_Arrays {
    public static void main(String[] args) {
        // types of data declaration , memory allocation  and initialization
        //1--
        int [] data;
        data = new int [5];
        data [0]= 125;
        data [4]=200;
        System.out.println(data[0] +"\n" + data[4]);
        //2--
        int [] data1 =new int [7];
        data1 [1]= 154;
        data1 [6]=354;
        System.out.println(data1[1] +"\n" + data1[6]);
        //3--
        int [] data2 = {10,20,30,40};
        System.out.println(data2[0] +"\n" + data2[2]);


    }
}
