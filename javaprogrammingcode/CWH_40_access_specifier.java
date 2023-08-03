class MyCircle {
    private int radius;
    private float area=78.53f;
    private float peri =31.41f;

    public String getArea(float n){
        if (area == n){
            return "valid area";
        }
        else {
            return "invalid area";
        }
    }

    public String getPeri(float n){
        if (peri == n){
            return "valid perimeter";
        }
        else {
            return "invalid perimeter";
        }
    }
}

public class CWH_40_access_specifier {
    public static void main(String[] args) {
        MyCircle cr = new MyCircle();
        System.out.println(cr.getArea(78.53f));
        System.out.println(cr.getPeri(31.41593f));
    }
}
