// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
// (произведение чисел от 1 до n)

public class hw1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
      int[] arr = new int[6]; // можно задать любое кол-во элементов
      int[] newarr = new int[6]; // массив для полученых чисел от одного до n
      int temp = 0;
      for (int i = 1; i < arr.length; i++) { //1, 3, 6, 10, 15
        arr[i] += temp;
        temp ++;
        arr[i] = temp + arr[i-1];
        newarr[i] = arr[i];
      }   
      int res = 1;
      int fini = 0;
      for (int i = 1; i < newarr.length; i++) {
       res = res * newarr[i];
       fini = res;// 2700
      }
      System.out.print(fini); 
    }

 }
