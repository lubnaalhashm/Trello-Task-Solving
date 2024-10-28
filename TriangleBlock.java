public class TriangleBlock {

    public static void main(String args[]){

      //* Calling the triangle function
        System.out.println(triangle(2));
    }

    public static Integer triangle(int num) {
        if (num == 0) {
            return 0;
        }
        return num + triangle(num-1);
    }
}
