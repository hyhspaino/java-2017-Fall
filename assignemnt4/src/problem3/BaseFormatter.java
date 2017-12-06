package problem3;

public class BaseFormatter implements NumberFormatter {
    int base;

    public String format(int n) {

        if (n < 0) {
            n = -n;
        }
        this.transform(n, base);

        return "";
    }

    public BaseFormatter(int n) {
        this.base = n;
    }

    public void transform(int num, int n) {
        //参数num为输入的十进制数，参数n为要转换的进制  
        int array[] = new int[100];
        int location = 0;
        while (num != 0) {//当输入的数不为0时循环执行求余和赋值  
            int remainder = num % n;
            num = num / n;
            array[location] = remainder;//将结果加入到数组中去  
            location++;
        }
        show(array, location - 1);

    }

    private void show(int[] arr, int n) {

        for (int i = n; i >= 0; i--) {
            if (arr[i] > 9) {
                System.out.print((char) (arr[i] + 55));
            } else
                System.out.print(arr[i] + "");
        }
    }
}
