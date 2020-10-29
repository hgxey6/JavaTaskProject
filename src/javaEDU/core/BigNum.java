package javaEDU.core;

import java.math.BigInteger;


public class BigNum {
    public static void main(String[] args) {
        BigInteger a = BigInteger.valueOf(666_445_414);
        BigInteger b = BigInteger.valueOf(405_833_426);
        System.out.println(a.multiply(b));
    }
}
