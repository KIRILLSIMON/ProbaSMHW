public class Scratch {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        System.out.println("Reshenie 1y i 2y zadach po 2mu uroku massivov");
        int sum = 0;
        for (int paymentPerDay = 0; paymentPerDay < arr.length; paymentPerDay++) {
            sum += arr[paymentPerDay];
            System.out.println("Сумма трат за месяц составила " + sum + " рублищ");
            int min = 200_001;
            int max = 99_999;
            for (int paymentPerDay; arr) {
                if (paymentPerDay < min) {
                    min = paymentPerDay;
                }
                if (paymentPerDay > max) {
                    max = paymentPerDay;
                    System.out.println("Reshenie 3y zadachi 2go MASSIVnogo uroka");
    System.out.println("Mинимальная сумма трат в день равна "+min+"рублей.Максимальная сумма трат в день равна "+max);
                }
        /* for(int i=0;i<arr.lenght;i++){
        if(arr[i]<min){
        min=arr[i];}
        } if (arr[i]>max){
        max=arr[i];}
         */
            }double average=double sum/arr.length;
            System.out.println("Средняя сумма трат за месяц составила_рублИЩ");

        }


        public static int[] generateRandomArray () {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;

        }
        System.out.println("Reshenie 4y zadachi 2go MASSIVnogo uroka");
        char[] reverseFullName={'n','a','v','I','v','o','n','a','v','I'};
        for(int i=reverseFullName.length-1;i>=0;i--){
            System.out.println(reverseFullName[i]);
        }












    }
}
