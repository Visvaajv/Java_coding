class Solution {
    public static boolean checkDivisibility(int n) {
        int original = n;
        int digitSum = 0;
        int digitProduct = 1;
        while(n > 0){
            int digit = n % 10;
            digitSum += digit;
            digitProduct *= digit;
            n /= 10;
        }
        int total = digitSum + digitProduct;
        return original % total == 0;
    }
    public static void main(String[] args){
        int n1 = 99;
        int n2 = 23;
        System.out.println(checkDivisibility(n1));
        System.out.println(checkDivisibility(n2));
    }
}
