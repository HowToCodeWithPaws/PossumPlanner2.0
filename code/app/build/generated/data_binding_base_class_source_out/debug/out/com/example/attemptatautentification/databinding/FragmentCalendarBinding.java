// Generated by view binder compiler. Do not edit!
package com.example.attemptatautentification.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.example.attemptatautentification.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCalendarBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button addDeadlineCalendar;

  @NonNull
  public final CalendarView calendarView;

  @NonNull
  public final RecyclerView rvListCalendar;

  private FragmentCalendarBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button addDeadlineCalendar, @NonNull CalendarView calendarView,
      @NonNull RecyclerView rvListCalendar) {
    this.rootView = rootView;
    this.addDeadlineCalendar = addDeadlineCalendar;
    this.calendarView = calendarView;
    this.rvListCalendar = rvListCalendar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCalendarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCalendarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_calendar, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCalendarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addDeadlineCalendar;
      Button addDeadlineCalendar = rootView.findViewById(id);
      if (addDeadlineCalendar == null) {
        break missingId;
      }

      id = R.id.calendarView;
      CalendarView calendarView = rootView.findViewById(id);
      if (calendarView == null) {
        break missingId;
      }

      id = R.id.rv_list_calendar;
      RecyclerView rvListCalendar = rootView.findViewById(id);
      if (rvListCalendar == null) {
        break missingId;
      }

      return new FragmentCalendarBinding((ConstraintLayout) rootView, addDeadlineCalendar,
          calendarView, rvListCalendar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
