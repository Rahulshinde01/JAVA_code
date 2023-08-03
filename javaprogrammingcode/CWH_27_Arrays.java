public class CWH_27_Arrays {
    public static void main(String[] args) {
        int [] marks = {10,20,30,40};
//        System.out.println(marks[2]);

        //method 1
        for (int i=0; i < marks.length; i++){
            System.out.println(marks[i]);
        }

        //method 2
        for(int element : marks){
            System.out.println(element);
        }
    }
}
