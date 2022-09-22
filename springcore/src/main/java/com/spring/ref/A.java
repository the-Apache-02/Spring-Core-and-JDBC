
package com.spring.ref;

import java.util.logging.Logger;

public class A {
    private int a;
private B ob;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public B getOb() {
        return ob;
    }

    public void setOb(B ob) {
        this.ob = ob;
    }
    public A() {
        super();
    }

    public String toString() {
        return "A[a=" + a + "obj=" + ob + "]";
    }
 
}
