package math;

public class ReverseInteger {

    //7. Reverse Integer

    //Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
    //
    //Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int tail = x % 10;
            result = result * 10 + tail;
            x = x / 10;

            if (result % 10 != tail) {
                return 0;
            }

        }
        return result;
    }

}
