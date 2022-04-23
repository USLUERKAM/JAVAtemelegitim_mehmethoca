package day22_multiDimentionalArrays;

public class C02_MDArrays {
    public static void main(String[] args) {
        // verilen multidimentional array'in tum elementlerinin toplamini bulunuz

        int arr[][]={{3,1,7},{6,10,2}};
        int toplam=0;
        for (int i = 0; i < arr.length; i++) {//outer length
            for (int j = 0; j < arr[i].length; j++) {
                toplam+=arr[i][j];
            }
        }
        System.out.println("arraydaki elementler toplami = "+ toplam);
    }
}
