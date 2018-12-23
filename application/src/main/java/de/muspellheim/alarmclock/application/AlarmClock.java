/*
 * Alarm Clock
 * Copyright (c) 2018 Falko Schumann
 */

package de.muspellheim.alarmclock.application;

import de.muspellheim.alarmclock.domain.*;
import de.muspellheim.alarmclock.provider.*;
import javafx.application.*;
import javafx.stage.*;

import java.util.*;

/**
 * The application integrates the {@link Head}, the {@link Body} and providers and run the app.
 */
public class AlarmClock extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        var alarmBell = createAlarmBell();
        var body = new Body(alarmBell);
        var head = new Head(body, primaryStage);
        head.run();
    }

    private AlarmBell createAlarmBell() {
        return ServiceLoader.load(AlarmBell.class).findFirst().get();
    }

}
