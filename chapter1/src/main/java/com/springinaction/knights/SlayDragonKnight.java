package com.springinaction.knights;

import java.io.PrintStream;

/**
 * @author jiangqw
 * @date 2019/11/5 13:29
 */
public class SlayDragonKnight implements Quest {
    private PrintStream printStream;

    public SlayDragonKnight(PrintStream printStream) {
        this.printStream = printStream;
    }

    public void embark() {
        printStream.println("Embarking on quest to slay the dragon!");
    }
}
