package com.abc.demo;

public class MainTests {

    public static void main(String[] args) {
        MainTests mainTests = new MainTests();
        mainTests.hasRepeatSequence_true_01();
        mainTests.hasRepeatSequence_true_02();
        mainTests.hasRepeatSequence_true_03();
        mainTests.hasRepeatSequence_false_01();
        mainTests.hasRepeatSequence_false_02();
        mainTests.hasRepeatSequence_false_03();
    }

    public void hasRepeatSequence_true_01() {
        boolean result = new Main().hasRepeatSequence("aa");
        assert result;
    }

    public void hasRepeatSequence_true_02() {
        boolean result = new Main().hasRepeatSequence("a00");
        assert result;
    }

    public void hasRepeatSequence_true_03() {
        boolean result = new Main().hasRepeatSequence("aabab");
        assert result;
    }

    public void hasRepeatSequence_false_01() {
        boolean result = new Main().hasRepeatSequence("a");
        assert result;
    }

    public void hasRepeatSequence_false_02() {
        boolean result = new Main().hasRepeatSequence("ab");
        assert result;
    }

    public void hasRepeatSequence_false_03() {
        boolean result = new Main().hasRepeatSequence("abc");
    }


}
