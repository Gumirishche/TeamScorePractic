package task2.first;

import javax.xml.crypto.Data;

public class A {
    public String varA1 = "aaa";
    public int varA2;

    public int getVarA2() {
        return varA2;
    }

    public void setVarA2(int varA2) {
        if (varA2 >= 0 && varA2 < 100) {
            this.varA2 = varA2;
        }
    }

    public int foo(Data dt) {
        return 4;
    }

    public void buzz() {
    }
}
