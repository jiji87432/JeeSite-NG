package com.thinkgem.jeesite.test;

import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Ordering;

public class GuavaTest {

    public static void main(String[] args) {
        int s = ComparisonChain.start()
                .compare(4, 1)
                .result();
        System.out.printf(String.valueOf(s));
    }
}
