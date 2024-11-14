package Bilet_22_universalSortingClass;

public class UniversalSortingClass {
    public static void sort(Comparable[] a) {
        Comparable temp;
        for (int i = a.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j].compareTo(a[j+1])>0){
                    temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] arr = new String[5];
        arr[0]="ca";
        arr[1]="da";
        arr[2]="ea";
        arr[3]="aa";
        arr[4]="ba";

//        Integer[] arr = new Integer[5];
//        arr[0]=4;
//        arr[1]=2;
//        arr[2]=3;
//        arr[3]=1;
//        arr[4]=7;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        sort(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
