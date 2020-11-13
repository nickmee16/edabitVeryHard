import java.util.ArrayList;
import java.util.Arrays;

public class MultiDimensionalArrayIntoSingleDimensionalArray {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(flatten(new Object[]{new Object[] {17.2, 500, "code"}, "generate"})));
        System.out.println(Arrays.toString(flatten(new Object[]{new Object[] {new Object[] {new Object[] {new Object[] {2, 14, "core"}}}, 2, 3, 4}})));
        System.out.println(Arrays.toString(flatten(new Object[]{0, new Object[]{12, "recurrence", new Object[]{new Object[]{2}}}})));
//        System.out.println(Arrays.toString(flatten(new Object[]{new Object[] {17.2, 500, "code"}, "generate"})));

    }

    public static Object[] flatten(Object[] arr) {
        ArrayList<Object> newStuff = new ArrayList<>();
        ArrayList<Object> objects = checkArr(arr, newStuff);
        Object[] objectArr = new Object[objects.size()];

        for(int i = 0; i < objectArr.length; i++) {
            objectArr[i] = objects.get(i);
        }

        return objectArr;
    }

    public static ArrayList<Object> checkArr(Object[] arr, ArrayList<Object> objects) {

        for(int i = 0; i < arr.length; i++) {

            if(arr[i].getClass().isArray()) {
                checkArr((Object[]) arr[i], objects);
            } else {
                if(!arr[i].equals("") && !arr[i].equals(" ")) {
                    objects.add(arr[i]);
                }
            }
        }

        return objects;
    }
}
