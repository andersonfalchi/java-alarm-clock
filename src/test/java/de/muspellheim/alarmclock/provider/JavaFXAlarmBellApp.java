/*
 * Copyright (c) 2018 Falko Schumann
 * Licensed under the terms of the MIT License.
 */

package de.muspellheim.alarmclock.provider;

import java.util.concurrent.*;

public class JavaFXAlarmBellApp {

    public static void main(String[] args) throws Exception {
        JavaFXAlarmBell bell = new JavaFXAlarmBell();
        bell.ring();

        TimeUnit.SECONDS.sleep(3);
    }

}
