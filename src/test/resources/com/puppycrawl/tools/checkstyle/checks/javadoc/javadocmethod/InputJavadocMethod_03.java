package com.puppycrawl.tools.checkstyle.checks.javadoc.javadocmethod;

/**
 * Config: default
 */
public class InputJavadocMethod_03 {

    /** Do 1.
     * @throws TestException1 when problem occurs.
     * @throws TestException2 when problem occurs.
     */
    public void doStuff1() throws TestException1, TestException2 { // ok
        try {
            doStuff2();
        } catch (final TestException2 e) { }
        throw new InputJavadocMethod_03().new TestException1(""); // ok
    }
    /** Do 2.
     * @throws TestException2 when problem occurs.
     */
    private static void doStuff2() throws TestException2 { // ok
        throw new TestException2(""); // ok
    }
    /** Exception 1.
     */
    class TestException1 extends Exception { // ok
        /** Exception 1.
         * @param messg message
         */
        TestException1(String messg) { // ok
            super(messg);
        }
    }
    /** Exception 2.
     */
    public static class TestException2 extends Exception { // ok
        /** Exception 2.
         * @param messg message
         */
        TestException2(String messg) { // ok
            super(messg);
        }
    }
}
