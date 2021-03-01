package com.sultana.lambdachecker;

public class OperationChecker {
    public boolean checker(Operation p, int num) {
        return p.check(num);
    }

    public Operation is_odd() {
        return n -> (n & 1) == 1;
    }

    public Operation is_Prime() {
        return n -> {
            if (n < 2) {
                return false;
            }
            int sqrt = (int) Math.sqrt(n);
            for (int i = 2; i <= sqrt; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };
    }

    public Operation is_Palindrome() {
        return n -> {
            String original = Integer.toString(n);
            String reversed = new StringBuilder(Integer.toString(n)).reverse().toString();
            return original.equals(reversed);
        };
    }
}
