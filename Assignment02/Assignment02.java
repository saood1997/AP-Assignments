

class Assignment02{

    public static void main(String[] args) {
         
        Runnable countEven =()->{
            int count_Even = 0;
            for(int i = 1; i < 1000; i++){
                if (i%2 == 0){
                    count_Even += 1;
                }
            }
            System.out.println("Total Even Numbers = "+count_Even);
        };
        

        Runnable countPrime =()->{
            int count_Prime = 0;
            for(int i = 1; i < 1000; i++){
                if(i == 1){
                    continue;
                }
                if (CheckPrime(i) == true){
                    count_Prime += 1;
                }
            }
            System.out.println("Total Prime Numbers = "+count_Prime);
        };

        new Thread(countEven).start();
        new Thread(countPrime).start();

    }
    public static boolean CheckPrime(int number){
        if(number == 1){
            return false;
        }
        for(int i = 2; i<number; i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

}