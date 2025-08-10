class Solution {
    public int solution(int n, int k) {
        String kBaseNumber = convertToKBase(n, k);
        String[] candidates = kBaseNumber.split("0");
        
        int count = 0;
        for (String candidate : candidates) {
            if (!candidate.isEmpty() && isPrime(Long.parseLong(candidate))) {
                count++;
            }
        }
        
        return count;
    }
    
    private String convertToKBase(int n, int k) {
        if (n == 0) return "0";
        
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % k);
            n /= k;
        }
        
        return sb.reverse().toString();
    }
    
    private boolean isPrime(long num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        
        for (long i = 3; i * i <= num; i += 2) {
            if (num % i == 0) return false;
        }
        
        return true;
    }
}