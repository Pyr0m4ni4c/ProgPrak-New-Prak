package prog.prak;

public class Calculator {


    public static int[] calcArr(int[] arr1, int[] arr2, operators op){
        int[] res = new int[arr1.length];

        if(arr1.length != arr2.length){
            if(arr1.length < arr2.length){
                arr1 = modArr(arr1, arr2.length);
            }else{
                arr2 = modArr(arr2, arr1.length);
            }
        }else {
            for (int i = 0; i < arr1.length; i++) {
                switch (op) {
                    case A:
                        res[i] = arr1[i] + arr2[i];
                        break;
                    case S:
                        res[i] = arr1[i] - arr2[i];
                        break;
                    case M:
                        res[i] = arr1[i] * arr2[i];
                        break;
                    case D:
                        res[i] = arr1[i] / arr2[i];
                        break;
                }
            }
        }
        return res;
    }

    private static int[] modArr(int[] smallerArr, int lenMax){
        int[] newArr = new int[lenMax];
        int i;
        for(i = 0; i < smallerArr.length; i++){
            newArr[i] = smallerArr[i];
        }
        while(i < lenMax){
            newArr[i] = 0;
            i++;
        }
        return newArr;

    }
}
