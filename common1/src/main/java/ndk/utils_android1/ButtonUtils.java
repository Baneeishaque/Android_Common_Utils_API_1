package ndk.utils_android1;

import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class ButtonUtils {

    public static void associateButtonWithIncrementedTimeStampOfOneMinute(Button buttonDate, Calendar calendar) {

        associateButtonWithIncrementedTimeStampOfMinutes(buttonDate, calendar, 1);
    }

    public static void associateButtonWithIncrementedTimeStampOfFiveMinutes(Button buttonDate, Calendar calendar) {

        associateButtonWithIncrementedTimeStampOfMinutes(buttonDate, calendar, 5);
    }

    public static void associateButtonWithIncrementedTimeStampOfMinutes(Button buttonDate, Calendar calendar, int minutesToAdd) {

        calendar.setTime(org.apache.commons.lang3.time.DateUtils.addMinutes(calendar.getTime(), minutesToAdd));
        associateButtonWithTimeStamp(buttonDate, calendar);
    }

    public static void associateButtonWithTimeStamp(Button buttonDate, Calendar calendar) {

        buttonDate.setText(DateUtils.normalDateTimeFormatWords.format(calendar.getTime()));
    }

    public static Button associateClickAction(AppCompatActivity currentAppCompatActivity, int buttonId, View.OnClickListener onClickListener) {

        Button button = currentAppCompatActivity.findViewById(buttonId);
        button.setOnClickListener(onClickListener);
        return button;
    }

}
